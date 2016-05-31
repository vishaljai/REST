package rest.kn;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v2")
public class StudentResourseConsume {
	
		@GET
	    @Path("/send")
	    @Consumes(MediaType.APPLICATION_XML)
		public Response consumeXML( Student student ) {

		 String output = student.toString();
		 return Response.status(200).entity(output).build();
	
	     }
	 
	 }



