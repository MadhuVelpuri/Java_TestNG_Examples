package webservices;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class HttpClientAll {

	public static void main(String args[]) {

		// This is request which we are sending to server
		String restURL_XML = "http://parabank.parasoft.com/parabank/services/bank/customers/12212/";

		// sending request and we are passing parameter in url itself
		String restURL_JSON = "http://api.qa00.medscape.com/contentsearchservice/profnews/search?q=*&page=0&size=2&client=mscpsrch";// "http://ip.jsontest.com/";//
																																	// http://api.openweathermap.org/data/2.5/weather?q=Amsterdam";

		try {
			// testStatusCode(restURL_XML);
			testStatusCode(restURL_JSON);
			// testMimeType(restURL_XML, "application/xml");
			testMimeType(restURL_JSON, "application/json");
			// testContent(restURL_XML, "lastName", "Smith");
			// testContentJSON(restURL_JSON, "ip", "103.206.115.6");//
			// 207.138.251.2
			// -VPN,
			// 103.206.115.6
			// - wifi
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} /*
			 * catch (SAXException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); } catch (ParserConfigurationException e) {
			 * // TODO Auto-generated catch block e.printStackTrace(); } catch
			 * (JSONException e) { // TODO Auto-generated catch block
			 * e.printStackTrace(); }
			 */
	}

	public static void testStatusCode(String restURL) throws ClientProtocolException, IOException {

		HttpUriRequest request = new HttpGet(restURL);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
		int response_code = httpResponse.getStatusLine().getStatusCode();
		System.out.println("Status Code for " + restURL + " is : " + response_code + "\n");
		Assert.assertEquals(response_code, HttpStatus.SC_OK);
	}

	public static void testMimeType(String restURL, String expectedMimeType)
			throws ClientProtocolException, IOException {

		HttpUriRequest request = new HttpGet(restURL);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);
		String response_type = httpResponse.getEntity().getContentType().toString();
		String mimeType = ContentType.getOrDefault(httpResponse.getEntity()).getMimeType().toString();
		System.out.println("Content type of " + restURL + " is " + response_type + "\n");
		System.out.println("Mime type of " + restURL + " is " + mimeType + "\n");
		System.out.println(EntityUtils.toString(httpResponse.getEntity(), "UTF-8"));
		Assert.assertEquals(expectedMimeType, ContentType.getOrDefault(httpResponse.getEntity()).getMimeType());
	}

	public static void testContent(String restURL, String element, String expectedValue)
			throws ClientProtocolException, IOException, SAXException, ParserConfigurationException {

		Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(restURL);
		NodeList nodelist = doc.getElementsByTagName(element);
		System.out.println(
				"Expected value from XML Repsonse from " + restURL + " is " + nodelist.item(0).getTextContent() + "\n");
		Assert.assertEquals(expectedValue, nodelist.item(0).getTextContent());
	}

	public static void testContentJSON(String restURL, String element, String expectedValue)
			throws ClientProtocolException, IOException, SAXException, ParserConfigurationException, JSONException {

		HttpUriRequest request = new HttpGet(restURL);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

		// Convert the response to a String format
		String result = EntityUtils.toString(httpResponse.getEntity());

		// Convert the result as a String to a JSON object
		JSONObject jo = new JSONObject(result);
		System.out.println("Expected value from JSON Repsonse from " + restURL + " is " + jo.getString(element) + "\n");

		Assert.assertEquals(expectedValue, jo.getString(element));

	}

}
