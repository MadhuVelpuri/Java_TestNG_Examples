package com.pratice;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.w3c.dom.NamedNodeMap;
	
public class XML_Read_Wrte {

	/**
	 * @param args
	 * @throws ParserConfigurationException 
	 * @throws IOException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		// TODO Auto-generated method stub
		/*	
		File file= new File("D://Dev//E2E//Framework_Appium_JunOS//src//com//pratice//Sample.xml");
		DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
		DocumentBuilder dbl= dbf.newDocumentBuilder();
		Document doc= dbl.parse(file);
		doc.getDocumentElement().normalize();
		NodeList nl= doc.getChildNodes();
		Node node= nl.item(0);
		Element ele=(Element)node;
		System.out.println(doc.getDocumentElement().getNodeName());
	    NodeList nl = doc.getElementsByTagName("staff");
		
	//normal execution
	   // nodeNormal(doc.getChildNodes());
	//Loop Execution
	    //nodeLoop(doc.getChildNodes());
	    */
	    
	    
		
		XML_write_read();
	    
	    
	}

	
	public static void nodeNormal(NodeList nl)
	{
		
		try
		{
   
		
		System.out.println("----------------------------");

		for (int temp = 0; temp < nl.getLength(); temp++) {

			Node nNode = nl.item(temp);
					
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
					
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {

				Element eElement = (Element) nNode;

				System.out.println("Staff id : " + eElement.getAttribute("id"));
				System.out.println("First Name : " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
				System.out.println("Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				System.out.println("Nick Name : " + eElement.getElementsByTagName("nickname").item(0).getTextContent());
				System.out.println("Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());

			}
		}
		System.out.println();
	    } 
	catch (Exception e) {
		e.printStackTrace();	
	}
	}
	
	/*
	public static void nodeLoop(NodeList nl)
	{
		
		
		System.out.println();
		System.out.println("Loop Execution");
		for (int count = 0; count < nl.getLength(); count++) {

			Node tempNode = nl.item(count);

			// make sure it's element node.
			if (tempNode.getNodeType() == Node.ELEMENT_NODE) {

				// get node name and value
				//System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
				System.out.println("Node Value =" + tempNode.getTextContent());

				if (tempNode.hasAttributes()) {

					// get attributes names and values
					NamedNodeMap nodeMap = tempNode.getAttributes();

					for (int i = 0; i < nodeMap.getLength(); i++) {

						Node node = nodeMap.item(i);
						System.out.println("attr name : " + node.getNodeName());
						System.out.println("attr value : " + node.getNodeValue());

					}

				}

				if (tempNode.hasChildNodes()) {

					// loop again if has child nodes
					nodeLoop(tempNode.getChildNodes());

				}

			//	System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");

			}

		    }
*/
	
	
	
	
	
	public static void XML_write_read() throws SAXException, IOException,
    ParserConfigurationException
	{
		
		DocumentBuilderFactory dbf= DocumentBuilderFactory.newInstance();
		DocumentBuilder dbl= dbf.newDocumentBuilder();
		 String input = "<outer>";
		    input += "<otherstuff><TaskID>123</TaskID></otherstuff>";
		    input += "<flow>";
		    input += "<TaskID>100</TaskID>";
		    input += "<TaskID>101</TaskID>";
		    input += "<TaskID>102</TaskID>";
		    input += "<TaskID>103</TaskID>";
		    input += "</flow>";
		    input += "</outer>";
		    Document doc = dbl.parse(new InputSource(new StringReader(input)));
		    
		    System.out.println("XML is written into Document");
		    
		    System.out.println();
		    System.out.println("Tag Names: ");
		    
		    //Printing all the tag names
		    
		    System.out.println();
		    NodeList flowList = doc.getElementsByTagName("*");
		    for (int i = 0; i < flowList.getLength(); i++) {
		    	
		    	Element element = (Element)flowList.item(i);
                System.out.println(element.getNodeName());
		    }
		    
		    //Values
		    System.out.println();
		    System.out.println("Values");
		    System.out.println();
		     flowList = doc.getElementsByTagName("TaskID");
		    for (int i = 0; i < flowList.getLength(); i++) {
		        NodeList childList = flowList.item(i).getChildNodes();
		        for (int j = 0; j < childList.getLength(); j++) {
		        	
		        	System.out.println(childList.item(j).getTextContent());
		        	
		            Node childNode = childList.item(j);
		            if ("TaskID".equals(childNode.getNodeName())) {
		                //System.out.println(childList.item(j).getTextContent().trim());
		                    
		            	
		            	 }
		        }
		    }
	}
	
}
