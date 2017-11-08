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

	String output = "Production Version -- v1 -- request received and sent to event log";
        System.out.println(output);
        return output;
    }
}
