package Stringpkg;

import java.util.Arrays;

public class splitTricky {

	public static void main(String[] args) {
		
		String input = "_a_b_cd";
		String[] op=input.split("_");
		
		
		System.out.println(Arrays.toString(op));
		System.out.println(op[1]);

	}

}
