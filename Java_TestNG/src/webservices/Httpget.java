package webservices;

import java.io.IOException;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.client.HttpClientBuilder;
import org.testng.Assert;

public class Httpget {
	static String expectedMimeType = "text/xml";// text/xml ,application/json
	static String endPoint = "http://www.webservicex.net/CurrencyConvertor.asmx?WSDL";
	static HttpUriRequest request = null;
	static HttpResponse httpResponse = null;

	public static void main(String ap[]) throws ClientProtocolException, IOException {
		// Create Object and pass the url
		request = new HttpGet(endPoint);
		// send the response or execute the request
		httpResponse = HttpClientBuilder.create().build().execute(request);

		testStatusCode(endPoint);

		testResponseType(endPoint);
	}

	public static void testStatusCode(String restURL) throws ClientProtocolException, IOException

	{
		// Verify the response code is equal to 200
		System.out.println("Status code of RestGet is : " + httpResponse.getStatusLine().getStatusCode());
		Assert.assertEquals(httpResponse.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
	}

	private static void testResponseType(String endPoint2) throws ClientProtocolException, IOException {

		testStatusCode(endPoint2);
		// Verify the response type
		System.out
				.println("Response Content Type : " + ContentType.getOrDefault(httpResponse.getEntity()).getMimeType());
		Assert.assertEquals(expectedMimeType, ContentType.getOrDefault(httpResponse.getEntity()).getMimeType());

	}

}
