package api;

public class askedquesstrbuffer {

	public static void main(String[] args) {
		{
	        StringBuffer str1 = new StringBuffer("Hello");
	        StringBuffer str2 = str1;
	        StringBuffer str3 = new StringBuffer("Hello");
	        	        
	        String str4 = new String("Hello");
	        String str5 = new String("Hello");
	        
	        String str6 = "Hello";
	        
//	        str1.append("World");
//	        System.out.println(str1 + " " + str2 + " " + (str1 == str2));
//	        System.out.println(str1.equals(str2));
	        
	        System.out.println(str1.equals(str2));
	        System.out.println(str1.toString().equals("Hello")); //false -check
	        System.out.println(str1.toString().equals(str3.toString())); //false
	        System.out.println(str1.toString().equals(str4));//false
	        System.out.println(str4.equals(str5));//true
	        System.out.println(str4.equals(str6));//true
	        System.out.println(str4.equals("Hello"));//true
	        System.out.println("=========================================");
	        
	      //  System.out.println(str1 == str6);  --> Incompatible operand types
	        System.out.println(str1==str2);
//	        System.out.println(str1=="Hello"); //false -check
	        System.out.println(str1==str3); //false
	//        System.out.println(str1==str4);//false
	        System.out.println(str4==str5);//true
	        System.out.println(str4==str6);//true
	        System.out.println(str4=="Hello");//true
	        


	    }

		

	}

}
