/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     ccaks <FIRSTNAME.LASTNAME@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.emap.formatting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;

public class SpacerTokenStream implements ITokenStream {

	public static final String POINT0 = "[[[POINT0]]]";
	public static final String POINT1 = "[[[POINT1]]]";
	
	private static int TAB_SIZE = 4;
	
	public static enum HolderType {
		HIDDEN,
		SEMANTIC
	}
	public static class Holder {
		HolderType type;
		EObject element;
		String value;
		/**
		 * @param type
		 * @param element
		 * @param value
		 */
		public Holder(HolderType type, EObject element, String value) {
			super();
			this.type = type;
			this.element = element;
			this.value = value;
		}
		
	}
	private ITokenStream out;
	private List<Holder> data = new ArrayList<Holder>();
	
	private Map<Holder, Integer> lenght = new HashMap<SpacerTokenStream.Holder, Integer>();
	
	private int maxSpace = 0;
	private String lineCache = "";
	
	private void push(HolderType type, EObject el, String text) {
		Holder h = new Holder(type, el, text);
		
		if (text.contains("\n")) {
			lineCache = "";
		}
		
		System.err.println("lineCache: " + lineCache);
		if (text.equals(POINT1)) {
			int size = lineCache.length();
			System.err.println("size: " + size);
			if (size > maxSpace) maxSpace = size;
			lineCache = "";
			lenght.put(h, size);
		}
		else {
			lineCache += text;
		}
		data.add(h);
	}
	
	private void flushHolders() throws IOException {
		for (Holder h : data) {
			switch (h.type) {
			case HIDDEN: {
				if (h.value.equals(POINT1)) {
					String value = "";
					for (int i = 0; i < Math.ceil((maxSpace - lenght.get(h)) / (double)TAB_SIZE) + 1; i++) {
						value += "\t";
					}
					out.writeHidden(h.element, value);
				}
				else {
					out.writeHidden(h.element, h.value); 
				}
				break;
			}
			case SEMANTIC: out.writeSemantic(h.element, h.value); break;
			}
		}
		
		data.clear();
		lenght.clear();
	}
	
	public SpacerTokenStream(ITokenStream out) {
		this.out = out;
	}
	
	@Override
	public void flush() throws IOException {
		flushHolders();
		out.flush();
	}

	@Override
	public void writeHidden(EObject grammarElement, String value) throws IOException {
		System.err.println("WRITE HIDDEN: " + value);
		push(HolderType.HIDDEN, grammarElement, value);
	}

	@Override
	public void writeSemantic(EObject grammarElement, String value) throws IOException {
		System.err.println("WRITE SEMANTIC: " + value);
		push(HolderType.SEMANTIC, grammarElement, value);
	}

}
