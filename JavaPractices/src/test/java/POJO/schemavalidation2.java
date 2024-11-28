package POJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

public class schemavalidation2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		FileInputStream fis = new FileInputStream(new File("D:\\FEROZ\\EclipseWorkSpace\\JavaPractices\\src\\test\\resources\\schema.json"));
		JSONObject jobj = new JSONObject(new JSONTokener(fis));
        JSONObject jsonData = new JSONObject("{\"name\": \"John Doe\", \"age\": 30, \"email\": \"john.doe@example.com\"}");
        
        Schema schema = SchemaLoader.load(jobj);
        schema.validate(jsonData);
        System.out.println("Schema is validated");
      

	}

}
