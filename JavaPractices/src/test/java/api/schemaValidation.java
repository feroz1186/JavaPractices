package api;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.fasterxml.jackson.databind.ObjectMapper;

public class schemaValidation {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src/test/resources/schema.json");
		JSONObject jsonobj = new JSONObject(new JSONTokener(fis));
		
		ObjectMapper mapper = new ObjectMapper();
		String jstring=mapper.readTree(new FileInputStream("src/test/resources/inputFile2.json")).toPrettyString();
		JSONObject input = new JSONObject(jstring);
		Schema schema=SchemaLoader.load(jsonobj);
		
		schema.validate(input);
		System.out.println("Passed..");
		
       
	}

}
