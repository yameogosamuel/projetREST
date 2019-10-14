package jrs.tp.wmd.ProjetREST.model;
import javax.ws.rs.Path;
@Path("/Menu")
public class Repas {

	
	
		private long id;
		private Client client;
		private String Name;
		private int Number;

		public Repas() {
			super();
			
		}

		public Repas(long id,Client client, String name, int number) {
			super();
			this.id = id;
			Name = name;
			Number = number;
			this.client= client;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public int getNumber() {
			return Number;
		}

		public void setNumber(int number) {
			Number = number;
		}

		public void put(long id2, Repas repas) {
			
		}

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}
	}
		
