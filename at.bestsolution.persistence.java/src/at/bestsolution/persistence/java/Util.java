package at.bestsolution.persistence.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.text.StrLookup;
import org.apache.commons.lang.text.StrSubstitutor;

public class Util {
	public static class ProcessedSQL {
		public String sql;
		public List<String> dynamicParameterNames = new ArrayList<>();

		public ProcessedSQL(String sql, List<String> dynamicParameterNames) {
			this.sql = sql;
			this.dynamicParameterNames = dynamicParameterNames;
		}
	}
	public static final String loadFile(Class<?> clazz, String name) {
		InputStream inputStream = clazz.getResourceAsStream(name);
		if( inputStream == null ) {
			return null;
		}
		byte[] buf = new byte[1024];
		int l;
		StringBuilder b = new StringBuilder();
		try {
			while( (l = inputStream.read(buf)) != -1 ) {
				b.append(new String(buf,0,l));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b.toString();
	}

	public static final ProcessedSQL processSQL(String sql) {
		final List<String> dynamicParameterNames = new ArrayList<String>();
		String s = new StrSubstitutor(new StrLookup() {

			@Override
			public String lookup(String key) {
				dynamicParameterNames.add(key);
				return "?";
			}
		},"#{","}",'#').replace(sql);
		return new ProcessedSQL(s, dynamicParameterNames);
	}
}