/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author SERVIDOR
 */
public class Ejerc5 extends javax.swing.JFrame {

    /**
     * Creates new form Ejerc5
     */
    public Ejerc5() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDLey = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSegs = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSegf = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCah = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTpago = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSb = new javax.swing.JTextField();
        cmdCalcular = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 19, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("   DESCUENTO PARA TRABAJADORES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 300, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("   Descuento ley de politica publica:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 230, 40));

        txtDLey.setEditable(false);
        txtDLey.setBackground(new java.awt.Color(255, 255, 153));
        txtDLey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDLeyActionPerformed(evt);
            }
        });
        txtDLey.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDLeyKeyTyped(evt);
            }
        });
        jPanel1.add(txtDLey, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 150, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("  Descuento seguro social:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 170, 30));

        txtSegs.setEditable(false);
        txtSegs.setBackground(new java.awt.Color(255, 255, 153));
        txtSegs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegsKeyTyped(evt);
            }
        });
        jPanel1.add(txtSegs, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 150, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("   Descuento seguro forzoso:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 210, 40));

        txtSegf.setEditable(false);
        txtSegf.setBackground(new java.awt.Color(255, 255, 153));
        txtSegf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSegfKeyTyped(evt);
            }
        });
        jPanel1.add(txtSegf, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 150, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Descuendo por caja de ahorro:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 200, 30));

        txtCah.setEditable(false);
        txtCah.setBackground(new java.awt.Color(255, 255, 153));
        txtCah.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCahKeyTyped(evt);
            }
        });
        jPanel1.add(txtCah, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 150, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("  Total a pagar:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 110, 40));

        txtTpago.setEditable(false);
        txtTpago.setBackground(new java.awt.Color(255, 255, 153));
        txtTpago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTpagoKeyTyped(evt);
            }
        });
        jPanel1.add(txtTpago, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 160, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("  Sueldo Base:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 100, 30));

        txtSb.setBackground(new java.awt.Color(255, 255, 153));
        txtSb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSbActionPerformed(evt);
            }
        });
        txtSb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSbKeyTyped(evt);
            }
        });
        jPanel1.add(txtSb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 160, 30));

        cmdCalcular.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 80, 30));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 70, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 426, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDLeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDLeyActionPerformed
       
    }//GEN-LAST:event_txtDLeyActionPerformed

    private void txtSbKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSbKeyTyped
       char c=evt.getKeyChar(); 
             
         
          if(!Character.isDigit(c)) { 
              getToolkit().beep(); 
               
              evt.consume();    
          } 
    }//GEN-LAST:event_txtSbKeyTyped

    private void txtDLeyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDLeyKeyTyped
        
    }//GEN-LAST:event_txtDLeyKeyTyped

    private void txtSegsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegsKeyTyped
        
    }//GEN-LAST:event_txtSegsKeyTyped

    private void txtSegfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSegfKeyTyped
        
    }//GEN-LAST:event_txtSegfKeyTyped

    private void txtCahKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCahKeyTyped
       
    }//GEN-LAST:event_txtCahKeyTyped

    private void txtTpagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTpagoKeyTyped
        
    }//GEN-LAST:event_txtTpagoKeyTyped

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        String dley,dsg,dsf,dcah,ct;
        double sb;
        double desc1=0,desc2=0,desc3=0,desc4=0,total=0;
        
        if (txtSb.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite por favor el sueldo", "Error",JOptionPane.ERROR_MESSAGE);
            txtSb.requestFocusInWindow();
        }
        else{
            sb=Double.parseDouble(txtSb.getText());
            desc1=(sb*1)/100;
            desc2=(sb*4)/100;
            desc3=(sb*0.5)/100;
            desc4=(sb*5)/100;
            total=(sb-desc1-desc2-desc3-desc4);
        }
        dley=String.valueOf(desc1);
        txtDLey.setText(dley);
        dsg=String.valueOf(desc2);
        txtSegs.setText(dsg);
        dsf=String.valueOf(desc3);
        txtSegf.setText(dsf);
        dcah=String.valueOf(desc4);
        txtCah.setText(dcah);
        ct=String.valueOf(total);
        txtTpago.setText(ct);
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtCah.setText("");
        txtDLey.setText("");
        txtSb.setText("");
        txtSegf.setText("");
        txtSegs.setText("");
        txtTpago.setText("");
  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtSbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSbActionPerformed

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
            java.util.logging.Logger.getLogger(Ejerc5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejerc5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejerc5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejerc5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejerc5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCah;
    private javax.swing.JTextField txtDLey;
    private javax.swing.JTextField txtSb;
    private javax.swing.JTextField txtSegf;
    private javax.swing.JTextField txtSegs;
    private javax.swing.JTextField txtTpago;
    // End of variables declaration//GEN-END:variables
}
