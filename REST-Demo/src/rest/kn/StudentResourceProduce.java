package rest.kn;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/v1")
public class StudentResourceProduce {

	@GET
	@Path("/set")
	@Produces(MediaType.APPLICATION_XML)
	public Student getStudent(){
		
		Student student = new Student();
		student.setAge(22);
		student.setName("Vishal Jain");
		return student;
	}
	
	
	
}
