package com.howtodoinjava.jersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demoservice")
public class DemoService {

	   @GET
	   @Produces(MediaType.APPLICATION_JSON)
	   public String getUsers(){
	      return "{1,Joe,IT}";
	   }
	
}