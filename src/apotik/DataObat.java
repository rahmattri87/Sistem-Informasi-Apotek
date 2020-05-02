/*
 * DataObat.java
 *
 * Created on 13 Mei 09, 15:01:40
 */

package apotik;

import javax.swing.table.*;

/**
 *
 * @author Ryan
 */
public class DataObat extends javax.swing.JDialog {
    static DefaultTableModel tbl;
    /** Creates new form DataObat */
    public DataObat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblObat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Daftar Obat");
        setLocationByPlatform(true);
        setResizable(false);

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        tblObat.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblObat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Nama", "Harga", "Stok"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblObat.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_LAST_COLUMN);
        tblObat.setFocusable(false);
        tblObat.setName("tblObat"); // NOI18N
        tblObat.setRequestFocusEnabled(false);
        tblObat.getTableHeader().setReorderingAllowed(false);
        tblObat.setVerifyInputWhenFocusTarget(false);
        tblObat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblObatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblObat);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblObatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblObatMouseClicked
        // TODO add your handling code here:
        TranJual.txtOKode.setText(tbl.getValueAt(tblObat.getSelectedRow(), 1).toString());
        TranJual.txtONama.setText(tbl.getValueAt(tblObat.getSelectedRow(), 2).toString());
        TranJual.txtHarga.setText(tbl.getValueAt(tblObat.getSelectedRow(), 3).toString());
        setVisible(false);
        TranJual.txtBeli.requestFocus();
        TranJual.txtBeli.selectAll();
    }//GEN-LAST:event_tblObatMouseClicked

    /**
    * @param args the command line arguments
    */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected static javax.swing.JScrollPane jScrollPane1;
    protected static javax.swing.JTable tblObat;
    // End of variables declaration//GEN-END:variables

    static void kosong()
    {
        int r = tbl.getRowCount();
        for(int i=0; i<r; i++)
        {
            tbl.removeRow(r);
        }
    }

}
