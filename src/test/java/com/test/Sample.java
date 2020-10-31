package com.test;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class Sample {
public static void main(String[] args) throws IOException, ParseException {
	//file reader
	FileReader reader = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\InputData\\Sample.json");
	//JSON Parser
	JSONParser jsonParser =new JSONParser();
	//pass the json file
	Object object = jsonParser.parse(reader);
	//json object
	JSONObject jsonObj =(JSONObject)object;
	//to print total
	String tot = jsonObj.get("total").toString();
	System.out.println(tot);
	
	System.out.println("to print ad ");
	//to print ad
	 /*String adv = jsonObj.get("ad").toString();
	 System.out.println(adv);*/
	 
	 Object object2 = jsonObj.get("ad");
	 JSONObject j1 = (JSONObject)object2;
	 String adcomp = j1.get("company").toString();
	 System.out.println(adcomp);
	 System.out.println(j1.get("url").toString());
	 String adUrl = j1.get("text").toString();
	 System.out.println(adUrl);

	 System.out.println("to print 5th set	 ");
	 //to print 5th set	 	 
	JSONArray a =(JSONArray)jsonObj.get("data"); 
	JSONObject ji =(JSONObject)a.get(4);
	String id = ji.get("id").toString();
	String email = ji.get("email").toString();
	String fn = ji.get("first_name").toString();
	String ln = ji.get("last_name").toString();
	String av = ji.get("avatar").toString();
	System.out.println(id);
	System.out.println(email);
	System.out.println(fn);
	System.out.println(ln);
	System.out.println(av);
	
}
}
