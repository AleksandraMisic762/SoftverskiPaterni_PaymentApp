
package client;

public class Client {
    
    String email;
    String password;
    double balance;

    public Client(String email, String password, double balance) {
        this.email = email;
        this.password = password;
        this.balance = balance;
    }
    public Client(String email, String password) {
        this.email = email;
        this.password = password;
        this.balance = 0;
    }
    
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Client)){
            return false;
        }
        Client c = (Client)obj;
        if(!this.email.equals(c.email)){
            return false;
        }
        if(!this.password.equals(c.password)){
            return false;
        }
        return true;
    }
    
}

