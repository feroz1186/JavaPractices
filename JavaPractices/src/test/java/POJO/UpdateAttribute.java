package POJO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.gson.JsonObject;

public class UpdateAttribute {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//String jsonString ="{\"cars\":{\"Nissan\":[{\"model\":\"Sentra\",\"doors\":4},{\"model\":\"Maxima\",\"doors\":4},{\"model\":\"Skyline\",\"doors\":2}],\"Ford\":[{\"model\":\"Taurus\",\"doors\":4},{\"model\":\"Escort\",\"doors\":4}]}}";
		ObjectMapper input = new ObjectMapper();
		String jsonstring=input.readTree(new FileInputStream("src/test/resources/car.json")).toString();
		System.out.println(jsonstring);
		
//				
		ObjectMapper mapper = new ObjectMapper();
		JsonNode rootNode = mapper.readTree(jsonstring);
    	JsonNode nissanArray=rootNode.path("cars").path("Nissan");	
    	JsonNode ownerarray=nissanArray.path("owners");
	    for(JsonNode owner: ownerarray)
		{
		if(owner.path("name1").textValue().equals("selva"))
			{
			((ObjectNode) owner).put("doors","0");
		}
		}
		
		String updstrig=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(rootNode);
		System.out.println("***************************************************************");
		System.out.print(updstrig);
		
		
		
		
	   
		
		

	}

}
