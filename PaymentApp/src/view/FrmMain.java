package view;

import java.awt.BorderLayout;
import javax.swing.JPanel;

public class FrmMain extends javax.swing.JFrame {

    JPanel panel;
    
    public FrmMain() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
    public void addPanel(JPanel panel){
        this.panel = panel;
        this.add(panel, BorderLayout.CENTER);
        panel.setVisible(true);
        this.pack();
    }
    
    public void removePanel(){
        if(panel!=null){
            remove(panel);
        }
    }

}
