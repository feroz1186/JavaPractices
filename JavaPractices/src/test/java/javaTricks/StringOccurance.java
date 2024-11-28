package javaTricks;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringOccurance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		String input = "This test is Selenium test which is created by feroz";
		
		Map<String,Long> map=Arrays.stream(input.split(" "))
		.collect(Collectors.groupingBy(word -> word,Collectors.counting()));
		
		System.out.println(map);

	}

}
