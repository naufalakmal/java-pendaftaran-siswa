/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import model.DatabaseConnection;

/**
 *
 * @author Akmal
 */
public class Pendaftaran extends javax.swing.JFrame {

    /**
     * Creates new form penjuruan
     */
    Connection koneksi;
    public Pendaftaran() {
        getContentPane().setBackground(new Color(98,60,94));
        initComponents();
        koneksi = DatabaseConnection.getConnection("localhost", "3306", "root", "", "db_pendaftaran");
    }
    
    public void simpanData() {
        int nisn = Integer.parseInt(varNisn.getText());
        long no_telepon = Long.parseLong(varTelepon.getText());
        String nama = varNama.getText();
        String agama = varAgama.getText();
        String alamat = varAlamat.getText();
        String asal_sekolah  = varSekolah.getText();
        String tanggal_lahir = varTanggal.getText();
        String tempat_lahir = varTempat.getText();
        String jenis_kelamin = null;
        int nilai_rata = Integer.parseInt(varNilai.getText());
        
        try {
            Statement stmt = koneksi.createStatement();
            if (rbLaki.isSelected()) {
                jenis_kelamin = "Laki-Laki";
            } else if (rbPerempuan.isSelected()) {
                jenis_kelamin = "Perempuan";
            }
            String query = "INSERT INTO t_siswa(nisn,no_telepon,nama,agama,alamat,asal_sekolah,tanggal_lahir,tempat_lahir,jenis_kelamin,nilai_rata) "
                    + "VALUES('"+nisn+"','"+no_telepon+"','"+nama+"','"+agama+"','"+alamat+"','"+asal_sekolah+"','"+tanggal_lahir+"','"+tempat_lahir+"','"+jenis_kelamin+"','"+nilai_rata+"')";
            System.out.println(query);
            int berhasil = stmt.executeUpdate(query);
            if(berhasil == 1) {
                this.setVisible(false);
                Notif notif = new Notif();
                notif.setVisible(true);
            }else {
                JOptionPane.showMessageDialog(null, "Data Gagal Dimasukkan");
            }
            
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Terjadi Kesalahan pada database");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        title = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        varNisn = new javax.swing.JTextField();
        lblAgama = new javax.swing.JLabel();
        varAgama = new javax.swing.JTextField();
        lblTanggal = new javax.swing.JLabel();
        varTanggal = new javax.swing.JTextField();
        lblJk = new javax.swing.JLabel();
        lblSekolah = new javax.swing.JLabel();
        varNilai = new javax.swing.JTextField();
        rbLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        lblTelepon = new javax.swing.JLabel();
        varTelepon = new javax.swing.JTextField();
        lblNama1 = new javax.swing.JLabel();
        varNama = new javax.swing.JTextField();
        varSekolah = new javax.swing.JTextField();
        lblTempat1 = new javax.swing.JLabel();
        varTempat = new javax.swing.JTextField();
        lblTanggal1 = new javax.swing.JLabel();
        btnAdmin = new javax.swing.JButton();
        btnDaftar = new javax.swing.JButton();
        lblAlamat = new javax.swing.JLabel();
        varAlamat = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        title.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("Pendaftaran Siswa");

        lblNama.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblNama.setForeground(new java.awt.Color(255, 255, 255));
        lblNama.setText("nisn");

        varNisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNisnActionPerformed(evt);
            }
        });

        lblAgama.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblAgama.setForeground(new java.awt.Color(255, 255, 255));
        lblAgama.setText("agama");

        varAgama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varAgamaActionPerformed(evt);
            }
        });

        lblTanggal.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblTanggal.setForeground(new java.awt.Color(255, 255, 255));
        lblTanggal.setText("tanggal_lahir");

        varTanggal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTanggalActionPerformed(evt);
            }
        });

        lblJk.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblJk.setForeground(new java.awt.Color(255, 255, 255));
        lblJk.setText("jenis_kelamin");

        lblSekolah.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblSekolah.setForeground(new java.awt.Color(255, 255, 255));
        lblSekolah.setText("nilai_rata");

        varNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNilaiActionPerformed(evt);
            }
        });

        rbLaki.setBackground(new java.awt.Color(98, 60, 94));
        buttonGroup1.add(rbLaki);
        rbLaki.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        rbLaki.setForeground(new java.awt.Color(255, 255, 255));
        rbLaki.setText("Laki-laki");
        rbLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbLakiActionPerformed(evt);
            }
        });

        rbPerempuan.setBackground(new java.awt.Color(98, 60, 94));
        buttonGroup1.add(rbPerempuan);
        rbPerempuan.setFont(new java.awt.Font("Poppins Light", 0, 12)); // NOI18N
        rbPerempuan.setForeground(new java.awt.Color(255, 255, 255));
        rbPerempuan.setText("Perempuan");
        rbPerempuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPerempuanActionPerformed(evt);
            }
        });

        lblTelepon.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblTelepon.setForeground(new java.awt.Color(255, 255, 255));
        lblTelepon.setText("no_telepon");

        varTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTeleponActionPerformed(evt);
            }
        });

        lblNama1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblNama1.setForeground(new java.awt.Color(255, 255, 255));
        lblNama1.setText("nama");

        varNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varNamaActionPerformed(evt);
            }
        });

        varSekolah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varSekolahActionPerformed(evt);
            }
        });

        lblTempat1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblTempat1.setForeground(new java.awt.Color(255, 255, 255));
        lblTempat1.setText("asal_sekolah");

        varTempat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varTempatActionPerformed(evt);
            }
        });

        lblTanggal1.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblTanggal1.setForeground(new java.awt.Color(255, 255, 255));
        lblTanggal1.setText("tempat_lahir");

        btnAdmin.setBackground(new java.awt.Color(98, 60, 94));
        btnAdmin.setFont(new java.awt.Font("Poppins Medium", 0, 10)); // NOI18N
        btnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAdmin.setText("Admin");
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        btnDaftar.setBackground(new java.awt.Color(98, 60, 94));
        btnDaftar.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnDaftar.setForeground(new java.awt.Color(255, 255, 255));
        btnDaftar.setText("Daftar");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        lblAlamat.setFont(new java.awt.Font("Poppins Light", 0, 14)); // NOI18N
        lblAlamat.setForeground(new java.awt.Color(255, 255, 255));
        lblAlamat.setText("alamat");

        varAlamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                varAlamatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(title)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNama)
                            .addComponent(lblAgama)
                            .addComponent(lblTanggal)
                            .addComponent(lblJk)
                            .addComponent(lblNama1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(varTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(varAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(varNisn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rbLaki)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rbPerempuan)))
                            .addComponent(varNama, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelepon)
                                    .addComponent(lblTempat1)
                                    .addComponent(lblTanggal1)
                                    .addComponent(lblSekolah))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(varNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(varTempat, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(varSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(varTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAlamat)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(varAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(title)
                    .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelepon)
                    .addComponent(varTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNama1)
                    .addComponent(varNama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(varNisn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAlamat)
                    .addComponent(varAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAgama)
                            .addComponent(varAgama, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTanggal)
                            .addComponent(varTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJk)
                            .addComponent(rbLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTempat1)
                            .addComponent(varSekolah, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTanggal1)
                            .addComponent(varTempat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSekolah)
                            .addComponent(varNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnDaftar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void varNisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNisnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNisnActionPerformed

    private void varAgamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varAgamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varAgamaActionPerformed

    private void varTanggalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTanggalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTanggalActionPerformed

    private void varNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNilaiActionPerformed

    private void rbLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbLakiActionPerformed

    private void rbPerempuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPerempuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbPerempuanActionPerformed

    private void varTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTeleponActionPerformed

    private void varNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varNamaActionPerformed

    private void varSekolahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varSekolahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varSekolahActionPerformed

    private void varTempatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varTempatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varTempatActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        // TODO add your handling code here:
        simpanData();
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void varAlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_varAlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_varAlamatActionPerformed

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
            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pendaftaran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnDaftar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblAgama;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblJk;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel lblNama1;
    private javax.swing.JLabel lblSekolah;
    private javax.swing.JLabel lblTanggal;
    private javax.swing.JLabel lblTanggal1;
    private javax.swing.JLabel lblTelepon;
    private javax.swing.JLabel lblTempat1;
    private javax.swing.JRadioButton rbLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JLabel title;
    private javax.swing.JTextField varAgama;
    private javax.swing.JTextField varAlamat;
    private javax.swing.JTextField varNama;
    private javax.swing.JTextField varNilai;
    private javax.swing.JTextField varNisn;
    private javax.swing.JTextField varSekolah;
    private javax.swing.JTextField varTanggal;
    private javax.swing.JTextField varTelepon;
    private javax.swing.JTextField varTempat;
    // End of variables declaration//GEN-END:variables
}