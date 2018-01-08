package webservices;

import java.io.FileReader;
import java.util.Iterator;

import org.json.JSONException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONCreation {

	public static void main(String a[]) throws JSONException {

		JSONCreation js11 = new JSONCreation();
		js11.create_Parse();
		// js11.parse_JSONFile();
	}

	public void parse_JSONFile() {

		JSONParser jsp = new JSONParser();
		try {

			Object obj = jsp.parse(new FileReader(System.getProperty("user.dir") + "//Sample.json"));

			JSONObject jso = (JSONObject) obj;

			System.out.println("JSON Object is : " + "\n" + jso);

			String name = (String) jso.get("name");
			System.out.println("Name is : " + name);

			long age = (long) jso.get("age");
			System.out.println("Age is : " + age);

			JSONArray jsa = (JSONArray) jso.get("messages");

			Iterator<String> iterator = jsa.iterator();
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
			}

			// Converting JSONArray to list
			/*
			 * List<String> arlist = new ArrayList<String>();
			 * 
			 * for (int i = 0; i < jsa.size(); i++) { arlist.add(jso..)
			 * 
			 * }
			 */
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void create_Parse() throws JSONException {
		JSONObject jso = new JSONObject();
		JSONObject jso1 = new JSONObject();
		JSONArray jsa = new JSONArray();

		jso.put("name", "Madhu");
		jso.put("mailID", "madhu.velpuri@gmail.com");
		jso.put("MobNo", "7036071540");
		jso1.put("madhu", jso);

		jsa.add(jso1);
		JSONObject jso2 = new JSONObject();
		jso2.put("velpuri", jsa);

		jsa.add(jso1);

		// jsa.put(1, jso1);

		System.out.println("Created JSON is....");
		System.out.println(jsa);

		System.out.println("Parsing the JSON...");

		JSONParser jsp = new JSONParser();

		// JSONObject js = new JSONObject();

		// System.out.println("Name is : " + js.get("name"));

	}
}