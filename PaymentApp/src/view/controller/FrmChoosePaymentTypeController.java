
package view.controller;

import controller.CardPaymentController;
import controller.PayPalController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.FrmChoosePaymentType;

public class FrmChoosePaymentTypeController {
    FrmChoosePaymentType form;

    public FrmChoosePaymentTypeController() {
        form = new FrmChoosePaymentType();
        form.setVisible(true);
        addListeners();
        
    }

    private void addListeners() {
        form.btnCardAddListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CardPaymentController().execute();
                form.dispose();
            }
        });
        form.btnPayPalAddListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PayPalController().execute();
                form.dispose();
            }
        });
    }
}
