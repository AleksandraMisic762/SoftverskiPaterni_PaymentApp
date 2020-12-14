package controller;

import client.Client;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.FrmMain;
import view.panels.AuthorizationPanel;
import view.panels.PaymentPanel;

public abstract class PaymentController {
    
    
    FrmMain form;
    PaymentPanel panel;

    protected double amount = 100;

    protected boolean successfulPayment = false;
    
    String actualControlString;

    protected abstract PaymentPanel createPanel();
    
    protected abstract boolean authentication();

    protected abstract boolean validation();

    protected abstract boolean authorization();

    protected abstract boolean checkBalance();

    protected abstract void executePayment();

    protected abstract String getResult();

    protected String createControlString() {
       return String.valueOf(Math.round(Math.random() *1000));
    }

    public void execute(){
        panel = createPanel();
        form.addPanel((JPanel)panel);
        
        panel.addListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!authentication()) {
                    JOptionPane.showMessageDialog(null, "Failed autentication", "Autentication", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (!validation()) {
                    JOptionPane.showMessageDialog(null, "Failed input validation", "Validation", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                 
                actualControlString = createControlString();
                System.out.println(actualControlString);
                AuthorizationPanel authorizationPanel = new AuthorizationPanel();
                panel = authorizationPanel;
                form.removePanel();
                form.addPanel(authorizationPanel);
                authorizationPanel.addListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(!authorization()){
                            JOptionPane.showMessageDialog(null, "Failed authorization", "Authorization", JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        
                        executePayment();
                        JOptionPane.showConfirmDialog(null, getResult(), "Payment result", JOptionPane.OK_OPTION);
                        form.dispose();
                    }
                });
                
            }
        });
        
    }

}
