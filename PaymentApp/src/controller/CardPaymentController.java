package controller;

import client.Client;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.FrmMain;
import view.panels.AuthorizationPanel;
import view.panels.CardPaymentPanel;
import view.panels.PaymentPanel;

public class CardPaymentController extends PaymentController{
    
    
    Client client = new Client("user@user.com", "pass", 1000.00);
    
    String inputControlString;
    
    String name;
    String lastname;
    
    String cardNumber;
    Date expirationDate;
    
    String controlNumber;

    public CardPaymentController() {
        form = new FrmMain();
        form.setVisible(true);
        
    }
    
    protected PaymentPanel createPanel(){
        return new CardPaymentPanel();
    }
    
    @Override
    protected boolean authentication() {
        name = ((CardPaymentPanel)panel).getTxtName().getText();
        lastname = ((CardPaymentPanel)panel).getTxtLastname().getText();
        if(name.isEmpty() || lastname.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    protected boolean validation() {
        cardNumber = ((CardPaymentPanel)panel).getTxtCardNumber().getText();
        controlNumber = ((CardPaymentPanel)panel).getTxtControlNumber().getText();
        try {
            expirationDate = ((CardPaymentPanel)panel).getExpirationDate();
        } catch (Exception ex) {
           return false;
        }
        if(!Pattern.matches("[0-9]{16}", cardNumber)){
            return false;
        }
        if(!Pattern.matches("[0-9]{4}", controlNumber)){
            return false;
        }
        if(expirationDate.before(new Date())){
            return false;
        }
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
        return name + " " + lastname + " your payment of " + amount + " was " + (successfulPayment? "successful." : "unsuccessful.");
    }


    
}
