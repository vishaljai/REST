package rest.kn;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/v1")
public class StudentResourceProduce {

	@GET
	@Path("/set")
	@Consumes("application/json")
	@Produces("application/json")
	public Student getStudent(){
		
		Student student = new Student();
		student.setAge(22);
		student.setName("Vishal Jain");
		return student;
	}
	
	
	
}
