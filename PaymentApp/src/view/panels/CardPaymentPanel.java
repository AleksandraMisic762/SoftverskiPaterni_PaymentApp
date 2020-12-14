package view.panels;

import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JTextField;

public class CardPaymentPanel extends javax.swing.JPanel implements PaymentPanel{

    public CardPaymentPanel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtLastname = new javax.swing.JTextField();
        lblLastname = new javax.swing.JLabel();
        lblCardNumber = new javax.swing.JLabel();
        txtCardNumber = new javax.swing.JTextField();
        txtDay = new javax.swing.JTextField();
        txtMonth = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        lblDay = new javax.swing.JLabel();
        lblMonth = new javax.swing.JLabel();
        lblYear = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        lblControlNumber = new javax.swing.JLabel();
        txtControlNumber = new javax.swing.JTextField();

        lblName.setText("Name:");

        lblLastname.setText("Lastname:");

        lblCardNumber.setText("Card number:");

        lblDay.setText("Day:");

        lblMonth.setText("Month:");

        lblYear.setText("Year:");

        lblDate.setText("Card expiration date:");

        btnPay.setText("Pay");

        lblControlNumber.setText("Control nuber:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblName)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLastname)))
                            .addComponent(txtCardNumber)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(lblDate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDay)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblMonth)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblYear)
                                                .addGap(1, 1, 1)
                                                .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 14, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(139, 139, 139)
                                .addComponent(lblCardNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblControlNumber)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtControlNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName)
                            .addComponent(lblLastname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(txtLastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCardNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblControlNumber)
                    .addComponent(txtControlNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDay)
                    .addComponent(lblMonth)
                    .addComponent(lblYear))
                .addGap(18, 18, 18)
                .addComponent(btnPay)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPay;
    private javax.swing.JLabel lblCardNumber;
    private javax.swing.JLabel lblControlNumber;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDay;
    private javax.swing.JLabel lblLastname;
    private javax.swing.JLabel lblMonth;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtControlNumber;
    private javax.swing.JTextField txtDay;
    private javax.swing.JTextField txtLastname;
    private javax.swing.JTextField txtMonth;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxtCardNumber() {
        return txtCardNumber;
    }

    public void setTxtCardNumber(JTextField txtCardNumber) {
        this.txtCardNumber = txtCardNumber;
    }

    public JTextField getTxtLastname() {
        return txtLastname;
    }

    public void setTxtLastname(JTextField txtLastname) {
        this.txtLastname = txtLastname;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }
    
    public Date getExpirationDate()throws Exception{
        int day = Integer.parseInt(txtYear.getText().trim());
        int month = Integer.parseInt(txtMonth.getText().trim());
        int year = Integer.parseInt(txtDay.getText().trim());
        return new Date(day, month, year);
    }
    
    public void addListener(ActionListener actionListener){
        btnPay.addActionListener(actionListener);
    }

    public JTextField getTxtControlNumber() {
        return txtControlNumber;
    }

    public void setTxtControlNumber(JTextField txtControlNumber) {
        this.txtControlNumber = txtControlNumber;
    }
    
    
}
