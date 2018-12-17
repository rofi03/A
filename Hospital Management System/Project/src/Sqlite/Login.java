/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sqlite;
import java.sql.*;
import javax.swing.JOptionPane;

 class Sqlite {
Connection conn=null;
public static Connection ConnectDB(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:database.sqlite");
        System.out.println("Connected");
        return conn;
    }
    catch(Exception e){
        System.out.println("Not connected");
    }
    return null;
    
}
} 



public class Login extends javax.swing.JFrame {
   // Connection conn=null;
    //private Object Connect;

    /**
     * Creates new form Test
     */
    public Login() {
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

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Select  :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 50, 65, 22);

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "N/A", "Doctor", "Nurse" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(90, 50, 100, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Username : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 120, 80, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Password :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 180, 80, 30);

        jTextField1.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(90, 120, 150, 33);

        jPasswordField1.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jPasswordField1);
        jPasswordField1.setBounds(90, 180, 150, 30);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Login");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(90, 240, 100, 30);

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Create Account");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(370, 120, 110, 30);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Forgotpassword");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(370, 180, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Login");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(210, 10, 34, 15);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Exit");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(230, 310, 60, 30);

        jButton5.setBackground(new java.awt.Color(204, 204, 204));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("About");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(370, 240, 110, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sqlite/medical-doctor-equipment.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 500, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                               
       conn = Sqlite.ConnectDB();        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       username=jTextField1.getText();
       password=jPasswordField1.getText();
       doctor=jComboBox1.getSelectedItem().toString();
       ResultSet rs=null;
       PreparedStatement ps=null;
       String query=new String();
       
       
            
       
       
       query="select * from datatable ";
      try{
          ps=conn.prepareStatement(query);
          rs=ps.executeQuery();
          int flag=0;
          
           if(doctor.contains("N/A")){
               JOptionPane.showMessageDialog(null, "Please Select User");
               flag=1;
           } 
           if(username.equals("")){
               JOptionPane.showMessageDialog(null, "Please Insert User Name");
               flag=1;
           }
           
           if(password.length()!=8){
               JOptionPane.showMessageDialog(null, "Invalid PassWord");
               flag=1;
           }
          if(flag==0){
          while(rs.next()){
              if(rs.getString("username").equals(username) && rs.getString("password").equals(password))
              {
                  
                  JOptionPane.showMessageDialog(null,"Login successful");
                  Homepage h=new Homepage(conn);
                  this.setVisible(false);
                  h.setVisible(true);
                  h.jLabel20.setText(rs.getString("firstname"));
                  h.jLabel23.setText(rs.getString("lastname"));
                  h.jLabel24.setText(rs.getString("title"));
                  h.jLabel25.setText(rs.getString("street1"));
                  h.jLabel26.setText(rs.getString("street2"));
                  h.jLabel27.setText(rs.getString("city"));
                  h.jLabel28.setText(rs.getString("country"));
                  h.jLabel29.setText(rs.getString("phone"));
                  h.jLabel30.setText(rs.getString("mobile"));
                  h.jLabel31.setText(rs.getString("email"));
                  h.jLabel32.setText(rs.getString("extra"));
                  h.jLabel33.setText(rs.getString("language"));
                
                 
                  
                  flag=1;
              }
          }
          }
          //if(flag==1)
              //JOptionPane.showMessageDialog(null,"Login failed try again");
          
      }catch(Exception e){
           JOptionPane.showMessageDialog(null,"Login failed try again");
      }
    
      
      
       
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        this.setVisible(false);
         Forgotpassword F=new Forgotpassword(conn);
           F.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          Createaccount C=new Createaccount(conn);
           this.setVisible(false);
           C.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
      //doctor=jComboBox1.getSelectedItem().toString();
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      System.exit(0); 
        
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       About A=new About ();
        this.setVisible(false);
         A.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public Connection conn=null;
    public String username=new String();
    public String password=new String();
    public String firstname=new String();
    public String lastname=new String();
    public String title=new String();
    public String street1=new String();
    public String street2=new String();
    public String city=new String();
    public String country=new String();
    public String phone=new String();
    public String mobile=new String();
    public String email=new String();
    public String extra=new String();
    public String language=new String();
    public String doctor=new String();
    
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
