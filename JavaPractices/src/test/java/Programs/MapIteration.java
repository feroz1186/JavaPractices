package Programs;

import java.util.HashMap;
import java.util.Map;

public class MapIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<>();
		map.put("Ferooz", 8);
		map.put("Khan", 4);
		map.put("Krish", 6);
		map.put("Mani", 3);
		map.put("Anand", 7);
		
				
		System.out.println("Result is : "+map);
		
		for(Map.Entry<String, Integer> output : map.entrySet())
		{
			if(output.getValue()==4)
				System.out.println("Name is : "+output.getKey() +" Age is : "+output.getValue());
		}
		
		

	}

}
