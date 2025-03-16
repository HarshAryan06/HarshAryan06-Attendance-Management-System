/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package attendance_management;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author manas
 */
public class Markattendance extends javax.swing.JFrame {
    private String status;

    /**
     * Creates new form Markattendance
     */
    public Markattendance() {
        initComponents();
        this.setResizable(false);
        Toolkit toolkit=getToolkit();
        Dimension size=toolkit.getScreenSize();
        setLocation(size.width/2-getWidth()/2,size.height/2-getHeight()/2);
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        a = new javax.swing.JTextField();
        s = new javax.swing.JTextField();
        f = new javax.swing.JComboBox();
        g = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        d = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        h = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mark Attendance");

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mark Attendance");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 60);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("Subject Code");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 70, 160, 40);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Student Id");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 140, 150, 40);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Month");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 420, 140, 40);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setText("Course");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 280, 170, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setText("Semester");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 350, 140, 40);

        a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aActionPerformed(evt);
            }
        });
        jPanel1.add(a);
        a.setBounds(230, 70, 270, 40);
        jPanel1.add(s);
        s.setBounds(230, 140, 280, 40);

        f.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "B.Tech(CSE)", "B.Tech(ME)", "B.Tech(CE)", "B.Tech(ECE)", "B.Tech(EE)","BCA","MCA","MBA"}));
        f.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fActionPerformed(evt);
            }
        });
        jPanel1.add(f);
        f.setBounds(230, 280, 210, 40);

        g.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th","5th","6th","7th","8th" }));
        jPanel1.add(g);
        g.setBounds(230, 350, 210, 40);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setText("Session");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 210, 130, 40);
        jPanel1.add(d);
        d.setBounds(230, 210, 280, 40);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 204, 0));
        jButton1.setText("MARK");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(130, 550, 140, 40);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 51));
        jButton2.setText("BACK");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(350, 550, 130, 40);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(0, 204, 0));
        jRadioButton1.setText("Present");
        jRadioButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.green, null, null));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(140, 480, 150, 40);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 0, 0));
        jRadioButton2.setText("Absent");
        jRadioButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 0, 0), new java.awt.Color(255, 0, 0), null, null));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(340, 480, 140, 40);

        h.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        jPanel1.add(h);
        h.setBounds(230, 420, 210, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/attendance_management/8.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 600, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Faculty nw=new Faculty();
        nw.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
        Date date=new Date();
        String currdate=sdf.format(date);
        SimpleDateFormat tdf=new SimpleDateFormat("HH:mm:ss");
        Date time=new Date();
        String currtime=tdf.format(time);
        String s1=a.getText();
        String s2=s.getText();
        String s3=d.getText();
        String s4=f.getSelectedItem().toString();
        String s5=g.getSelectedItem().toString();
        String s6=h.getSelectedItem().toString();
        try{
            if(s1.length()==0 || s2.length()==0 || s3.length()==0 || s4.length()==0 || s5.length()==0 || s6.length()==0)
            {

                JOptionPane.showMessageDialog(null, "Some fields are EMPTY!!!");
            }
            else
            {
            	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance_management?useSSL=false","root","root");
                String sql="Select subcode from subject where subcode=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setString(1,s1);
                ResultSet rs=ps.executeQuery();
                if(rs.next())
                {
                String sql2="Select studentid from student where studentid=?";
                PreparedStatement st = con.prepareStatement(sql2);
                st.setString(1,s2);
                ResultSet si=st.executeQuery();
                    if(si.next())
                    {
                        PreparedStatement rk = con.prepareStatement("insert into attendance values(?,?,?,?,?,?,?,?,?)");
                        rk.setString(1, s1);
                        rk.setString(2, s2);
                        rk.setString(3, s3);
                        rk.setString(4, s4);
                        rk.setString(5, s5);
                        rk.setString(6, s6);
                        rk.setString(7, currdate);
                        rk.setString(8, currtime);
                        rk.setString(9, status);
                        rk.executeUpdate();
                        {
                            JOptionPane.showMessageDialog(null, "Attendance Marked successfully");
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Wrong Subject Code or Student Id!!!");
                    }
                }
                else{
                        JOptionPane.showMessageDialog(null,"Wrong Subject Code or Student Id!!!");
                    }
            }
        }
        catch (HeadlessException | SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex);
            System.out.println(ex);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
    status = "Present";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
    status = "Absent";        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Markattendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Markattendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Markattendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Markattendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Markattendance().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField d;
    private javax.swing.JComboBox f;
    private javax.swing.JComboBox g;
    private javax.swing.JComboBox h;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField s;
    // End of variables declaration//GEN-END:variables
}
