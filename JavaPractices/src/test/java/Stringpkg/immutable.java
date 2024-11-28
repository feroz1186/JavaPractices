package Stringpkg;

public class immutable {

	public static void main(String[] args) {
		String s = "sachin";
		System.out.println(s);
		s.concat("tendul");
		System.out.println(s);//It still refers sachin
		
		s = s.concat("ten");
		System.out.println(s);
		
		String str1 = "sachin";
		String str2 = str1;
		
		System.out.println(str1+"  "+str2);
		str1 ="hello";
		System.out.println(str1+"  "+str2);
		str2 = str1;
		System.out.println(str1+"  "+str2);
	}

}
