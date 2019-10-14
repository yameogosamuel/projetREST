package jrs.tp.wmd.ProjetREST.ressources;


import java.util.ArrayList;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import jrs.tp.wmd.ProjetREST.model.Client;
import jrs.tp.wmd.ProjetREST.model.Repas;
import jrs.tp.wmd.ProjetREST.services.RepasManager;



	@Path("/Repas")
	public class RepasRessource {
	RepasManager repasmanager = new RepasManager();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	public ArrayList<Repas> getRepas() {
	return repasmanager.getRepas();
	}
	
	
	@GET
	@Path("/Clients")
	@Consumes(MediaType.APPLICATION_JSON)
	public ArrayList<Client> getClient() {
	return repasmanager.getClient();
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Repas submitRepas(Repas rep) {
	return repasmanager.submitRepas(rep);
	}
	
	@PUT
	@Path("/{RepasId}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Repas updateRepas(@PathParam("RepasId") long id, Repas rep) {
	return repasmanager.updateRepas(id,rep);
	}
	
	
	@GET
	@Path("/{RepasId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public Repas getRepasDetails(@PathParam("RepasId") long id) {
	return repasmanager.getRepasDetails(id);
	}
	
	
	@DELETE
	@Path("/{RepasId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public String cancelRepas(@PathParam("RepasId") long repasId) {
		return repasmanager.cancelRepas(repasId);
	}
}