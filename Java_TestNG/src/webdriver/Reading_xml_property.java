package webdriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Reading_xml_property {

	/*
	 * For .properties file : sample.properties For .xml file : sample.xml file
	 * For parsing .xml file : sample_parser.xml file
	 */

	static String filename = "src/sample_parser.xml";
	Properties props = new Properties();
	FileInputStream fis = null;

	public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {

		Reading_xml_property rxp = new Reading_xml_property();
		if (filename.contains(".properties"))
			rxp.read_properties();
		else if (filename.contains(".xml") && !(filename.contains("parser")))
			rxp.read_xml();
		else
			read_parser();

		// rxp.read_xml_parsers();
	}

	public static void read_parser() throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dbuilder = builderFactory.newDocumentBuilder();
		Document doc = dbuilder.parse(filename);

		System.out.println("Root element is : " + doc.getDocumentElement().getNodeName());

		NodeList nlist = doc.getElementsByTagName("staff");

		for (int temp = 0; temp < nlist.getLength(); temp++) {
			Node nNode = nlist.item(temp);
			System.out.println("Current element is : " + nNode.getNodeName());
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				System.out.println("Staff id : " + eElement.getAttribute("id"));
				System.out
						.println("First Name : " + eElement.getElementsByTagName("firstname").item(1).getTextContent());// item(0)
																														// which
																														// gets
																														// 0th
																														// value
																														// with
																														// same
																														// tag
																														// naem
																														// firstname
				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

			}
		}
	}

	public void read_properties() throws IOException {
		fis = new FileInputStream(filename);
		props.load(fis);

		// reading properties form .properties file
		System.out.println("Reading properties from .properties file");
		String username = props.getProperty("Name");
		String surname = props.getProperty("Surname");
		System.out.println("My name is  " + username);
		System.out.println("Surname is  " + surname);

	}

	public void read_xml() throws InvalidPropertiesFormatException, IOException {
		fis = new FileInputStream(filename);
		props.loadFromXML(fis);

		// reading properties from xml file
		System.out.println("Reading properties from xml file");
		String username = props.getProperty("Name");
		String surname = props.getProperty("Surname");
		System.out.println("My name is  " + username);
		System.out.println("Surname is  " + surname);

	}

}
