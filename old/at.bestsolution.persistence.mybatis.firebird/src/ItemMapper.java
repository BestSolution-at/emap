import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.bizerba.basic.model.basic.BasicFactory;
import com.bizerba.basic.model.basic.Lang;
import com.bizerba.retail.model.retail.item.Item;
import com.bizerba.retail.model.retail.item.ItemFactory;
import com.bizerba.retail.model.retail.item.ItemImage;
import com.bizerba.retail.model.retail.item.nls.ItemTexts;
import com.bizerba.retail.model.retail.item.nls.NlsFactory;

public class ItemMapper {


	public String loadSQL() throws IOException {
		StringBuilder b = new StringBuilder();
		byte[] buf = new byte[1024];
		int l;
		InputStream in = MyTest.class.getResourceAsStream("my.sql");
			while( (l = in.read(buf)) != -1 ) {
				b.append(new String(buf,0,l));

			}
			return b.toString();
	}

	public Connection createConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.firebirdsql.jdbc.FBDriver");
		return DriverManager.getConnection("jdbc:firebirdsql://127.0.0.1:3050/C:\\bizerba\\targets\\targets\\dbs\\RETAILFRAMEWORK_BASELINE.FDB?charSet=UTF-8", "RETAILADMIN", "170306");
	}

	private Map<Long, Item> itemCache = new HashMap<Long, Item>();
	private Map<Long, ItemImage> imageCache = new HashMap<Long, ItemImage>();
	private Map<Long, Lang> langCache = new HashMap<Long, Lang>();
	private Map<Long, ItemTexts> itemTextsCache = new HashMap<Long, ItemTexts>();

	public Item mapItem(ResultSet rs) throws SQLException {
		long sid = rs.getLong("SID_ITEM");

		if (itemCache.containsKey(sid)) {
			Item item = itemCache.get(sid);

			// resolve 1:n

			// images
			item.getImages().add(mapImage(rs));

			// ItemTexts
			item.getTexts().add(mapItemTexts(rs));

			return item;
		}
		else {
			Item item = ItemFactory.eINSTANCE.createItem();

			// direct
			item.setSid(sid);
			item.setCodeContent(rs.getString("CODECONTENT"));
			item.setId(rs.getString("ID"));
			item.setLabelControlNumber(rs.getInt("LABELCONTROLNUMBER"));
			item.setLogo1(rs.getInt("LOGO1"));
			item.setLogo2(rs.getInt("LOGO1"));
			item.setLogo3(rs.getInt("LOGO1"));
			item.setSellingPriceType(rs.getString("SELLINGPRICETYPE"));

			item.setCreateUser(rs.getString("i_CREATEUSER"));
			item.setCreateDate(rs.getDate("i_CREATEDATE"));
			item.setCreateWS(rs.getString("i_CREATEWS"));

			item.setChangeUser(rs.getString("i_CHANGEUSER"));
			item.setChangeDate(rs.getDate("i_CHANGEDATE"));
			item.setChangeWS(rs.getString("i_CHANGEWS"));

			// 1:1
			// (nothing??)

			// images
						item.getImages().add(mapImage(rs));

						// ItemTexts
						item.getTexts().add(mapItemTexts(rs));

			itemCache.put(sid, item);
			return item;
		}
	}

	public Lang mapLang(ResultSet rs) throws SQLException {
		long sid = rs.getLong("la_SID_LANG");

		if (langCache.containsKey(sid)) {

			// resolve 1:n
			// (nothing)

			return langCache.get(sid);
		}
		else {
			Lang la = BasicFactory.eINSTANCE.createLang();

			// direct
			la.setSid(sid);
			la.setGuid(rs.getString("la_GUID"));

			la.setLanguageCode(rs.getString("la_LANGUAGECODE"));
			la.setCountryCode(rs.getString("la_COUNTRYCODE"));
			la.setVariant(rs.getString("la_VARIANT"));

			la.setCreateUser(rs.getString("la_CREATEUSER"));
			la.setCreateDate(rs.getDate("la_CREATEDATE"));
			la.setCreateWS(rs.getString("la_CREATEWS"));

			la.setChangeUser(rs.getString("la_CHANGEUSER"));
			la.setChangeDate(rs.getDate("la_CHANGEDATE"));
			la.setChangeWS(rs.getString("la_CHANGEWS"));

			// resolve 1:1
			// (nothing)

			langCache.put(sid, la);

			return la;
		}
	}

	public ItemTexts mapItemTexts(ResultSet rs) throws SQLException {
		long sid = rs.getLong("it_SID_ITEMTEXTS");
		if (itemTextsCache.containsKey(sid)) {
			ItemTexts it = itemTextsCache.get(sid);

			// resolve 1:n
			// (nothing)


			return it;
		}
		else {
			ItemTexts it = NlsFactory.eINSTANCE.createItemTexts();

			// direct
			it.setSid(sid);
			it.setGuid(rs.getString("it_GUID"));
			it.setName(rs.getString("it_NAME"));

			it.setCreateUser(rs.getString("it_CREATEUSER"));
			it.setCreateDate(rs.getDate("it_CREATEDATE"));
			it.setCreateWS(rs.getString("it_CREATEWS"));

			it.setChangeUser(rs.getString("it_CHANGEUSER"));
			it.setChangeDate(rs.getDate("it_CHANGEDATE"));
			it.setChangeWS(rs.getString("it_CHANGEWS"));

			// resolve 1:1
			it.setLang(mapLang(rs));

			itemTextsCache.put(sid, it);
			return it;
		}
	}

	public ItemImage mapImage(ResultSet rs) throws SQLException {
		long sid = rs.getLong("im_BINARYOBJECT_SID");
		if (imageCache.containsKey(sid)) {
			ItemImage img = imageCache.get(sid);

			// resolve 1:n

			return img;
		}
		else {
			ItemImage img = ItemFactory.eINSTANCE.createItemImage();

			// direct
			img.setSid(sid);
			img.setGuid(rs.getString("im_GUID"));
			img.setFile(rs.getBlob("im_FILE")); // TODO blob handling = ?
			img.setFilename(rs.getString("im_FILENAME"));
			img.setMimeType(rs.getString("im_MIMETYPE"));
			img.setTypeIdentifier(rs.getString("im_TYPEIDENTIFIER"));

			img.setCreateUser(rs.getString("im_CREATEUSER"));
			img.setCreateDate(rs.getDate("im_CREATEDATE"));
			img.setCreateWS(rs.getString("im_CREATEWS"));

			img.setChangeUser(rs.getString("im_CHANGEUSER"));
			img.setChangeDate(rs.getDate("im_CHANGEDATE"));
			img.setChangeWS(rs.getString("im_CHANGEWS"));

			// resolve 1:1

			imageCache.put(sid, img);

			return img;
		}
	}


	public void run() throws Exception {

		Connection c = createConnection();

		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery(loadSQL());

		long count = 0;

		long time = System.currentTimeMillis();
		List<Item> items = new ArrayList<Item>();
		Set<Long> itemSids = new HashSet<Long>();
		while (rs.next()) {
			count++;
			Item it = mapItem(rs);
			if (!itemSids.contains(it.getSid())) {
				items.add(it);
				itemSids.add(it.getSid());
			}
		}
		System.err.println("duration: " + (System.currentTimeMillis() - time)/1000.0 + "s");
		System.err.println(items.size());
		System.err.println(items.get(0));

		System.err.println("Count: " + count);
	}

	public static void main(String[] args) throws Exception {
		ItemMapper itemMapper = new ItemMapper();
		itemMapper.run();
	}

}