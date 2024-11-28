package Programs;

import java.util.HashMap;

public class CountLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Test is good!";
		String output = input.replaceAll(" ","");
		System.out.println("After Replaced : "+output);
		
		
		HashMap<Character,Integer> map = new HashMap<>();
		
		for(char ch : output.toCharArray())
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				map.put(ch, map.get(ch)+1);
			}
		}
		
		System.out.println("Result is : "+map);

	}

}
