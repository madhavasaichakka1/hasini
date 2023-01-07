package RestAPI;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

// localhost:8080/expenses/rest/claim/.....

//localhost:8080/PracticeProject/rest/crud/[id]

@Path("/crud")
public class MainRestAPI {
	
	@POST
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public void create(@FormParam("username") String username,@FormParam("password") String password) {
		
	}
	
	@Path("/{id}")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public void get(@PathParam("id") int id) {
		
	}
	
	@Path("/{id}")
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public void delete(@PathParam("id") int id) {
		
	}
	

}
