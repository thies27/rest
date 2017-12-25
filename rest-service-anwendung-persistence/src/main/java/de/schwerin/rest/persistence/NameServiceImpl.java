package de.schwerin.rest.persistence;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import de.schwerin.rest.interfaces.NameService;

@Service
public class NameServiceImpl implements NameService {

	@Override
	public Response printMessage(String msg) throws Exception {
		
		String result = "Restful example : " + msg;

		return Response.status(200).entity(result).build();
	}

	@Override
	public Response getName(int nummer) throws Exception {
		
		String result = null;
		
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
