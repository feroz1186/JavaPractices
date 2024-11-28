package POJO;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Serialization {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
       Employee emp = new Employee();
       emp.setEmpid("111");
       emp.setAge(67);
       emp.setDesig("Mgr");
       emp.setSalary(4000);   
       File file=null;
       ObjectMapper mapper = new ObjectMapper();
       String inputbody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
       
       System.out.println("Output is : "+inputbody);
       
       URL url=Serialization.class.getClassLoader().getResource("inputFile.json");
       file = new File(url.getFile());
       String op =mapper.writeValueAsString(mapper.readTree(file));
       System.out.println("Return value is"+op);
      
	}
   

}
