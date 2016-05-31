package rest.kn;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v2")
public class StudentResourseConsume {
	
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudent(){
		
		Student student = new Student();
		student.setAge(22);
		student.setName("Vishal Jain");
		return student;
	}
	
	@GET
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Student student) {

		String result = "Track saved : " + student;
		return Response.status(200).entity(result).build();
		
	}
	 }



