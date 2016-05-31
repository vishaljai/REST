package rest.kn;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ConsumeStudent {

	public static void main(String[] args) {
		try {

			Client client = Client.create();

			WebResource webResource = client.resource("http://localhost:8080/REST-Demo/v2/send");

			//ClientResponse response = webResource.accept(MediaType.APPLICATION_XML).get(ClientResponse.class);

			ClientResponse response = webResource.type(MediaType.APPLICATION_XML).put(ClientResponse.class);

			System.out.println(response.getStatus());
			if (response.getStatus() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatus());
			}

			String output = response.getEntity(String.class);

			System.out.println("Output from Server .... \n");
			System.out.println(output);

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
}