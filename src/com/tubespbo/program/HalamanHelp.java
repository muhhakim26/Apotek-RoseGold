/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubespbo.program;

/**
 *
 * @author Muhammad Abdul Hakim
 */
public class HalamanHelp extends javax.swing.JFrame {

    /**
     * Creates new form HalamanHelp
     */
    public HalamanHelp() {
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

        BackgroundPanel = new javax.swing.JPanel();
        BarPanel = new javax.swing.JPanel();
        bthome1 = new javax.swing.JButton();
        btAS1 = new javax.swing.JButton();
        btLogin1 = new javax.swing.JButton();
        btpencarian1 = new javax.swing.JButton();
        bthelp1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        JAboutUS = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        closeX = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackgroundPanel.setLayout(null);

        BarPanel.setBackground(new java.awt.Color(194, 24, 91));
        BarPanel.setLayout(null);

        bthome1.setBackground(new java.awt.Color(194, 24, 91));
        bthome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bthome1.setForeground(new java.awt.Color(255, 255, 255));
        bthome1.setText("Home");
        bthome1.setContentAreaFilled(false);
        bthome1.setOpaque(true);
        bthome1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthome1ActionPerformed(evt);
            }
        });
        BarPanel.add(bthome1);
        bthome1.setBounds(0, 0, 73, 50);

        btAS1.setBackground(new java.awt.Color(194, 24, 91));
        btAS1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btAS1.setForeground(new java.awt.Color(255, 255, 255));
        btAS1.setText("About US");
        btAS1.setContentAreaFilled(false);
        btAS1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btAS1.setOpaque(true);
        btAS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAS1ActionPerformed(evt);
            }
        });
        BarPanel.add(btAS1);
        btAS1.setBounds(190, 0, 100, 50);

        btLogin1.setBackground(new java.awt.Color(194, 24, 91));
        btLogin1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLogin1.setForeground(new java.awt.Color(255, 255, 255));
        btLogin1.setText("Login");
        btLogin1.setContentAreaFilled(false);
        btLogin1.setOpaque(true);
        btLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogin1ActionPerformed(evt);
            }
        });
        BarPanel.add(btLogin1);
        btLogin1.setBounds(60, 0, 71, 50);

        btpencarian1.setBackground(new java.awt.Color(194, 24, 91));
        btpencarian1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btpencarian1.setForeground(new java.awt.Color(255, 255, 255));
        btpencarian1.setText("Search");
        btpencarian1.setContentAreaFilled(false);
        btpencarian1.setOpaque(true);
        btpencarian1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpencarian1ActionPerformed(evt);
            }
        });
        BarPanel.add(btpencarian1);
        btpencarian1.setBounds(120, 0, 79, 50);

        bthelp1.setBackground(new java.awt.Color(194, 24, 91));
        bthelp1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bthelp1.setForeground(new java.awt.Color(255, 255, 255));
        bthelp1.setText("Help");
        bthelp1.setContentAreaFilled(false);
        bthelp1.setOpaque(true);
        bthelp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthelp1ActionPerformed(evt);
            }
        });
        BarPanel.add(bthelp1);
        bthelp1.setBounds(280, 0, 63, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("APOTEK ROSEGOLD");
        BarPanel.add(jLabel3);
        jLabel3.setBounds(770, 0, 190, 50);

        BackgroundPanel.add(BarPanel);
        BarPanel.setBounds(20, 20, 970, 50);

        JAboutUS.setBackground(new java.awt.Color(255, 255, 255));
        JAboutUS.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Help");
        JAboutUS.add(jLabel12);
        jLabel12.setBounds(0, 20, 60, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Pencarian");
        JAboutUS.add(jLabel13);
        jLabel13.setBounds(10, 70, 540, 15);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Gunakan nama obat untuk melakukan pencarian");
        JAboutUS.add(jLabel14);
        jLabel14.setBounds(10, 110, 540, 15);

        closeX.setBackground(new java.awt.Color(255, 255, 255));
        closeX.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        closeX.setText("X");
        closeX.setContentAreaFilled(false);
        closeX.setOpaque(true);
        closeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeXActionPerformed(evt);
            }
        });
        JAboutUS.add(closeX);
        closeX.setBounds(503, 0, 50, 30);

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel17.setText("Untuk melakukan pencarian, silahkan kilik Search pada bar menu di atas");
        JAboutUS.add(jLabel17);
        jLabel17.setBounds(10, 90, 540, 15);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("Untuk melakukan manipulasi data obat (penambahan, pengubahan, dan penyimpanan) obat");
        JAboutUS.add(jLabel18);
        jLabel18.setBounds(10, 240, 540, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel15.setText("Manipulasi Data Obat");
        JAboutUS.add(jLabel15);
        jLabel15.setBounds(10, 220, 540, 15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel16.setText("Admin harus Login terlebih dahulu");
        JAboutUS.add(jLabel16);
        jLabel16.setBounds(10, 260, 540, 15);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel19.setText("Login");
        JAboutUS.add(jLabel19);
        jLabel19.setBounds(10, 150, 540, 20);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("Untuk melakukan Login, gunakan username dan password admin Anda ");
        JAboutUS.add(jLabel20);
        jLabel20.setBounds(10, 170, 540, 20);

        BackgroundPanel.add(JAboutUS);
        JAboutUS.setBounds(220, 110, 550, 390);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/jpg/OBackground 2.jpg"))); // NOI18N
        Background.setText("J");
        BackgroundPanel.add(Background);
        Background.setBounds(-80, 0, 1090, 550);

        getContentPane().add(BackgroundPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bthome1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthome1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanAwal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bthome1ActionPerformed

    private void btAS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAS1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new AboutUS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btAS1ActionPerformed

    private void btLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogin1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btLogin1ActionPerformed

    private void btpencarian1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpencarian1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanSearch().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btpencarian1ActionPerformed

    private void bthelp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthelp1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanHelp().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bthelp1ActionPerformed

    private void closeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeXActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanAwal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_closeXActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanHelp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel BackgroundPanel;
    private javax.swing.JPanel BarPanel;
    private javax.swing.JPanel JAboutUS;
    private javax.swing.JButton btAS1;
    private javax.swing.JButton btLogin1;
    private javax.swing.JButton bthelp1;
    private javax.swing.JButton bthome1;
    private javax.swing.JButton btpencarian1;
    private javax.swing.JButton closeX;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}