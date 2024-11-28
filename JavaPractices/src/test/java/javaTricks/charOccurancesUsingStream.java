package javaTricks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class charOccurancesUsingStream {

	public static void main(String[] args) {
		
		String input ="HelloWorld";
		
		Map<Character,Long> map =input.chars()
		.mapToObj(m -> (char)m)
		.filter(m -> m!=' ')
		.collect(Collectors.groupingBy(m->m, Collectors.counting()));
		
		System.out.println(map);
		
		Map<String,Integer> age = new TreeMap<>();
		age.put("Feroz", 33);
		age.put("Kumar", 43);
		age.put("Ameer", 43);
		
		age.forEach((key,value) -> System.out.println(key+" "+value+""));
	

	}

}
