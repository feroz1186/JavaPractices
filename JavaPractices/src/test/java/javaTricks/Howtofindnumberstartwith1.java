package javaTricks;

import java.util.Arrays;

public class Howtofindnumberstartwith1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = {4,12,5,13,1,23,123};
      String[] names = {"Feroz","Kumar","Arun","karthik"};
      
      Arrays.stream(arr).filter(m -> Integer.toString(m).startsWith("1")).forEach(n -> System.out.println(n));
      
      boolean res=Arrays.stream(names).anyMatch(m-> m.startsWith("m"));
      
      Arrays.stream(names).filter(m -> m.startsWith("F")).forEach(System.out::println);
      
      System.out.println("res : "+res);
      
	}

}
