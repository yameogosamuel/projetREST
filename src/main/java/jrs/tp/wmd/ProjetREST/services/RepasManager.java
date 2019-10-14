package jrs.tp.wmd.ProjetREST.services;

import java.util.ArrayList;
import java.util.Map;

import jrs.tp.wmd.ProjetREST.model.Client;
import jrs.tp.wmd.ProjetREST.model.Repas;
import jrs.tp.wmd.ProjetREST.repository.Repository;


public class RepasManager {
	
	private Map<Long, Repas> repas = Repository.getRepas();
	private Map<Long, Client> clients = Repository.getClient();
	
	public RepasManager() {
		
	}
	
	public ArrayList<Repas> getRepas() {
		return new ArrayList<Repas>(repas.values());
	}
	public Repas submitRepas(Repas rep) {
		Client clt=new Client();
		clt=rep.getClient();
		clients.put(clt.getId(), clt);
		repas.put(rep.getId(), rep);
		return rep;
	}
	public Repas getRepasDetails(long repasId) {
	return repas.get(repasId);
	}
	
	public ArrayList<Client> getClient() {
		return new ArrayList<Client>(clients.values());
	}
	
	public String cancelRepas(long repasId) {
		repas.remove(repasId);
		return "Le repas ayant l'id "+repasId+" a été supprimé";
	}
	public Repas updateRepas(long id, Repas rep) { 
		repas.put(rep.getId(), rep);
		return rep;
	}
	}
