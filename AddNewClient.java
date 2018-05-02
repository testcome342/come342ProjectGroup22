package pkg342project1;

import com.sun.security.ntlm.Client;

public class AddNewClient {

	public static Client createNewClient(String name, String address, String email, String contactName, String contactEmail) {
		
		Client client = new Client(name, address, email, contactName, contactEmail);
		
		return client;
		
	}

}
	
	
	
}