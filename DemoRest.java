package ws;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("demo")
public class DemoRest {

	/**
	 * @param args
	 */
	@GET
	@Path("hello/{phoneNum}")
	@Produces(MediaType.TEXT_PLAIN)
	public String hello(@PathParam("phoneNum") String phoneNum){
		return "Hello World "+phoneNum;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
