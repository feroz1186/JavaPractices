package POJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class schemavalidation {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Load the JSON Schema
		//File file = new File("");
		FileInputStream fis = new FileInputStream(new File("D:\\FEROZ\\EclipseWorkSpace\\JavaPractices\\src\\test\\resources\\schema.json"));
      //  InputStream schemaStream = schemavalidation.class.getResourceAsStream("/schema.json");
        JSONObject jsonSchema = new JSONObject(new JSONTokener(fis));
        
     // Load the JSON data to validate
        JSONObject jsonData = new JSONObject("{\"name\": \"John Doe\", \"age\": 30, \"email\": \"john.doe@example.com\"}");
     
        
        Schema schema = SchemaLoader.load(jsonSchema);
        schema.validate(jsonData);
        System.out.println("SchemaData is valid");

	}

}
