package client;

import java.util.ArrayList;
import java.util.List;

public class PayPalClients {
    
    List<Client> clients;

    public PayPalClients() {
        clients = new ArrayList<>();
        clients.add(new Client("user1@email.com", "pass123", 1000.00));
        clients.add(new Client("user2@emial.com", "pass123", 200.00));
    }

    public List<Client> getClients() {
        return clients;
    }

    public Client getClient(String email, String password) {
        for(Client c : clients ){
            if(c.email.endsWith(email)){
                if(c.password.equals(password)){
                    return c;
                }
            }
        }
        return null;
    }
    
}
