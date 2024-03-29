/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.MainProduct;
import java.awt.Image;
import javax.swing.JOptionPane;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
/**
 *
 * @author 16177
 */
public class DriverInfoJPanel extends javax.swing.JPanel {
    File image;
    ImageIcon imageIcon;
    /**
     * Creates new form DriverInfoJPanel
     * 
     */
    MainProduct product;
    public DriverInfoJPanel(MainProduct product) {
        initComponents();
        this.product = product;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LicenseNumberJText = new javax.swing.JTextField();
        DOIJText = new javax.swing.JTextField();
        TitleJLabel = new javax.swing.JLabel();
        DOEJText = new javax.swing.JTextField();
        LicenseNumberJLable = new javax.swing.JLabel();
        BloodTypeJText = new javax.swing.JTextField();
        DOIJLable = new javax.swing.JLabel();
        DOEJLable = new javax.swing.JLabel();
        BloodTypeJLable = new javax.swing.JLabel();
        PictireJLable = new javax.swing.JLabel();
        UploadJButton = new javax.swing.JButton();
        SaveJButton1 = new javax.swing.JButton();

        TitleJLabel.setFont(new java.awt.Font("Traditional Arabic", 1, 14)); // NOI18N
        TitleJLabel.setForeground(new java.awt.Color(153, 0, 0));
        TitleJLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleJLabel.setText("Driver's License Information");
        TitleJLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));

        LicenseNumberJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        LicenseNumberJLable.setText("License Number:");

        DOIJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        DOIJLable.setText("Date of Issue:");

        DOEJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        DOEJLable.setText("Date of Expiry:");

        BloodTypeJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        BloodTypeJLable.setText("Blood type:");

        PictireJLable.setFont(new java.awt.Font("Sitka Subheading", 1, 12)); // NOI18N
        PictireJLable.setText("Upload Photo:");

        UploadJButton.setFont(new java.awt.Font("Sitka Text", 2, 12)); // NOI18N
        UploadJButton.setForeground(new java.awt.Color(0, 153, 153));
        UploadJButton.setText("UPLOAD PICTURE");
        UploadJButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UploadJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UploadJButtonActionPerformed(evt);
            }
        });

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
                .addGap(320, 320, 320)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DOEJLable)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DOIJLable, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(LicenseNumberJLable))
                    .addComponent(BloodTypeJLable)
                    .addComponent(PictireJLable))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DOIJText, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LicenseNumberJText, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOEJText, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BloodTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UploadJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 209, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SaveJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(TitleJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LicenseNumberJLable)
                    .addComponent(LicenseNumberJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOIJLable)
                    .addComponent(DOIJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DOEJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOEJLable))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BloodTypeJLable)
                    .addComponent(BloodTypeJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PictireJLable)
                    .addComponent(UploadJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SaveJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SaveJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveJButton1ActionPerformed
        // TODO add your handling code here:
        
         product.setLicenseno(LicenseNumberJText.getText());
         product.setDoi(DOIJText.getText());
         product.setDoe(DOEJText.getText());
         product.setBloodtype(BloodTypeJText.getText());
        

        JOptionPane.showMessageDialog(this, "Saved Successfully");
        
        product.imageIcon = new ImageIcon(image.getAbsolutePath());
        
        
        
    }//GEN-LAST:event_SaveJButton1ActionPerformed

    private void UploadJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UploadJButtonActionPerformed
        // TODO add your handling code here:
       JFileChooser  chooser= new JFileChooser();
       chooser.showOpenDialog(null);
       image = chooser.getSelectedFile();
       
       
        
        
        
        
        
        
      
        
        
        
    }//GEN-LAST:event_UploadJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BloodTypeJLable;
    private javax.swing.JTextField BloodTypeJText;
    private javax.swing.JLabel DOEJLable;
    private javax.swing.JTextField DOEJText;
    private javax.swing.JLabel DOIJLable;
    private javax.swing.JTextField DOIJText;
    private javax.swing.JLabel LicenseNumberJLable;
    private javax.swing.JTextField LicenseNumberJText;
    private javax.swing.JLabel PictireJLable;
    private javax.swing.JButton SaveJButton1;
    private javax.swing.JLabel TitleJLabel;
    private javax.swing.JButton UploadJButton;
    // End of variables declaration//GEN-END:variables

  

}
