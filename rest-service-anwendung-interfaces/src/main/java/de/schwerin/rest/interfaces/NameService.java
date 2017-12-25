package de.schwerin.rest.interfaces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 * A sample interface
 */
@Path("/message")
public interface NameService {
	
	@GET
	@Path("/{name}")
	public Response printMessage(@PathParam("name") String msg) throws Exception;
}