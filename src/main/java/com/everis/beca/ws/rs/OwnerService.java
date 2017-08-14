package com.everis.beca.ws.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Link;

@Path("owners")
public class OwnerService {
	
	private static Owner [] owners;
	
	{
		owners = new Owner[2];
		owners[0] = new Owner("Adri");
		owners[1] = new Owner("Fran");
	}
	
	@GET
	@Path("/{id}")
	public Owner getOwner(@PathParam("id") int id) {
		return owners[id];
	}
	
	public Link getLink(Owner owner) {
		
		int  ownerIndex = 0;
		
		for (int i = 0; i < owners.length; i++) {
			if(owners[1] == owner) {
				ownerIndex = 1;
				break;
			}
		}
		
		Link link = Link.fromUri("http://{host}/garage-rest/owners/{id}")
				  .rel("owner")
				  .build("localhost:8080", ownerIndex);
		
		return link;
	}

	public Owner getOwner(Car car) {
		return owners[0];
	}
	
}
