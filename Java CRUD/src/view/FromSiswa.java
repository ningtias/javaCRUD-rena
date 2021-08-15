/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ASUS
 */
public class FromSiswa extends javax.swing.JFrame {
    
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn=koneksi.koneksi.koneksi();
    
    public void judul() {
        Object[] judul = {
          "NIS", "Nama", "Jurusan", "JK", "Alamat"
        };
        tabModel = new DefaultTableModel(null, judul);
        tableSiswa.setModel(tabModel);
    }

    public void tampilData(String where) {
      try {
        st = cn.createStatement();
        tabModel.getDataVector().removeAllElements();
        tabModel.fireTableDataChanged();
        rs = st.executeQuery("SELECT * FROM students " + where);

        while (rs.next()) {
          Object[] data = {
            rs.getString("nis"),
            rs.getString("nama"),
            rs.getString("jurusan"),
            rs.getString("jk"),
            rs.getString("alamat"),
          };

            tabModel.addRow(data);
        }
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
    
    public void reset(){
      inputUsername.setText("");
      inputNama.setText("");
      inputAlamat.setText("");
      inputJurusan.setSelectedItem("");
      inputJK.setSelectedItem("");  
      
      inputUsername.setEnabled(true);
            btnSimpan.setEnabled(true);
            btnUpdate.setEnabled(false);
            btnHapus.setEnabled(false);
    }
    /**
     * Creates new form FormSiswa
     */
    public FromSiswa() {
        initComponents();
        judul();
        tampilData("");
        
        btnHapus.setEnabled(false);
        btnUpdate.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        inputUsername = new javax.swing.JTextField();
        inputNama = new javax.swing.JTextField();
        inputJK = new javax.swing.JComboBox<>();
        inputJurusan = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        inputAlamat = new javax.swing.JTextArea();
        btnSimpan = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setLabelFor(this);
        jLabel1.setText("FROM SISWA");

        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
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
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableSiswa);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("NIS");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Nama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Jurusan");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("JK");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Alamat");
        jLabel6.setToolTipText("");

        inputJK.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "L", "P" }));

        inputJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MM", "RPL", "TKJ", "APHP", "ATPH", "BO", "TKR", "TPM" }));

        inputAlamat.setColumns(20);
        inputAlamat.setRows(5);
        jScrollPane2.setViewportView(inputAlamat);

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSimpan)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnUpdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnReset))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnHapus)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(inputNama, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(inputJK, javax.swing.GroupLayout.Alignment.LEADING, 0, 108, Short.MAX_VALUE))
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(40, 77, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(inputNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(inputJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(inputJK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnHapus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnReset))
                .addContainerGap(125, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
     try{
       st = cn.createStatement();
           st.executeUpdate("INSERT INTO students VALUES('" + inputUsername.getText() + "','"
                + inputNama.getText() + "','"
                + inputJurusan.getSelectedItem() + "','"
                + inputJK.getSelectedItem() + "','"
                + inputAlamat.getText() + "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Berhasil");
            inputUsername.setText("");
            inputNama.setText("");
            inputAlamat.setText("");
            inputJurusan.setSelectedItem("");
            inputJK.setSelectedItem("");
           
       }catch(Exception e) {
           e.printStackTrace();
       }  
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
            inputUsername.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 0).toString());
            inputNama.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 1).toString());
            inputAlamat.setText(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 4).toString());
            inputJurusan.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 2).toString());
            inputJK.setSelectedItem(tableSiswa.getValueAt(tableSiswa.getSelectedRow(), 3).toString());
            
            inputUsername.setEnabled(false);
            btnSimpan.setEnabled(false);
            btnUpdate.setEnabled(true);
            btnHapus.setEnabled(true);
    }//GEN-LAST:event_tableSiswaMouseClicked

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
       reset();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
       try {
           st = cn.createStatement();
            st.executeUpdate("UPDATE students SET "
                + "nis='"       + inputUsername.getText() + "', "
                + "nama='"      + inputNama.getText() + "', "
                + "jurusan='"   + inputJurusan.getSelectedItem() + "', "
                + "jk='"        + inputJK.getSelectedItem() + "', "
                + "alamat='"    + inputAlamat.getText() + "' WHERE nis='"
                + tabModel.getValueAt(tableSiswa.getSelectedRow(), 0)+"'");
            
            tampilData("");
            JOptionPane.showMessageDialog(null, "Update Berhasil");
            reset();
            inputUsername.setEnabled(true);
            btnSimpan.setEnabled(true);
            btnUpdate.setEnabled(false);
            btnHapus.setEnabled(false);
            } catch (Exception e) {
                e.printStackTrace();
       } 
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        try{
            int jawab;
            
            if((jawab = JOptionPane.showConfirmDialog(null, "Apakah Anda Ingin Menghapus Data?", "Konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
                st = cn.createStatement();
                st.executeUpdate("DELETE FROM students WHERE nis='"
                + tabModel.getValueAt(tableSiswa.getSelectedRow(), 0)+"'");
                tampilData("");
                reset();
                inputUsername.setEnabled(true);
            btnSimpan.setEnabled(true);
            btnUpdate.setEnabled(false);
            btnHapus.setEnabled(false);
            }            
        } catch(Exception e) {
           e.printStackTrace();    
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(FromSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromSiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextArea inputAlamat;
    private javax.swing.JComboBox<String> inputJK;
    private javax.swing.JComboBox<String> inputJurusan;
    private javax.swing.JTextField inputNama;
    private javax.swing.JTextField inputUsername;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableSiswa;
    // End of variables declaration//GEN-END:variables
}
