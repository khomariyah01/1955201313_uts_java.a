/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

/**
 *
 * @author User
 */
public class GUI_nota extends javax.swing.JFrame {

    /**
     * Creates new form GUI_toko
     */
    public GUI_nota() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbxpisangoriginal = new javax.swing.JCheckBox();
        cbxpisangkeju = new javax.swing.JCheckBox();
        cbxpisangcoklat = new javax.swing.JCheckBox();
        cbxpisangbakarspesial = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtjumlah1 = new javax.swing.JTextField();
        txtjumlah2 = new javax.swing.JTextField();
        txtjumlah3 = new javax.swing.JTextField();
        txtjumlah4 = new javax.swing.JTextField();
        cbxesteh = new javax.swing.JCheckBox();
        cbxesjeruk = new javax.swing.JCheckBox();
        cbxesdegan = new javax.swing.JCheckBox();
        cbxescampur = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtjumlah5 = new javax.swing.JTextField();
        txtjumlah6 = new javax.swing.JTextField();
        txtjumlah7 = new javax.swing.JTextField();
        txtjumlah8 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txApesan = new javax.swing.JTextField();
        btnpesan = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Menu Makanan :");

        jLabel2.setText("Harga :");

        jLabel3.setText("Jumlah :");

        jLabel4.setText("Menu Minuman :");

        jLabel5.setText("Harga :");

        jLabel6.setText("Jumlah :");

        cbxpisangoriginal.setText("Pisang original");

        cbxpisangkeju.setText("Pisang keju");

        cbxpisangcoklat.setText("Pisang coklat");

