package api;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class updateAttributeUsingJaywayPath {

	public static void main(String[] args) throws IOException {
		
		 File file = new File("src/test/resources/car.json");
		 
		 ObjectMapper mapper = new ObjectMapper();
		 String jsonString=mapper.readTree(file).toPrettyString();
		 
		 DocumentContext context=JsonPath.parse(file);
		 DocumentContext context1=JsonPath.parse(jsonString);
		 	
		 
		 String jsonpath ="$.cars.Nissan[?(@.model=='Maxima')].doors";
		 
		 context1.set(jsonpath, "9");
		 
		 String updvalue=context1.jsonString();
		 
		 System.out.println(updvalue);

	}

}
