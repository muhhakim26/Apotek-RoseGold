/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubespbo.program;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Annisa Jufe Aryani
 */

public class HalamanSearch extends javax.swing.JFrame {
    public Connection koneksi;
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel model;
    
    /**
     * Creates new form HalamanSearch
     */
    public HalamanSearch() {
        initComponents();
        String[] header = {"No","Kode","Supplier Id","Nama Obat","Produsen","Stok","Harga"};
        model = new DefaultTableModel(header,0);
        tabel.setModel(model);
        tampil();
    }   
    
    public void tampil () {
        koneksi classKoneksi = new koneksi();
        int jumlahrow = tabel.getRowCount();
        for(int n=0; n<jumlahrow; n++){
            model.removeRow(0);
        }
        String cari = txtCari.getText();
        try{
            koneksi = classKoneksi.getkoneksi();
            st = koneksi.createStatement();
            rs = st.executeQuery("SELECT * FROM obat WHERE nama_obat LIKE '%"+cari+"%'");
            int No = 1;
            while(rs.next()){
                String[] row = {Integer.toString(No),rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};   
                model.addRow(row);
                No++;
            }
            tabel.setModel(model);
        }catch(SQLException ex){
            System.out.print(ex.getMessage());
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BarPanel = new javax.swing.JPanel();
        bthome1 = new javax.swing.JButton();
        btAS1 = new javax.swing.JButton();
        btLogin1 = new javax.swing.JButton();
        btpencarian1 = new javax.swing.JButton();
        bthelp1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(194, 24, 91));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabel);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gunakan nama obat untuk melakukan pencarian");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 660, -1));

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

        getContentPane().add(BarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 970, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/jpg/OBackground 2.jpg"))); // NOI18N
        Background.setText("jLabel1");
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-80, 0, 1090, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampil();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel BarPanel;
    private javax.swing.JButton btAS1;
    private javax.swing.JButton btLogin1;
    private javax.swing.JButton bthelp1;
    private javax.swing.JButton bthome1;
    private javax.swing.JButton btpencarian1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables
}
