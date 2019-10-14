package jrs.tp.wmd.ProjetREST.model;

import javax.ws.rs.Path;

@Path("/Client")
public class Client {
	

		private long id;
		private String firstName;
		private String lastName;
		private String address;

		public Client() {
			super();
		
		}

		public Client(long id, String firstName, String lastName, String address) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.address = address;
			
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	

	}


