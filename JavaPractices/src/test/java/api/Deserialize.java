package api;

import org.openqa.selenium.json.Json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import POJO.data;
import POJO.json;
import POJO.support;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Deserialize {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		
		Response resp=RestAssured.given()
		.baseUri("https://reqres.in/api/users/2")
		.contentType(ContentType.JSON)
		.when()
		.get();
		
		resp.prettyPrint();
		
		String responsebdy=resp.body().asString();
		json json=mapper.readValue(responsebdy, json.class);
		
		data data = json.getData();
		
		
		if(data!=null)
		{
			System.out.println("Id is : "+data.getId());
			System.out.println("Email is : "+data.getEmail());
			System.out.println("First name is : "+data.getFirst_name());
			System.out.println("Lastname is : "+data.getLast_name());
			System.out.println("Avatar is : "+data.getAvatar());
		}
		else
		{
		    System.out.println("Data is missing");
		}
		
		support support = json.getSupport();
		if(support!=null)
		{
			System.out.println("URL is "+support.getUrl());
			System.out.println("Text is :"+support.getText());
		}
		else
		{
			System.out.println("Support field is missing");
		}

	}

}
