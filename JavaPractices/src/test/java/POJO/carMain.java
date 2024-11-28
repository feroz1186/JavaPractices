package POJO;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class carMain {

	public static void main(String[] args) throws JsonProcessingException {
		
		Cars car = new Cars();
		Nissan nissan = new Nissan();
		nissan.setModel("Sentra");
		nissan.setDoors("4");
		
		Nissan nissan1= new Nissan();
		nissan1.setModel("Maxima");
		nissan1.setDoors("2");
		
		Nissan nissan2= new Nissan();
		nissan2.setModel("Skyline");
		nissan2.setDoors("5");
		
		List<Nissan> NiList = new ArrayList<>();
		NiList.add(nissan1);
		NiList.add(nissan2);
		
		Ford ford = new Ford();
		ford.setModel("Taurus");
		ford.setDoors("4");
		
		Ford ford1 = new Ford();
		ford1.setModel("Escort");
		ford1.setDoors("2");
		
		List<Ford> FList = new ArrayList<>();
        FList.add(ford);
        FList.add(ford1);
        
        car.setNissan(NiList);
        car.setFord(FList);
        
        //System.out.print(car.toString());
        
        ObjectMapper mapper = new ObjectMapper();
        String input=mapper.writeValueAsString(car);
        System.out.println(input.toString());

	}

}
