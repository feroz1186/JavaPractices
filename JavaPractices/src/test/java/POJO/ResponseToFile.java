package POJO;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ResponseToFile {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		// TODO Auto-generated method stub
		Response response =RestAssured.given()
		.baseUri("https://reqres.in/api/users/2")
		.header("content-Type","application/json")
		.when()
		.get();
		
		String ResponseString = response.toString();
	//	response.prettyPrint();
	//	response.getStatusLine();
		
		File jsonFile = new File("src/test/resources/response.json");
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(jsonFile, response.prettyPrint());
		

	}

}
