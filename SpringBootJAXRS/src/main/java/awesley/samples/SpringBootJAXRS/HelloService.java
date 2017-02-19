package awesley.samples.SpringBootJAXRS;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/sayhello")
public class HelloService {
	
	@GET
	@Produces({"application/json"})
	public String sayHello() {
		return "Hello World!!";
	}
}
