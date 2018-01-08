package webservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthenticationException;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.auth.BasicScheme;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.testng.Assert;

public class Httppost {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		// TODO Auto-generated method stub
		// Httppost.PostMethod();
		Httppost.HttpPost();
	}

	public static void PostMethod() {
		HttpClient client = new HttpClient();
		client.getParams().setParameter("http.useragent", "Test Client");

		BufferedReader br = null;

		PostMethod method = new PostMethod("http://search.yahoo.com/search");
		method.addParameter("p", "\"java2s\"");

		try {
			int returnCode = client.executeMethod(method);
			System.out.println("Response Code is : " + returnCode);

			if (returnCode == HttpStatus.SC_NOT_IMPLEMENTED) {
				System.err.println("The Post method is not implemented by this URI");
				// still consume the response body
				method.getResponseBodyAsString();
			} else {
				br = new BufferedReader(new InputStreamReader(method.getResponseBodyAsStream()));
				String readLine;
				while (((readLine = br.readLine()) != null)) {
					System.out.println(readLine);
				}
			}
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			method.releaseConnection();
			if (br != null)
				try {
					br.close();
				} catch (Exception fe) {
				}
		}
	}

	public static void HttpPost() throws ClientProtocolException, IOException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost("http://www.example.com");

		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("username", "John"));
		params.add(new BasicNameValuePair("password", "pass"));
		httpPost.setEntity(new UrlEncodedFormEntity(params));

		CloseableHttpResponse response = client.execute(httpPost);
		System.out.println("Repsonse code is : " + response.getStatusLine().getStatusCode());
		Assert.assertEquals(response.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
		client.close();
	}

	public void httppost_authoraization() throws ClientProtocolException, IOException, AuthenticationException {
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost("http://www.example.com");

		httpPost.setEntity(new StringEntity("test post"));
		UsernamePasswordCredentials creds = new UsernamePasswordCredentials("John", "pass");
		httpPost.addHeader(new BasicScheme().authenticate(creds, httpPost, null));

		CloseableHttpResponse response = client.execute(httpPost);
		Assert.assertEquals(response.getStatusLine().getStatusCode(), HttpStatus.SC_OK);
		client.close();
	}
}
