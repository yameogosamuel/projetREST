package jrs.tp.wmd.ProjetREST.repository;
import java.util.HashMap;
import java.util.Map;

import jrs.tp.wmd.ProjetREST.model.Client;
import jrs.tp.wmd.ProjetREST.model.Repas;


public class Repository {
		
	private static Map<Long, Repas> repas= new HashMap<>();
	private static Map<Long, Client> clients = new HashMap<>();

	public static Map<Long, Client> getClient() {
		return clients;
	}
	
	public static Map<Long, Repas> getRepas() {
		return repas;
}}
