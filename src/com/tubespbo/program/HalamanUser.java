/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubespbo.program;

import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Muhammad Abdul Hakim
 */
public class HalamanUser extends javax.swing.JFrame {

    
    private void kosongkan_form(){
        txtID_USER.setEditable(true);
        txtID_USER.setText(null);
        txtNAMA.setText(null);
        txtJ_kelamin.setText(null);
        txtALAMAT.setText(null);
        txtNO_HP.setText(null);
        txtUSERNAME.setText(null);   
        txtPASSWORD.setText(null); 
    }
       
    private void tampilkan_data(){
        
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. ");
        model.addColumn("Id User");
        model.addColumn("Nama");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Alamat");
        model.addColumn("No HP");
        model.addColumn("Username");
        model.addColumn("Password");
                
        try{
            int no = 1;
            String sql = "SELECT * FROM admin";
            java.sql.Connection conn=(Connection)user.configDB();
            java.sql.Statement stm = conn.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);
            
            while(res.next ()){
                model.addRow(new Object []{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7)});          
            }
            tableadmin.setModel(model);
            
        }catch (SQLException e){
            System.out.println("Error : " + e.getMessage());     
        }
    }
       
    /**
     * Creates new form HalamanUSer
     */
    public HalamanUser() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarPanel = new javax.swing.JPanel();
        bthome = new javax.swing.JButton();
        btuser = new javax.swing.JButton();
        btpencarian = new javax.swing.JButton();
        btkasir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtID_USER = new javax.swing.JTextField();
        txtNAMA = new javax.swing.JTextField();
        txtJ_kelamin = new javax.swing.JTextField();
        txtALAMAT = new javax.swing.JTextField();
        txtNO_HP = new javax.swing.JTextField();
        txtUSERNAME = new javax.swing.JTextField();
        txtPASSWORD = new javax.swing.JTextField();
        btreset = new javax.swing.JButton();
        btkeluar = new javax.swing.JButton();
        bthapus = new javax.swing.JButton();
        btsimpan = new javax.swing.JButton();
        btedit = new javax.swing.JButton();
        btbatal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableadmin = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home Apotek Rose Gold");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BarPanel.setBackground(new java.awt.Color(194, 24, 91));
        BarPanel.setLayout(null);

        bthome.setBackground(new java.awt.Color(194, 24, 91));
        bthome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bthome.setForeground(new java.awt.Color(255, 255, 255));
        bthome.setText("Home");
        bthome.setContentAreaFilled(false);
        bthome.setOpaque(true);
        bthome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthomeActionPerformed(evt);
            }
        });
        BarPanel.add(bthome);
        bthome.setBounds(0, 0, 73, 40);

        btuser.setBackground(new java.awt.Color(194, 24, 91));
        btuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btuser.setForeground(new java.awt.Color(255, 255, 255));
        btuser.setText("User");
        btuser.setContentAreaFilled(false);
        btuser.setOpaque(true);
        btuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btuserActionPerformed(evt);
            }
        });
        BarPanel.add(btuser);
        btuser.setBounds(140, 0, 63, 40);

        btpencarian.setBackground(new java.awt.Color(194, 24, 91));
        btpencarian.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btpencarian.setForeground(new java.awt.Color(255, 255, 255));
        btpencarian.setText("Search");
        btpencarian.setContentAreaFilled(false);
        btpencarian.setOpaque(true);
        btpencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpencarianActionPerformed(evt);
            }
        });
        BarPanel.add(btpencarian);
        btpencarian.setBounds(70, 0, 79, 40);

        btkasir.setBackground(new java.awt.Color(194, 24, 91));
        btkasir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btkasir.setForeground(new java.awt.Color(255, 255, 255));
        btkasir.setText("Data Obat");
        btkasir.setContentAreaFilled(false);
        btkasir.setOpaque(true);
        btkasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkasirActionPerformed(evt);
            }
        });
        BarPanel.add(btkasir);
        btkasir.setBounds(190, 0, 103, 40);

        getContentPane().add(BarPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 1040, 40));

        jPanel2.setBackground(new java.awt.Color(194, 24, 91));
        jPanel2.setForeground(new java.awt.Color(247, 117, 153));
        jPanel2.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id User");
        jLabel5.setToolTipText("");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 30, 100, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nama");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 70, 100, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Alamat");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 150, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Jenis Kelamin");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 110, 110, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No HP");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 190, 100, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Username");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(40, 230, 100, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(40, 270, 100, 30);

        txtID_USER.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtID_USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtID_USERActionPerformed(evt);
            }
        });
        jPanel2.add(txtID_USER);
        txtID_USER.setBounds(140, 30, 200, 30);

        txtNAMA.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtNAMA);
        txtNAMA.setBounds(140, 70, 200, 30);

        txtJ_kelamin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtJ_kelamin);
        txtJ_kelamin.setBounds(140, 110, 200, 30);

        txtALAMAT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtALAMAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtALAMATActionPerformed(evt);
            }
        });
        jPanel2.add(txtALAMAT);
        txtALAMAT.setBounds(140, 150, 200, 30);

        txtNO_HP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtNO_HP);
        txtNO_HP.setBounds(140, 190, 200, 30);

        txtUSERNAME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel2.add(txtUSERNAME);
        txtUSERNAME.setBounds(140, 230, 200, 30);

        txtPASSWORD.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPASSWORDActionPerformed(evt);
            }
        });
        jPanel2.add(txtPASSWORD);
        txtPASSWORD.setBounds(140, 270, 200, 30);

        btreset.setText("Reset");
        btreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btresetActionPerformed(evt);
            }
        });
        jPanel2.add(btreset);
        btreset.setBounds(80, 320, 80, 30);

        btkeluar.setText("Keluar");
        btkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btkeluarActionPerformed(evt);
            }
        });
        jPanel2.add(btkeluar);
        btkeluar.setBounds(260, 370, 80, 30);

        bthapus.setText("Hapus");
        bthapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bthapusActionPerformed(evt);
            }
        });
        jPanel2.add(bthapus);
        bthapus.setBounds(80, 370, 80, 30);

        btsimpan.setText("Simpan");
        btsimpan.setPreferredSize(new java.awt.Dimension(63, 23));
        btsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsimpanActionPerformed(evt);
            }
        });
        jPanel2.add(btsimpan);
        btsimpan.setBounds(260, 320, 80, 30);

        btedit.setText("Edit");
        btedit.setPreferredSize(new java.awt.Dimension(63, 23));
        btedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteditActionPerformed(evt);
            }
        });
        jPanel2.add(btedit);
        btedit.setBounds(180, 320, 60, 30);

        btbatal.setText("Batal");
        btbatal.setMaximumSize(new java.awt.Dimension(51, 23));
        btbatal.setMinimumSize(new java.awt.Dimension(51, 23));
        btbatal.setPreferredSize(new java.awt.Dimension(63, 23));
        btbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btbatalActionPerformed(evt);
            }
        });
        jPanel2.add(btbatal);
        btbatal.setBounds(180, 370, 60, 30);

        tableadmin.setModel(new javax.swing.table.DefaultTableModel(
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
        tableadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableadminMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableadmin);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(370, 30, 640, 270);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 1040, 440));

        jPanel1.setBackground(new java.awt.Color(194, 24, 91));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(45, 20, 44));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Data Obat Apotek Rose Gold");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 1040, 60));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Foto/jpg/OBackground 2.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtALAMATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtALAMATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtALAMATActionPerformed

    private void bthapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthapusActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "DELETE FROM admin WHERE id_user ='"+txtID_USER.getText()+"'";
            java.sql.Connection conn = (Connection)home.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Hapus Data Berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_bthapusActionPerformed

    private void btkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkeluarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btkeluarActionPerformed

    private void btsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsimpanActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "INSERT INTO admin  VALUES ('"+txtID_USER.getText()+"','"+txtNAMA.getText()+"','"+txtJ_kelamin.getText()+"','"+txtALAMAT.getText()+"','"+txtNO_HP.getText()+"','"+txtUSERNAME.getText()+"','"+txtPASSWORD.getText()+"')";
            java.sql.Connection conn = (Connection)home.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Proses Simpan Data Berhasil");
            tampilkan_data();
            kosongkan_form();

        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btsimpanActionPerformed

    private void bteditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteditActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "UPDATE admin SET id_user='"+txtID_USER.getText()+"',nama='"+txtNAMA.getText()+"',jenis_kelamin='"+txtJ_kelamin.getText()+"',alamat='"+txtALAMAT.getText()+"',no_hp='"+txtNO_HP.getText()+"',username='"+txtUSERNAME.getText()+"',password='"+txtPASSWORD.getText()+"' WHERE id_user= '"+txtID_USER.getText()+"'";
            java.sql.Connection conn = (Connection)home.configDB();
            java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Edit Data Berhasil");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_bteditActionPerformed

    private void btbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btbatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_btbatalActionPerformed

    private void btresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btresetActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_btresetActionPerformed

    private void tableadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableadminMouseClicked
        // TODO add your handling code here:
        int baris = tableadmin.rowAtPoint(evt.getPoint());
        String id_user= tableadmin.getValueAt(baris, 1).toString();
        txtID_USER.setText(id_user);

        String nama = tableadmin.getValueAt(baris, 2).toString();
        txtNAMA.setText(nama);

        String jeniskelamin = tableadmin.getValueAt(baris, 3).toString();
        txtJ_kelamin.setText(jeniskelamin);

        String alamat = tableadmin.getValueAt(baris, 4).toString();
        txtALAMAT.setText(alamat);

        String no_hp = tableadmin.getValueAt(baris, 5).toString();
        txtNO_HP.setText(no_hp);

        String username = tableadmin.getValueAt(baris, 6).toString();
        txtUSERNAME.setText(username);
        
        String password = tableadmin.getValueAt(baris, 7).toString();
        txtPASSWORD.setText(password);
    }//GEN-LAST:event_tableadminMouseClicked

    private void txtID_USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtID_USERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtID_USERActionPerformed

    private void bthomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bthomeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanAwal().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bthomeActionPerformed

    private void btuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btuserActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanUser().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btuserActionPerformed

    private void btpencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btpencarianActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanSearch().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btpencarianActionPerformed

    private void btkasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btkasirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new HalamanApotek().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btkasirActionPerformed

    private void txtPASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPASSWORDActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JPanel BarPanel;
    private javax.swing.JButton btbatal;
    private javax.swing.JButton btedit;
    private javax.swing.JButton bthapus;
    private javax.swing.JButton bthome;
    private javax.swing.JButton btkasir;
    private javax.swing.JButton btkeluar;
    private javax.swing.JButton btpencarian;
    private javax.swing.JButton btreset;
    private javax.swing.JButton btsimpan;
    private javax.swing.JButton btuser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableadmin;
    private javax.swing.JTextField txtALAMAT;
    private javax.swing.JTextField txtID_USER;
    private javax.swing.JTextField txtJ_kelamin;
    private javax.swing.JTextField txtNAMA;
    private javax.swing.JTextField txtNO_HP;
    private javax.swing.JTextField txtPASSWORD;
    private javax.swing.JTextField txtUSERNAME;
    // End of variables declaration//GEN-END:variables
}