        cbxpisangbakarspesial.setText("Pisang bakar spesial");
        cbxpisangbakarspesial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxpisangbakarspesialActionPerformed(evt);
            }
        });

        jLabel7.setText("Rp 10.000");

        jLabel8.setText("Rp 15.000");

        jLabel9.setText("Rp 15.000");

        jLabel10.setText("Rp 20.000");

        txtjumlah3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah3ActionPerformed(evt);
            }
        });

        txtjumlah4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjumlah4ActionPerformed(evt);
            }
        });

        cbxesteh.setText("Es Teh");

        cbxesjeruk.setText("Es Jeruk");

        cbxesdegan.setText("Es Degan");
        cbxesdegan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxesdeganActionPerformed(evt);
            }
        });

        cbxescampur.setText("Es Campur");

        jLabel11.setText("Rp 3.000");

        jLabel12.setText("Rp 3.000");

        jLabel13.setText("Rp 7.000");

        jLabel14.setText("Rp 5.000");

        jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        jLabel15.setText("TOKO SINAR ABADI");

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        jLabel16.setText("DO HUB : 081234567899");

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 13)); // NOI18N
        jLabel17.setText("JL Raya Dlanggu No 123");

        jLabel18.setText("Menu Yang Dipesan : ");

        btnpesan.setText("Pesan");
        btnpesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpesanActionPerformed(evt);
            }
        });

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel16))
                .addGap(319, 319, 319))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(cbxpisangkeju)
                    .addComponent(cbxpisangcoklat)
                    .addComponent(cbxpisangbakarspesial)
                    .addComponent(cbxpisangoriginal))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel2))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGap(45, 45, 45)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jLabel3)))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(txtjumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                            .addComponent(jLabel8))
                                        .addGap(84, 84, 84)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(cbxesteh)
                                            .addComponent(cbxesdegan)
                                            .addComponent(cbxescampur)
                                            .addComponent(cbxesjeruk)))
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtjumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjumlah6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtjumlah7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(txtjumlah8, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txApesan, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(359, 359, 359)
                        .addComponent(btnpesan)
                        .addGap(65, 65, 65)
                        .addComponent(btnreset)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxpisangoriginal)
                    .addComponent(jLabel7)
                    .addComponent(txtjumlah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxesteh)
                    .addComponent(jLabel11)
                    .addComponent(txtjumlah5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxpisangcoklat)
                    .addComponent(jLabel8)
                    .addComponent(txtjumlah2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxesjeruk)
                    .addComponent(jLabel12)
                    .addComponent(txtjumlah6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxpisangkeju)
                    .addComponent(jLabel9)
                    .addComponent(txtjumlah3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxescampur)
                    .addComponent(jLabel14)
                    .addComponent(txtjumlah7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxpisangbakarspesial)
                    .addComponent(jLabel10)
                    .addComponent(txtjumlah4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxesdegan)
                    .addComponent(jLabel13)
                    .addComponent(txtjumlah8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txApesan, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnpesan)
                    .addComponent(btnreset))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxpisangbakarspesialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxpisangbakarspesialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxpisangbakarspesialActionPerformed

    private void txtjumlah4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah4ActionPerformed

    private void txtjumlah3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjumlah3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjumlah3ActionPerformed

    private void cbxesdeganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxesdeganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxesdeganActionPerformed

    private void btnpesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpesanActionPerformed
      String tampil;
      tampil = "";
      int bayar = 0;
      if (cbxpisangoriginal.isSelected()){
          int jumlah = Integer.parseInt(txtjumlah1.getText());
          int total;
          total = jumlah*10000;
          bayar = bayar*total;
          tampil +=cbxpisangoriginal.getText()+" Rp 10.000 "+" x "+jumlah+" = "+total+"\n";    
      } if (cbxpisangcoklat.isSelected()){
          int jumlah = Integer.parseInt(txtjumlah2.getText());
          int total;
          total = jumlah*15000;
          bayar = bayar*total;
          tampil +=cbxpisangcoklat.getText()+" Rp 15.000 "+" x "+jumlah+" = "+total+"\n";    
          
      } if (cbxpisangkeju.isSelected()){
          int jumlah = Integer.parseInt(txtjumlah3.getText());
          int total;
          total = jumlah*15000;
          bayar = bayar*total;
          tampil +=cbxpisangkeju.getText()+" Rp 15.000 "+" x "+jumlah+" = "+total+"\n";    
          
      } if (cbxpisangbakarspesial.isSelected()){
          int jumlah = Integer.parseInt(txtjumlah4.getText());
          int total;
          total = jumlah*20000;
          bayar = bayar*total;
          tampil +=cbxpisangbakarspesial.getText()+" Rp 20.000 "+" x "+jumlah+" = "+total+"\n";    
          
      } if (cbxesteh.isSelected()){
          int jumlah = Integer.parseInt(txtjumlah5.getText());
          int total;
          total = jumlah*3000;
          bayar = bayar*total;
          tampil +=cbxesteh.getText()+" Rp 3.000 "+" x "+jumlah+" = "+total+"\n";    
          
      } if (cbxesjeruk.isSelected()){
          int jumlah = Integer.parseInt(txtjumlah6.getText());
          int total;
          total = jumlah*3000;
          bayar = bayar*total;
          tampil +=cbxesjeruk.getText()+" Rp 3.000 "+" x "+jumlah+" = "+total+"\n";    
          
      } if (cbxescampur.isSelected()){
          int jumlah = Integer.parseInt(txtjumlah7.getText());
          int total;
          total = jumlah*5000;
          bayar = bayar*total;
          tampil +=cbxescampur.getText()+" Rp 5.000 "+" x "+jumlah+" = "+total+"\n";    
          
      } if (cbxesdegan.isSelected()){
          int jumlah = Integer.parseInt(txtjumlah8.getText());
          int total;
          total = jumlah*7000;
          bayar = bayar*total;
          tampil +=cbxesdegan.getText()+" Rp 7.000 "+" x "+jumlah+" = "+total+"\n";    
          
      }
      txApesan.setText(tampil+" ================================= "+"\n"+"Total Bayar ="+bayar); 
    }//GEN-LAST:event_btnpesanActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_nota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_nota().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnpesan;
    private javax.swing.JButton btnreset;
    private javax.swing.JCheckBox cbxescampur;
    private javax.swing.JCheckBox cbxesdegan;
    private javax.swing.JCheckBox cbxesjeruk;
    private javax.swing.JCheckBox cbxesteh;
    private javax.swing.JCheckBox cbxpisangbakarspesial;
    private javax.swing.JCheckBox cbxpisangcoklat;
    private javax.swing.JCheckBox cbxpisangkeju;
    private javax.swing.JCheckBox cbxpisangoriginal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txApesan;
    private javax.swing.JTextField txtjumlah1;
    private javax.swing.JTextField txtjumlah2;
    private javax.swing.JTextField txtjumlah3;
    private javax.swing.JTextField txtjumlah4;
    private javax.swing.JTextField txtjumlah5;
    private javax.swing.JTextField txtjumlah6;
    private javax.swing.JTextField txtjumlah7;
    private javax.swing.JTextField txtjumlah8;
    // End of variables declaration//GEN-END:variables
}
