/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Mobile_Shop;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sai
 */
public class frm_View_Distrubutor_Details extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_View_Distrubutor_Details
     */
    public frm_View_Distrubutor_Details() {
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

        lb_Distrubutor_ID = new javax.swing.JLabel();
        tb_Distrubutor_ID = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        btn_View_All_Distrubutor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_Distrubutor_Details = new javax.swing.JTable();

        lb_Distrubutor_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lb_Distrubutor_ID.setText("Distrubutor ID ");

        tb_Distrubutor_ID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btn_Search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });

        btn_View_All_Distrubutor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_View_All_Distrubutor.setText("View All Customer");
        btn_View_All_Distrubutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_View_All_DistrubutorActionPerformed(evt);
            }
        });

        Table_Distrubutor_Details.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DIst_ID", "Name", "Address", "Mob_No", "AdharCard_No", "PAN_No", "E_Mail"
            }
        ));
        jScrollPane1.setViewportView(Table_Distrubutor_Details);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lb_Distrubutor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tb_Distrubutor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btn_View_All_Distrubutor, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lb_Distrubutor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tb_Distrubutor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_View_All_Distrubutor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     java.sql.Connection con;
        PreparedStatement pst;
    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed

        try {                                           
            
            
            int c = 0;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Mobile_Shop_DB","root","");
            pst = con.prepareStatement("select * From distrubutor_info Where Distrubutor_ID = '"+tb_Distrubutor_ID.getText()+"' ");

            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            c = rsmd.getColumnCount();
            DefaultTableModel Dtm = (DefaultTableModel) Table_Distrubutor_Details.getModel();

            Dtm.setRowCount(0);

            while(rs.next()){
                Vector v2 = new Vector();
                for(int i = 1 ; i <= c; i++)
                {
                    v2.add(rs.getString("Distrubutor_ID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("Mob_No"));
                    v2.add(rs.getString("AdharCard_No"));
                    v2.add(rs.getString("PAN_No"));
                    v2.add(rs.getString("E_Mail"));
                  

                }
                Dtm.addRow(v2);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frm_View_Distrubutor_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_View_Distrubutor_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btn_View_All_DistrubutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_View_All_DistrubutorActionPerformed
        try {
            int c = 0;

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Mobile_Shop_DB","root","");
            pst = con.prepareStatement("select * From distrubutor_info ");

            ResultSet rs = pst.executeQuery();
            ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
            c = rsmd.getColumnCount();
            DefaultTableModel Dtm = (DefaultTableModel) Table_Distrubutor_Details.getModel();

            Dtm.setRowCount(0);

            while(rs.next()){
                Vector v2 = new Vector();
                for(int i = 1 ; i <= c; i++)
                {
                   v2.add(rs.getString("Distrubutor_ID"));
                    v2.add(rs.getString("Name"));
                    v2.add(rs.getString("Address"));
                    v2.add(rs.getString("Mob_No"));
                    v2.add(rs.getString("AdharCard_No"));
                    v2.add(rs.getString("PAN_No"));
                    v2.add(rs.getString("E_Mail"));

                }
                Dtm.addRow(v2);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frm_View_Distrubutor_Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_View_Distrubutor_Details.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_View_All_DistrubutorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table_Distrubutor_Details;
    private javax.swing.JButton btn_Search;
    private javax.swing.JButton btn_View_All_Distrubutor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Distrubutor_ID;
    private javax.swing.JTextField tb_Distrubutor_ID;
    // End of variables declaration//GEN-END:variables
}
