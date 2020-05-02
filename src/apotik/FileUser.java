/*
 * FileUser.java
 *
 * Created on 07 Jun 09, 22:51:12
 */

package apotik;

import java.beans.PropertyVetoException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author Ryan
 */
public class FileUser extends javax.swing.JInternalFrame {

    /** Creates new form FileUser */
    boolean edit = false;
    static ResultSet rs;
    static String un,nm;
    static Integer st;
    static FileUserDetail detail = new FileUserDetail(new JFrame(), true);

    public FileUser() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        txtCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rA = new javax.swing.JRadioButton();
        rK = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Managemen User");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(" Pencarian Data Pengguna (UserName)"));
        jPanel1.setName("jPanel1"); // NOI18N

        txtCari.setName("txtCari"); // NOI18N

        btnCari.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cari.gif"))); // NOI18N
        btnCari.setText("Cari");
        btnCari.setName("btnCari"); // NOI18N
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCari, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCari)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/prev.gif"))); // NOI18N
        btnPrev.setText("Prev");
        btnPrev.setName("btnPrev"); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next.gif"))); // NOI18N
        btnNext.setText("Next");
        btnNext.setName("btnNext"); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.gif"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.setName("btnTambah"); // NOI18N
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit.gif"))); // NOI18N
        btnDetail.setText("Detail");
        btnDetail.setName("btnDetail"); // NOI18N
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.gif"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.setName("btnHapus"); // NOI18N
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.gif"))); // NOI18N
        btnClose.setText("Close");
        btnClose.setName("btnClose"); // NOI18N
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setName("jPanel2"); // NOI18N

        jLabel1.setText("Nama Pengguna");
        jLabel1.setName("jLabel1"); // NOI18N

        txtNama.setEnabled(false);
        txtNama.setName("txtNama"); // NOI18N

        txtUser.setEnabled(false);
        txtUser.setName("txtUser"); // NOI18N

        jLabel2.setText("Nama User");
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText("Status");
        jLabel3.setName("jLabel3"); // NOI18N

        buttonGroup1.add(rA);
        rA.setText("Admin");
        rA.setEnabled(false);
        rA.setName("rA"); // NOI18N

        buttonGroup1.add(rK);
        rK.setText("Kasir");
        rK.setEnabled(false);
        rK.setName("rK"); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rK))
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(txtNama, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rA)
                    .addComponent(rK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x-f-user.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel4.setName("jLabel4"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPrev)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnClose)
                            .addComponent(btnDetail)
                            .addComponent(btnHapus)
                            .addComponent(btnTambah)))
                    .addComponent(jLabel4))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnNext, btnPrev});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClose, btnDetail, btnHapus, btnTambah});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrev)
                            .addComponent(btnNext))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnTambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnHapus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDetail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClose)
                        .addGap(21, 21, 21))))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnNext, btnPrev});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnClose, btnDetail, btnHapus, btnTambah});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        try {
            setSelected(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FileUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        all();
        teks();
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        try {
            rs.previous();
            if(rs.isBeforeFirst()==true)
            {
                rs.first();
                JOptionPane.showMessageDialog(null, "\t\tRecord Pertama");
            }
            un = rs.getString("idUser");
            nm = rs.getString("nmUser");
            st = rs.getInt("status");
            teks();
        } catch (SQLException ex) {}
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        try {
            rs.next();
            if(rs.isAfterLast()==true)
            {
                rs.last();
                JOptionPane.showMessageDialog(null, "\t\tRecord Terakhir");
            }
            un = rs.getString("idUser");
            nm = rs.getString("nmUser");
            st = rs.getInt("status");
            teks();
        } catch (SQLException ex) {}
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM user WHERE idUser = '"+txtUser.getText()+"'";
        try
        {
            Connection con = new sqlConfig().db();
            Statement stmt = con.createStatement();
            ResultSet rst = stmt.executeQuery(sql);
            if(rst.next())
            {
                detail.txtUser.setText(rst.getString("idUser"));
                detail.txtNama.setText(rst.getString("nmUser"));
                detail.txtPassword.setText(rst.getString("pwd"));
                detail.txtAlamat.setText(rst.getString("tmpLahir"));
                detail.txtTelp.setText(rst.getString("tlpUser"));
                detail.txtTempat.setText(rst.getString("tmpLahir"));
                detail.txtTgl.setText(rst.getDate("tglLahir").toString());
                Integer a = rst.getInt("status");
                if(a==0){detail.rK.setSelected(true);}else
                    if(a==1)detail.rA.setSelected(true);
                detail.txtNama.requestFocus();
            }
        }
        catch(SQLException e)
        {}
        try {
            setSelected(false);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(FileUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        detail.setLocationRelativeTo(this);
        detail.setVisible(true);
        detail.aktif(false);
        edit = true;
}//GEN-LAST:event_btnDetailActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        int respon = JOptionPane.showConfirmDialog(this,
                "Apakah data akan dihapus?\n"+
                "UserName : "+ txtUser.getText()+"\n" +
                "Nama : "+ txtNama.getText(),
                "Penghapusan Data",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (respon == 0) {
            try {
                Connection con = new sqlConfig().db();
                Statement stmt = con.createStatement();
                String sql = "DELETE FROM user WHERE idUser ='" + txtUser.getText() + "'";
                stmt.executeUpdate(sql);
                stmt.close();
                con.close();
                JOptionPane.showMessageDialog(this,"Data Berhasil Dihapus","Hapus Data",2);
                all();
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(this,"Data Gagal Dihapus","Hapus Data",2);
            }
        }
        all();
        teks();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
        detail.btnEdit.setText("Tambah");
        detail.btnClose.setText("Close");
        detail.aktif(true);
        detail.btnPassword.setEnabled(false);
        detail.txtUser.setText("");
        detail.txtNama.setText("");
        detail.txtAlamat.setText("");
        detail.txtPassword.setText("");
        detail.txtTelp.setText("");
        detail.txtTempat.setText("");
        detail.txtTgl.setText("");
        detail.rA.setSelected(false);
        detail.rK.setSelected(false);
        detail.txtUser.setEnabled(true);
        detail.txtPassword.setEnabled(true);
        detail.txtUser.requestFocus();
        detail.setLocationRelativeTo(this);
        detail.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        MainMenu.menu(true);
        dispose();
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        String sql = "SELECT * FROM user WHERE idUser LIKE '"+txtCari.getText()+"'";
        try
        {
            Connection con = new sqlConfig().db();
            Statement stmt = con.createStatement();
            ResultSet r = stmt.executeQuery(sql);
            r.next();
            un = r.getString("idUser");
            nm = r.getString("nmUser");
            st = r.getInt("status");
            teks();
            btnPrev.setEnabled(false);
            btnNext.setEnabled(false);
            btnTambah.setEnabled(false);
            btnCari.setEnabled(false);
            txtCari.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Data Ditemukan.\nKata Kunci "+txtCari.getText());
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,"Data tidak ada");
        }
        txtCari.setText("");
    }//GEN-LAST:event_btnCariActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnCari;
    public javax.swing.JButton btnClose;
    public javax.swing.JButton btnDetail;
    public javax.swing.JButton btnHapus;
    public javax.swing.JButton btnNext;
    public javax.swing.JButton btnPrev;
    public javax.swing.JButton btnTambah;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    protected static javax.swing.JRadioButton rA;
    protected static javax.swing.JRadioButton rK;
    public javax.swing.JTextField txtCari;
    protected static javax.swing.JTextField txtNama;
    protected static javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    static void all()
    {
        String sql = "SELECT * FROM user";
        try
        {
            Connection con = new sqlConfig().db();
            Statement stmt = con.createStatement();
            rs = stmt.executeQuery(sql);
            if(rs.next())
            {
                un = rs.getString("idUser");
                nm = rs.getString("nmUser");
                st = rs.getInt("status");
            }
        }
        catch(SQLException e)
        {}
    }

    static void teks()
    {
        txtUser.setText(un);
        txtNama.setText(nm);
        if(st==0){rK.setSelected(true);}else
            if(st==1)rA.setSelected(true);
    }



}