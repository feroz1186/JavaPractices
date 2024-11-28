package POJO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class FileToString {
  @Test
  public void f() throws FileNotFoundException, IOException {
	  
	  ObjectMapper mapper = new ObjectMapper();
	  String file = "src/test/resources/inputFile.json";
      String output=mapper.readTree(new FileInputStream(file)).toPrettyString();
      System.out.println("Output is : "+output);
  }
}
