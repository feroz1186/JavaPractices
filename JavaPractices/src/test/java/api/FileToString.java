package api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FileToString {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream(new File("src/test/resources/inputFile.json"));
		
		ObjectMapper mapper = new ObjectMapper();
		//File to String
		String output=mapper.readTree(fis).toPrettyString();
		
		System.out.println("Output is : "+output);
		
		//Fetch 
		JsonNode output1 = mapper.readTree(fis);
		JsonNode sal=output1.path("salary");
		
		System.out.println("Salary is : "+sal.toString());
		

	}

}
