/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.app;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
/**
 *
 * @author Owner
 */
public class Employee extends javax.swing.JFrame {
Connection con=null;
ResultSet rs=null;
PreparedStatement pst=null;
    /**
     * Creates new form Doctor
     */
    public Employee() {
        initComponents();
        setLocationRelativeTo(null);
        this.setSize(400, 450);
        this.setLocation(350,50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Info");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(59, 25, 175, 29);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Employee ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(59, 75, 90, 16);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(59, 110, 70, 16);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(59, 145, 70, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(59, 180, 90, 16);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(59, 215, 70, 16);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Job");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(59, 250, 50, 16);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("NIC No.");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(59, 285, 70, 16);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(177, 72, 148, 22);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(177, 107, 148, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(177, 142, 148, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(177, 177, 148, 22);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(177, 282, 148, 22);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        jComboBox1.setSelectedIndex(-1);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(177, 212, 148, 22);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Nurse", "Maintenance Staff", "Other" }));
        jComboBox2.setSelectedIndex(-1);
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(177, 247, 148, 22);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(59, 351, 66, 25);

        jButton2.setText("New");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(143, 351, 73, 25);

        jButton3.setText("Submit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(252, 351, 73, 25);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Salary Per Day");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(59, 320, 100, 16);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(177, 317, 148, 22);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospital/app/9.jpg"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-220, 0, 630, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Reset(){/*reset*/
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jComboBox1.setSelectedIndex(-1);
    jComboBox2.setSelectedIndex(-1);
    jButton3.setEnabled(true);
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  this.setVisible(false);
  new MainPageGUI().setVisible(true);/*back*/
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    Reset();/*reset*/
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    try{
    con=Connect.getConnection();/*connecting to the database*/
    if (jTextField1.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter employee id","Error", JOptionPane.ERROR_MESSAGE);
                return;
    }
    if (jTextField2.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter employee name","Error", JOptionPane.ERROR_MESSAGE);
                return;
    }
    if (jTextField3.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter address","Error", JOptionPane.ERROR_MESSAGE);
                return;
    }
    if (jTextField4.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter contact no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
    }
    if (jComboBox1.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select gender","Error", JOptionPane.ERROR_MESSAGE);
                return;
    }
    if (jComboBox2.getSelectedItem().equals("")) {
                JOptionPane.showMessageDialog( this, "Please select job","Error", JOptionPane.ERROR_MESSAGE);
                return;
    }
    if (jTextField5.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter nic no.","Error", JOptionPane.ERROR_MESSAGE);
                return;
    }
    if (jTextField6.getText().equals("")) {
                JOptionPane.showMessageDialog( this, "Please enter salary per day","Error", JOptionPane.ERROR_MESSAGE);
                return;
    }/*empty textboxes*/
    Statement stmt;
    stmt=con.createStatement();
    /*selecting the table*/
    String sql1="Select E_ID from employee where E_ID='"+jTextField1.getText() + "'";
    rs=stmt.executeQuery(sql1);
    if(rs.next()){/*searching for the same ID*/
        JOptionPane.showMessageDialog( this, "Employee ID already exists","Error", JOptionPane.ERROR_MESSAGE);
        jTextField1.setText("");
        return;
    }
    /*creating a new employee*/
    String sql="insert into employee(E_ID, E_NAME, ADDRESS, CONTACT_NO, GENDER, E_TYPE, NIC, SALARY)values('"+jTextField1.getText()+ "','"+jTextField2.getText()+"','"+jTextField3.getText()+"','"+jTextField4.getText()+"','"+jComboBox1.getSelectedItem()+"','"+jComboBox2.getSelectedItem()+"','"+jTextField5.getText()+"','"+jTextField6.getText()+"')";
    pst=con.prepareStatement(sql);
    pst.execute();
    JOptionPane.showMessageDialog(this,"Successfully saved","Employee Record",JOptionPane.INFORMATION_MESSAGE);
    jButton3.setEnabled(false);
    
    }catch(HeadlessException | SQLException ex){
            JOptionPane.showMessageDialog(this,ex);

    }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
