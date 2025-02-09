package api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.ReadContext;
import com.jayway.jsonpath.WriteContext;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.Option;

public class UpdateUsingJaywayPath {

    public static void main(String[] args) throws IOException {
        
        File file = new File("src/test/resources/car.json");
        FileInputStream fis = new FileInputStream(file);
        
        // Read the JSON file into a String
        String json = new String(fis.readAllBytes());
        fis.close(); // Close the FileInputStream
        
        // Parse the JSON
        ReadContext ctx = JsonPath.parse(json);
        
        // Check if the owner "feroz" exists and get the path to update doors
        String jsonPath = "$.cars.Nissan[?(@.owners.name1 == 'feroz')]";

        // Check if the path exists
        if (!(ctx.read(jsonPath)==null)) {
            // Update the doors attribute to 5
            WriteContext writeContext = JsonPath.parse(json);
            writeContext.set("$.cars.Nissan[?(@.owners.name1 == 'feroz')].doors", 5);
            
            // Get the updated JSON as a string
            String updatedJson = writeContext.jsonString();
            
            // Write the updated JSON back to the file
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(updatedJson.getBytes());
                System.out.println("Updated doors for owner 'feroz' to 5.");
            }
        } else {
            System.out.println("No owner named 'feroz' found.");
        }
    }
}