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

        System.out.println("Version 6 -- request submitted to event log");

        String response = "Version 6 -- request submitted to event log";

        return response;
    }
}
