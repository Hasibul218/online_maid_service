/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maid.service.Maid;

import maid.service.LoginFrame;
import maid.service.Maid.LoginMaid;

/**
 *
 * @author hasib
 */
public class WhyUsFrame extends javax.swing.JFrame {

    /**
     * Creates new form WhyUsFrame
     */
    public WhyUsFrame() {
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
        jPanel2 = new javax.swing.JPanel();
        whyusbutton = new javax.swing.JButton();
        whatweofferbutton = new javax.swing.JButton();
        homebuttonforgotframe = new javax.swing.JButton();
        contactus = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));

        whyusbutton.setBackground(new java.awt.Color(0, 204, 255));
        whyusbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        whyusbutton.setText("Why us");
        whyusbutton.setBorder(new javax.swing.border.MatteBorder(null));
        whyusbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whyusbuttonActionPerformed(evt);
            }
        });

        whatweofferbutton.setBackground(new java.awt.Color(0, 204, 255));
        whatweofferbutton.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        whatweofferbutton.setText("What we offer");
        whatweofferbutton.setBorder(new javax.swing.border.MatteBorder(null));
        whatweofferbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whatweofferbuttonActionPerformed(evt);
            }
        });

        homebuttonforgotframe.setBackground(new java.awt.Color(0, 204, 255));
        homebuttonforgotframe.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        homebuttonforgotframe.setText("Home");
        homebuttonforgotframe.setBorder(new javax.swing.border.MatteBorder(null));
        homebuttonforgotframe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonforgotframeActionPerformed(evt);
            }
        });

        contactus.setBackground(new java.awt.Color(0, 204, 255));
        contactus.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        contactus.setText("Contact us");
        contactus.setBorder(new javax.swing.border.MatteBorder(null));
        contactus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactusActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        jButton2.setText("Logout");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(homebuttonforgotframe)
                .addGap(18, 18, 18)
                .addComponent(whatweofferbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(whyusbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(contactus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(whyusbutton)
                        .addComponent(whatweofferbutton)
                        .addComponent(homebuttonforgotframe)
                        .addComponent(contactus)))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Difference between other maid agencies and maid service ");

        jTextArea4.setBackground(new java.awt.Color(255, 0, 51));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextArea4.setRows(5);
        jTextArea4.setText("\n Most of them are not registered companies with no way to track them\n\n Will charge an advance payment - Will not answer phone calls\n\n Have a small database of 20-30 maids.\n\n Charge renewal fees after 1 year\n\n Place the same maid somewhere else after you pay them\n\n Will not answer phone calls when you ask for replacement\n\n Will only claim to do a background check. Will never do it\n\n Run by a single man");
        jTextArea4.setBorder(null);
        jScrollPane4.setViewportView(jTextArea4);

        jTextArea5.setBackground(new java.awt.Color(51, 255, 0));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("\n A professional corporate company with reliability\n\n No advance payment. Pay only after the maid joins\n\n Have a database of over 50000 maids and growing\n\n No renewal fees\n\n We are ethical. Client satisfaction is most important\n\n Immediate replacement\n\n We do document verification of the maid\n\n Over 100 employees working for your satisfaction");
        jTextArea5.setBorder(null);
        jScrollPane5.setViewportView(jTextArea5);

        jLabel2.setBackground(new java.awt.Color(0, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Other maid agencies");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Maid Service");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(330, 330, 330))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void whyusbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whyusbuttonActionPerformed
        // TODO add your handling code here:
        WhyUsFrame wf = new WhyUsFrame();
        wf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_whyusbuttonActionPerformed

    private void whatweofferbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whatweofferbuttonActionPerformed
        // TODO add your handling code here:
        WhatWeOfferFrame wf = new WhatWeOfferFrame();
        wf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_whatweofferbuttonActionPerformed

    private void homebuttonforgotframeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonforgotframeActionPerformed
        // TODO add your handling code here:
        LoginMaid lg = new LoginMaid();
        lg.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_homebuttonforgotframeActionPerformed

    private void contactusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactusActionPerformed
        // TODO add your handling code here:
        ContactUsFrame cf = new ContactUsFrame();
        cf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_contactusActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        LoginFrame lf = new LoginFrame();
        lf.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(WhyUsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WhyUsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WhyUsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WhyUsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WhyUsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton contactus;
    private javax.swing.JButton homebuttonforgotframe;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JButton whatweofferbutton;
    private javax.swing.JButton whyusbutton;
    // End of variables declaration//GEN-END:variables
}
