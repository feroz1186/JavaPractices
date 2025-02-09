package api;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

import net.minidev.json.JSONArray;

public class FetchUsingJaywayPath {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/test/resources/car.json");
        FileInputStream fis = new FileInputStream(file);
        
        ObjectMapper mapper = new ObjectMapper();
        String input= mapper.readTree(fis).toPrettyString();
        DocumentContext context= JsonPath.parse(input);
        String model= context.read("$.cars.Nissan[0].model").toString();
        System.out.println("Model :"+model);
        
       //another way fetch data from json string
        String model1=JsonPath.read(input, "$.cars.Nissan[0].model");
        System.out.println("Model :"+model1);
        //From file
       String model2= JsonPath.read(file, "$.cars.Nissan[0].model");
       System.out.println("Model :"+model2);
       //Return string
       List<String> models=JsonPath.read(file, "$.cars.Nissan[*].model");
       JSONArray vv=JsonPath.read(file, "$.cars.Nissan");
       System.out.println(vv.get(0));
       
       for(String m:models)
       {
    	   System.out.println("Res is : "+m);
       }
	}

}
