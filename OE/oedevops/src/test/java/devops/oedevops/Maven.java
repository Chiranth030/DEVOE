package devops.oedevops;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Maven {

	public static void main(String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException{
		// TODO Auto-generated method stub
		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader(".\\JSON\\demo.json");
		Object obj = jsonparser.parse(reader);
		JSONObject empjson = (JSONObject)obj;
		String fname = (String)empjson.get("firstname");
		String lname = (String)empjson.get("lastname");
		System.out.println("FirstName " +fname);
		System.out.print("LastName " +lname);

	}

}