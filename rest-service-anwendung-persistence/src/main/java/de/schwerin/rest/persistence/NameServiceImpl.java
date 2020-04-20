package de.schwerin.rest.persistence;

import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import de.schwerin.rest.interfaces.NameService;

@Service
public class NameServiceImpl implements NameService {
	
	private Logger log = Logger.getLogger(NameServiceImpl.class);

	@Override
	public Response printMessage(String msg) throws Exception {
		
		log.info("Message: " + msg);
		
		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();
	}

	@Override
	public Response getName(int nummer) throws Exception {
		
		String result = null;
		
		log.info("nummer: " + nummer);
		
		if (nummer == 1) {
			result = "Numero 1";
		} else if(nummer == 2){
			result = "Numero 2";
		} else{
			result = "Numero irgendwas";
		}
		
		return Response.status(200).entity(result).build();
	}

}
