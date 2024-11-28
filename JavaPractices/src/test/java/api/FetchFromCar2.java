package api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class FetchFromCar2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/test/resources/car.json");
        FileInputStream fis = new FileInputStream(file);
        
        ObjectMapper mapper = new ObjectMapper();
        
        // Read the JSON file into a JsonNode
        JsonNode rootNode = mapper.readTree(fis);
        
        // Access the Nissan cars
        JsonNode nissanCars = rootNode.path("cars").path("Nissan");
        
        // Iterate through each Nissan car
        for (JsonNode car : nissanCars) {
            // Access the owners
            JsonNode owners = car.path("owners");
            
            // Check for specific owner name
            if (owners.path("name2").textValue().equals("khan")) { // Adjusted to match the example data
                System.out.println("Found owner: " + owners.path("name2").textValue());
                // You can also access other details if needed
                System.out.println("Model: " + car.path("model").textValue());
                System.out.println("Doors: " + car.path("doors").intValue());
            }
        }
        
        fis.close(); // Close the FileInputStream
		
		
		

	}
		
		

}