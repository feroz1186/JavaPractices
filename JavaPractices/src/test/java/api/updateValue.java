package api;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class updateValue {

	   public static void main(String[] args) throws IOException {
	        
	        File file = new File("src/test/resources/car.json");
	        FileInputStream fis = new FileInputStream(file);
	        
	        ObjectMapper mapper = new ObjectMapper();
	        
	        // Read the JSON file into a JsonNode
	        JsonNode rootNode = mapper.readTree(fis);
	        
	        // Access the cars node
	        JsonNode carsNode = rootNode.path("cars");
	        
	        // Flag to check if the update was made
	        boolean updated = false;

	        // Iterate through each car brand
	        for (String brand : (Iterable<String>) carsNode.fieldNames()) {
	            JsonNode carList = carsNode.path(brand);
	            
	            // Iterate through each car of the brand
	            for (JsonNode car : carList) {
	                // Access the owners
	                JsonNode owners = car.path("owners");
	                
	                // Check if name1 is "feroz"
	                if (owners.path("name1").textValue().equals("feroz")) {
	                    // Update the doors to 5
	                    ((ObjectNode) car).put("doors", 5);
	                    updated = true;
	                    System.out.println("Updated doors for model: " + car.path("model").textValue());
	                }
	            }
	        }

	        // Write the updated JSON back to the file
	        if (updated) {
	            try (FileOutputStream fos = new FileOutputStream(file)) {
	                mapper.writerWithDefaultPrettyPrinter().writeValue(fos, rootNode);
	                System.out.println("Updated JSON written to file.");
	            }
	        } else {
	            System.out.println("No updates made.");
	        }

	        fis.close(); // Close the FileInputStream
	    }
	}

