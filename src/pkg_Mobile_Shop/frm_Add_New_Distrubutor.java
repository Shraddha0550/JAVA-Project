/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg_Mobile_Shop;

import com.sun.jdi.connect.spi.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
/**
 *
 * @author sai
 */
public class frm_Add_New_Distrubutor extends javax.swing.JInternalFrame {

    /**
     * Creates new form frm_Add_New_Distrubutor
     */
    public frm_Add_New_Distrubutor() {
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
        lb_Mob_No = new javax.swing.JLabel();
        tb_Mobile_No = new javax.swing.JTextField();
        lb_Name = new javax.swing.JLabel();
        tb_Name = new javax.swing.JTextField();
        lb_PAN_No = new javax.swing.JLabel();
        tb_PAN_No = new javax.swing.JTextField();
        lb_Address = new javax.swing.JLabel();
        tb_Address = new javax.swing.JTextField();
        lb_Adhar_Card_No = new javax.swing.JLabel();
        tb_Adhar_Card_No = new javax.swing.JTextField();
        lb_E_mail = new javax.swing.JLabel();
        tb_E_Mail = new javax.swing.JTextField();
        lb_Brand_Deliver = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cb_MI = new javax.swing.JCheckBox();
        cb_POCO = new javax.swing.JCheckBox();
        cb_OPPO = new javax.swing.JCheckBox();
        cb_REALME = new javax.swing.JCheckBox();
        cb_VIVO = new javax.swing.JCheckBox();
        ch_SAMSUNG = new javax.swing.JCheckBox();
        btn_Save = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JButton();
        lb_Add_Category = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        lb_Distrubutor_ID.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_Distrubutor_ID.setText("Distrubutor ID");

        tb_Distrubutor_ID.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        lb_Mob_No.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_Mob_No.setText("Mobile No");

        tb_Mobile_No.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        lb_Name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_Name.setText("Name");

        tb_Name.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        lb_PAN_No.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_PAN_No.setText("PAN No");

        tb_PAN_No.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        lb_Address.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_Address.setText("Address");

        tb_Address.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        lb_Adhar_Card_No.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_Adhar_Card_No.setText("Adhar Card No");

        tb_Adhar_Card_No.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        lb_E_mail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_E_mail.setText("E-mail");

        tb_E_Mail.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        lb_Brand_Deliver.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        lb_Brand_Deliver.setText("Brand Deliverd ");

        cb_MI.setText("MI");

        cb_POCO.setText("POCO");

        cb_OPPO.setText("oppo");

        cb_REALME.setText("REALMI");

        cb_VIVO.setText("VIVO");

        ch_SAMSUNG.setText("SAMSUNG");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_MI, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_OPPO, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ch_SAMSUNG, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_VIVO, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_POCO, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_REALME, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_MI)
                    .addComponent(cb_POCO))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_OPPO)
                    .addComponent(cb_REALME))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_VIVO)
                    .addComponent(ch_SAMSUNG))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        btn_Save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Save.setText("Save");
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_Refresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_Refresh.setText("Refresh");

        lb_Add_Category.setFont(new java.awt.Font("MS Reference Sans Serif", 2, 24)); // NOI18N
        lb_Add_Category.setText("Add Distrubutor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(tb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_Distrubutor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(tb_Distrubutor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(tb_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_E_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(tb_E_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_PAN_No, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(tb_PAN_No, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lb_Mob_No, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(tb_Mobile_No, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lb_Brand_Deliver, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lb_Adhar_Card_No, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tb_Adhar_Card_No, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(435, 435, 435)
                        .addComponent(lb_Add_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lb_Add_Category, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_Mob_No, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tb_Mobile_No, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addComponent(tb_Adhar_Card_No, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Brand_Deliver, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(192, 192, 192))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_Distrubutor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tb_Distrubutor_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tb_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_PAN_No, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tb_PAN_No, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tb_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb_Adhar_Card_No, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_E_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tb_E_Mail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(169, 169, 169))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed

        if(cb_MI.isSelected()){
            String MI = "YES";
        }
        if(cb_OPPO.isSelected()){
            String OPPO = "YES";
        }

       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             java.sql.Connection con = (java.sql.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Mobile_Shop_DB","root","");

            PreparedStatement pst = con.prepareStatement("INSERT INTO distrubutor_info(Distrubutor_ID,Name,Address,Mob_No,AdharCard_No,PAN_No,E_Mail) VALUES(?,?,?,?,?,?,?)");
            pst.setString(1, tb_Distrubutor_ID.getText());
            pst.setString(2, tb_Name.getText());
            pst.setString(3, tb_Address.getText());
            pst.setString(4, tb_Mobile_No.getText());
            pst.setString(5, tb_Adhar_Card_No.getText());
            pst.setString(6, tb_PAN_No.getText());
            pst.setString(7, tb_E_Mail.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "SuccessFull");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frm_Add_New_Distrubutor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(frm_Add_New_Distrubutor.class.getName()).log(Level.SEVERE, null, ex);
        }
           
           

        

    }//GEN-LAST:event_btn_SaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_Save;
    private javax.swing.JCheckBox cb_MI;
    private javax.swing.JCheckBox cb_OPPO;
    private javax.swing.JCheckBox cb_POCO;
    private javax.swing.JCheckBox cb_REALME;
    private javax.swing.JCheckBox cb_VIVO;
    private javax.swing.JCheckBox ch_SAMSUNG;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb_Add_Category;
    private javax.swing.JLabel lb_Address;
    private javax.swing.JLabel lb_Adhar_Card_No;
    private javax.swing.JLabel lb_Brand_Deliver;
    private javax.swing.JLabel lb_Distrubutor_ID;
    private javax.swing.JLabel lb_E_mail;
    private javax.swing.JLabel lb_Mob_No;
    private javax.swing.JLabel lb_Name;
    private javax.swing.JLabel lb_PAN_No;
    private javax.swing.JTextField tb_Address;
    private javax.swing.JTextField tb_Adhar_Card_No;
    private javax.swing.JTextField tb_Distrubutor_ID;
    private javax.swing.JTextField tb_E_Mail;
    private javax.swing.JTextField tb_Mobile_No;
    private javax.swing.JTextField tb_Name;
    private javax.swing.JTextField tb_PAN_No;
    // End of variables declaration//GEN-END:variables
}