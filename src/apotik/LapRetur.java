/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LapJual.java
 *
 * Created on 29 Jun 09, 11:29:35
 */

package apotik;

import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Ryan
 */
public class LapRetur extends javax.swing.JInternalFrame {
    int status = 0;
    /** Creates new form LapJual */
    public LapRetur() {
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

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        JPBulan = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbBulBlnAkhir = new javax.swing.JComboBox();
        cmbBulBlnAwal = new javax.swing.JComboBox();
        cmbBulThnAwal = new javax.swing.JComboBox();
        cmbBulThnAkhir = new javax.swing.JComboBox();
        JPTahun = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cmbThn = new javax.swing.JComboBox();
        btnCetak = new javax.swing.JButton();
        btnTutup = new javax.swing.JButton();

        setTitle("Laporan Retur Penjualan");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x-L-Retur.jpg"))); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jTabbedPane1.setName("jTabbedPane1"); // NOI18N

        JPBulan.setName("JPBulan"); // NOI18N

        jLabel4.setText("Bulan Awal");
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText("Bulan Akhir");
        jLabel5.setName("jLabel5"); // NOI18N

        cmbBulBlnAkhir.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Febuari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cmbBulBlnAkhir.setName("cmbBulBlnAkhir"); // NOI18N

        cmbBulBlnAwal.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Januari", "Febuari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        cmbBulBlnAwal.setName("cmbBulBlnAwal"); // NOI18N

        cmbBulThnAwal.setName("cmbBulThnAwal"); // NOI18N

        cmbBulThnAkhir.setName("cmbBulThnAkhir"); // NOI18N

        javax.swing.GroupLayout JPBulanLayout = new javax.swing.GroupLayout(JPBulan);
        JPBulan.setLayout(JPBulanLayout);
        JPBulanLayout.setHorizontalGroup(
            JPBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBulanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(25, 25, 25)
                .addGroup(JPBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbBulBlnAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBulBlnAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(JPBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbBulThnAkhir, 0, 70, Short.MAX_VALUE)
                    .addComponent(cmbBulThnAwal, 0, 70, Short.MAX_VALUE))
                .addGap(105, 105, 105))
        );
        JPBulanLayout.setVerticalGroup(
            JPBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPBulanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbBulBlnAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBulThnAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbBulBlnAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbBulThnAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Bulanan", JPBulan);

        JPTahun.setName("JPTahun"); // NOI18N

        jLabel6.setText("Pilih Tahun Transaksi");
        jLabel6.setName("jLabel6"); // NOI18N

        cmbThn.setName("cmbThn"); // NOI18N

        javax.swing.GroupLayout JPTahunLayout = new javax.swing.GroupLayout(JPTahun);
        JPTahun.setLayout(JPTahunLayout);
        JPTahunLayout.setHorizontalGroup(
            JPTahunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTahunLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(cmbThn, 0, 73, Short.MAX_VALUE)
                .addGap(129, 129, 129))
        );
        JPTahunLayout.setVerticalGroup(
            JPTahunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPTahunLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(JPTahunLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmbThn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tahunan", JPTahun);

        btnCetak.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/print.gif"))); // NOI18N
        btnCetak.setMnemonic('C');
        btnCetak.setText("Cetak");
        btnCetak.setName("btnCetak"); // NOI18N
        btnCetak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCetakActionPerformed(evt);
            }
        });
        btnCetak.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnCetakKeyPressed(evt);
            }
        });

        btnTutup.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.gif"))); // NOI18N
        btnTutup.setMnemonic('T');
        btnTutup.setText("Tutup");
        btnTutup.setName("btnTutup"); // NOI18N
        btnTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTutupActionPerformed(evt);
            }
        });
        btnTutup.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnTutupKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnCetak)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTutup)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTutup)
                    .addComponent(btnCetak))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCetakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCetakActionPerformed
        // TODO add your handling code here:
        cetak();
}//GEN-LAST:event_btnCetakActionPerformed

    private void btnCetakKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnCetakKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) cetak();
}//GEN-LAST:event_btnCetakKeyPressed

    private void btnTutupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTutupActionPerformed
        // TODO add your handling code here:
        dispose();
}//GEN-LAST:event_btnTutupActionPerformed

    private void btnTutupKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnTutupKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) dispose();
}//GEN-LAST:event_btnTutupKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPBulan;
    private javax.swing.JPanel JPTahun;
    private javax.swing.JButton btnCetak;
    private javax.swing.JButton btnTutup;
    protected static javax.swing.JComboBox cmbBulBlnAkhir;
    protected static javax.swing.JComboBox cmbBulBlnAwal;
    protected static javax.swing.JComboBox cmbBulThnAkhir;
    protected static javax.swing.JComboBox cmbBulThnAwal;
    protected static javax.swing.JComboBox cmbThn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

     void cetak()
    {
        String awal = null,akhir = null,periode = null,d=null, st= null;
        status = jTabbedPane1.getSelectedIndex();
        if(status==0)
        {
        String b1 = Integer.toString(cmbBulBlnAwal.getSelectedIndex()+1);if(b1.length()==1)b1= "0"+b1;
        String b2 = Integer.toString(cmbBulBlnAkhir.getSelectedIndex()+1);if(b2.length()==1)b2= "0"+b2;
        awal = cmbBulThnAwal.getSelectedItem().toString().substring(2)+ b1 + "01";
        akhir = cmbBulThnAkhir.getSelectedItem().toString().substring(2) + b2 + "99";
        periode = cmbBulBlnAwal.getSelectedItem().toString() + " " + cmbBulThnAwal.getSelectedItem().toString() + " - " +
                cmbBulBlnAkhir.getSelectedItem().toString() + " " + cmbBulThnAkhir.getSelectedItem().toString();
        st = "BULANAN";
        }
        else if(status==1)
        {
        awal = cmbThn.getSelectedItem().toString().substring(2) + "0101";
        akhir = cmbThn.getSelectedItem().toString().substring(2) + "1299";
        periode = cmbThn.getSelectedItem().toString();
        st = "TAHUNAN";
        }

        if(awal.compareTo(akhir) > 0)
        {
            JOptionPane.showMessageDialog(this, "Periode Awal Lebih Besar Dari Periode Akhir");
        }
        else
        {
            Connection co = new sqlConfig().db();
            try {
                Statement tm = co.createStatement();
                ResultSet rs = tm.executeQuery("SELECT SUM(grandRetur) FROM retur WHERE notaRetur between " + awal + " and " + akhir);
                rs.next();
                int zad = rs.getInt(1);
                d = Integer.toString(zad);
            } catch (SQLException ex) {
                Logger.getLogger(LapRetur.class.getName()).log(Level.SEVERE, null, ex);
            }
            String cetak[] = {"Cetak Layar","Cetak Kertas"};
            int z = JOptionPane.showOptionDialog(this, "Silahkan Pilih Mode Cetakan", getTitle(), 0, JOptionPane.QUESTION_MESSAGE, null, cetak, cetak[0]);
            if(z==0 || z==1)
            {
                setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
                Properties systemProp = System.getProperties();

                // Ambil current dir
                String currentDir = systemProp.getProperty("user.dir");
                Connection con = new sqlConfig().db();
                HashMap<String, Object> parameter = new HashMap<String, Object>();
                parameter.put("user", Login.nama);
                parameter.put("awal", "R" + awal);
                parameter.put("akhir", "R" + akhir);
                parameter.put("gambar",currentDir + "/report/logo.jpg");
                parameter.put("status", st);
                if(awal.compareTo(akhir)==0)parameter.put("periode",awal); else parameter.put("periode",periode);
                parameter.put("total", d);
                if(z==0)
                {
                    try {
                        JasperPrint jasperPrint = JasperFillManager.fillReport(currentDir + "/report/lap_retur.jasper", parameter, con);
                        JasperViewer.viewReport(jasperPrint, false);
                    } catch (JRException ex) {
                        Logger.getLogger(LapRetur.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else
                {
                    try {
                        JasperPrint jasperPrint = JasperFillManager.fillReport(currentDir + "/report/lap_retur.jasper", parameter, con);
                        JasperPrintManager.printReport(jasperPrint, true);
                    } catch (JRException ex) {
                        Logger.getLogger(LapRetur.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
                dispose();
            }
        }
    }
}
