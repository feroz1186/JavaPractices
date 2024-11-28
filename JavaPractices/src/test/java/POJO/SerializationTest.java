package POJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SerializationTest {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  
	  Employee emp = new Employee();
      emp.setEmpid("111");
      emp.setAge(67);
      emp.setDesig("Mgr");
      emp.setSalary(4000);   
      File file = null;
      ObjectMapper mapper = new ObjectMapper();
    //  String inputbody=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(emp);
      
  //    System.out.println("Output is : "+inputbody);
//      Response resp = RestAssured.given()
//   		   .baseUri("")
//   		   .contentType(ContentType.JSON)
//   		   .accept(ContentType.JSON)
//   		   .body("inputbody")
//   		   .when()
//   		   .post();
//   		   
      try {
		URL url = getClass().getResource("inputFile.json");
		file = new File(url.toURI());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      String output=mapper.readTree(new FileInputStream(file)).toPrettyString();
      System.out.println("Output is : "+output);
  }
}
