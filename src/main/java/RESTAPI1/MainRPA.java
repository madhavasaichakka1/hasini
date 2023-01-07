package RESTAPI1;

@Path("/claim")


public class MainRPA {
	
	@POST
	@Consumus(MediaType.APPLICATION_FORM_URLENCODED)
	
	public String t(@FormParam("propus") String propus,@FormParam("climate") String climate) {}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_XML)
	
	public void k(@PathParam("id") long id) {}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_PLAIN_TEXT)
	
}
