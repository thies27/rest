package de.schwerin.rest.interfaces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

/**
 * A sample interface
 * 
 * http://localhost:8080/restservice/rest/message/schwerin
 */
@Path("/message")
public interface NameService {
	
	/**
	 * http://localhost:8080/restservice/rest/message/schwerin
	 * 
	 * @param msg
	 * @return
	 * @throws Exception
	 */
	@GET
	@Path("/{name}")
	public Response printMessage(@PathParam("name") String msg) throws Exception;
	
	/**
	 * http://localhost:8080/restservice/rest/message/load?numero=3
	 */
	@GET
	@Path("/load")
	public Response getName(@QueryParam("numero") int nummer) throws Exception;
}