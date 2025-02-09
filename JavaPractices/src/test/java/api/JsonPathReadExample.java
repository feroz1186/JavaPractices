package api;

import java.util.LinkedHashMap;

import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONArray;

public class JsonPathReadExample {
	
	 public static void main(String[] args) {
	        // Original JSON string
	        String jsonString = "{\"id\":1,\"name\":\"John Doe\",\"details\":{\"city\":\"New York\"}}";

	        // Fetching a single value
	        String name = JsonPath.read(jsonString, "$.name");
	        System.out.println("Name: " + name);

	        // Fetching a nested value
	        String city = JsonPath.read(jsonString, "$.details.city");
	        System.out.println("City: " + city);

	        // Fetching all keys in a nested object
	        LinkedHashMap<String,Object> keys = JsonPath.read(jsonString, "$.details");
	        System.out.println(keys);
	    }

}
