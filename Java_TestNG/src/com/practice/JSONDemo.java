package com.practice;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONDemo {

public static void main(String[] args) throws ParseException, JSONException {

JSONParser parser = new JSONParser();

try {

Object obj = parser.parse(new FileReader("D:\\Madhu\\earth.json"));//Creating an object for jsong file 

JSONObject jsonObject = (JSONObject) obj;//Make that object as JSON object

String planetname = (String) jsonObject.get("planet");//Get the value of a particular JSON element
 System.out.println(planetname);

Double diameter = (Double) jsonObject.get("diameter");
 System.out.println(diameter);

// loop array
 JSONArray msg = (JSONArray) jsonObject.get("facts");// Creating an object for a JSON array
 
  /*Iterator<JSONObject> iterator = msg.iterator();//Creating an Iterator for an array
  while (iterator.hasNext()) {
  JSONObject factObj = (JSONObject) iterator.next();
  String water = (String) factObj.get("water");
  System.out.println(water);
  */
  
  for (int i = 0; i < msg.size(); i++) {
	    String value = msg.get(i).toString();
	    System.out.println(value);
  }

 } catch (FileNotFoundException e) {
 e.printStackTrace();
 } catch (IOException e) {
 e.printStackTrace();
 } 

}

}