/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.MainProduct;
import javax.swing.JOptionPane;

/**
 *
 * @author 16177
 */
public class CheckingAccInfoJPannel extends javax.swing.JPanel {

    /**
     * Creates new form CheckingAccInfoJPannel
     */
    MainProduct product;
    public CheckingAccInfoJPannel(MainProduct  product,String string) {
        initComponents();
        this.product = product;
            if(string=="create")
        {
            
        }
        else
        {
            SaveJButton1.setVisible(false);
             BankNameJText.setEnabled(false);
        BankRoutingNumberJText.setEnabled(false);
        BankAccNumberJText.setEnabled(false);
        AccBalanceJText.setEnabled(false);
        AccTypeJText.setEnabled(false);
             display();
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AccBalanceJText = new javax.swing.JTextField();
        BankRoutingNumberJLable = new javax.swing.JLabel();
        AccTypeJText = new javax.swing.JTextField();
        BankAccNumberJLable = new javax.swing.JLabel();
        AccBalanceJLable = new javax.swing.JLabel();
        BankNameJText = new javax.swing.JTextField();
        BankRoutingNumberJText = new javax.swing.JTextField();
        AccTypeJLable = new javax.swing.JLabel();
        CheckingAccInfoTitleJText = new javax.swing.JLabel();
        BankAccNumberJText = new javax.swing.JTextField();
        BankNameJLable = new javax.swing.JLabel();
        SaveJButton1 = new javax.swing.JButton();

        BankRoutingNumberJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        BankRoutingNumberJLable.setText("Bank Routing Number:");

        BankAccNumberJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        BankAccNumberJLable.setText("Bank Account Number:");

        AccBalanceJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        AccBalanceJLable.setText("Account Balance:");

        AccTypeJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        AccTypeJLable.setText("Account Type:");

        CheckingAccInfoTitleJText.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        CheckingAccInfoTitleJText.setForeground(new java.awt.Color(153, 0, 0));
        CheckingAccInfoTitleJText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CheckingAccInfoTitleJText.setText("Checking Account Information");
        CheckingAccInfoTitleJText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        BankNameJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        BankNameJLable.setText("Bank Name:");

        SaveJButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        SaveJButton1.setForeground(new java.awt.Color(102, 102, 0));
        SaveJButton1.setText("SAVE");
        SaveJButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SaveJButton1.setBorderPainted(false);
        SaveJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AccTypeJLable)
                    .addComponent(BankNameJLable)
                    .addComponent(BankRoutingNumberJLable)
                    .addComponent(BankAccNumberJLable)
                    .addComponent(AccBalanceJLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BankRoutingNumberJText, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
                    .addComponent(BankAccNumberJText)
                    .addComponent(AccBalanceJText)
                    .addComponent(AccTypeJText)
                    .addComponent(BankNameJText))
                .addContainerGap(250, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CheckingAccInfoTitleJText, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(CheckingAccInfoTitleJText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankNameJLable)
                    .addComponent(BankNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankRoutingNumberJLable)
                    .addComponent(BankRoutingNumberJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BankAccNumberJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BankAccNumberJLable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccBalanceJLable)
                    .addComponent(AccBalanceJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AccTypeJLable)
                    .addComponent(AccTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SaveJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJButton1ActionPerformed
        // TODO add your handling code here:
         product.setcBankname(BankNameJText.getText());
        product.setCbankroutingno(BankRoutingNumberJText.getText());
        product.setCbankaccno(BankAccNumberJText.getText());
        product.setCaccbal(AccBalanceJText.getText());
        product.setCacctype(AccTypeJText.getText());

        JOptionPane.showMessageDialog(this, "Saved Successfully");
    }//GEN-LAST:event_SaveJButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccBalanceJLable;
    private javax.swing.JTextField AccBalanceJText;
    private javax.swing.JLabel AccTypeJLable;
    private javax.swing.JTextField AccTypeJText;
    private javax.swing.JLabel BankAccNumberJLable;
    private javax.swing.JTextField BankAccNumberJText;
    private javax.swing.JLabel BankNameJLable;
    private javax.swing.JTextField BankNameJText;
    private javax.swing.JLabel BankRoutingNumberJLable;
    private javax.swing.JTextField BankRoutingNumberJText;
    private javax.swing.JLabel CheckingAccInfoTitleJText;
    private javax.swing.JButton SaveJButton1;
    // End of variables declaration//GEN-END:variables

    private void display() {
         BankNameJText.setText(product.getcBankname());
        BankRoutingNumberJText.setText(product.getCbankroutingno());
        BankAccNumberJText.setText(product.getCbankaccno());
        AccBalanceJText.setText(product.getCaccbal());
        AccTypeJText.setText(product.getCacctype());
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
