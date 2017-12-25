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

}
