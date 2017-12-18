package webapp;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/request")
public class RequestEndpoint {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String submit() {

	String output = "New Production Version -- v8.34.5.3 -- restful service call received and new event has been sent to event log";
        System.out.println(output);
        return output;
    }
}
