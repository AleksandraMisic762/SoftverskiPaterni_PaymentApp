package controller;

import client.Client;
import client.PayPalClients;
import view.FrmMain;
import view.panels.AuthorizationPanel;
import view.panels.PayPalPaymentPanel;
import view.panels.PaymentPanel;

public class PayPalController extends PaymentController{

    PayPalClients clients = new PayPalClients();
    Client client;
    
    String inputControlString;
    
    String email;
    String password;
    
    
    String controlNumber;

    public PayPalController() {
        form = new FrmMain();
        form.setVisible(true);
    }
    
    protected PaymentPanel createPanel(){
        return new PayPalPaymentPanel();
    }
    

    @Override
    protected boolean authentication() {
        email = ((PayPalPaymentPanel)panel).getTxtEmail().getText();
        password = String.valueOf(((PayPalPaymentPanel)panel).getTxtPassword().getPassword());
        if(email.isEmpty() || password.isEmpty()){
            return false;
        }
        if(!clients.getClients().contains(new Client(email, password))){
            return false;
        }
        client = clients.getClient(email, password);
        return true;
    }

    @Override
    protected boolean validation() {
        return true;
    }

    @Override
    protected boolean authorization() {
        inputControlString = ((AuthorizationPanel)panel).getTxtControlString().getText().trim();
        return actualControlString.equals(inputControlString);
    }

    @Override
    protected boolean checkBalance() {
        return amount < client.getBalance();
    }

    @Override
    protected void executePayment() {
        successfulPayment = true;
        client.setBalance(client.getBalance() - amount);
    }

    @Override
    protected String getResult() {
        return email + " " + password + " your PayPal payment of " + amount + " was " + (successfulPayment? "successful." : "unsuccessful.");
     }
    
}
