/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online__examination;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nilesh_sharma
 */
public class dsa2 extends javax.swing.JFrame {

    /**
     * Creates new form dsa2
     */
    String username;
    String password;
    String studentID;
   int dsaresult;
   int result;
    public dsa2(String studentID,String username,String password) {
        this.username=username;
        this.password=password;
        this.studentID=studentID;
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jButton2.setText("SUBMIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(620, 470, 90, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("1.  The statement, head->Link->Link->Link = NULL terminates a linked list after its ______ node.");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 110, 537, 15);

        jRadioButton15.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton15.setText("Partition key");
        jRadioButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton15);
        jRadioButton15.setBounds(380, 350, 93, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("2. A ....... is a data structure that organizes data similar to a line in the supermarket, where the first one in line is the first one out.");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 170, 718, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("3.  When does top value of the stack changes?");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 240, 262, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("4.  What do you call the selected keys in the quick sort method?");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 310, 480, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("5.  Which of the following sorting algorithm is of divide-and-conquer type?");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 400, 407, 15);

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setText("2nd\t");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1);
        jRadioButton1.setBounds(50, 140, 47, 20);

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2.setText("4th");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2);
        jRadioButton2.setBounds(180, 140, 45, 23);

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton3.setText("5th");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton3);
        jRadioButton3.setBounds(400, 140, 45, 23);

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton6.setText("Stacks linked list");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton6);
        jRadioButton6.setBounds(180, 190, 113, 40);

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton4.setText("3rd");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton4);
        jRadioButton4.setBounds(580, 140, 43, 23);

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton5.setText("Queue linked list");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton5);
        jRadioButton5.setBounds(50, 200, 115, 23);

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton7.setText(" Both of them");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton7);
        jRadioButton7.setBounds(400, 200, 103, 23);

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton8.setText("Neither of them  ");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton8);
        jRadioButton8.setBounds(580, 200, 121, 23);

        jRadioButton12.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton12.setText("After deletion");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton12);
        jRadioButton12.setBounds(590, 280, 101, 23);

        jRadioButton11.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton11.setText("At the time of deletion   ");
        jRadioButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton11);
        jRadioButton11.setBounds(400, 280, 165, 23);

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton9.setText("Before deletion     ");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton9);
        jRadioButton9.setBounds(50, 280, 129, 23);

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton10.setText("While checking underflow  ");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton10);
        jRadioButton10.setBounds(190, 280, 175, 23);

        jRadioButton14.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton14.setText("Inner Key");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton14);
        jRadioButton14.setBounds(200, 350, 79, 23);

        jRadioButton17.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton17.setText("Bubble sort");
        jRadioButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton17);
        jRadioButton17.setBounds(60, 430, 87, 23);

        jRadioButton13.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton13.setText("Outer key ");
        jRadioButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton13);
        jRadioButton13.setBounds(60, 350, 85, 23);

        jRadioButton19.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton19.setText("  Quick sort");
        jRadioButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton19);
        jRadioButton19.setBounds(390, 430, 89, 23);

        jRadioButton20.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton20.setText("All of above");
        jRadioButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton20);
        jRadioButton20.setBounds(590, 430, 89, 23);

        jRadioButton16.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton16.setText("Pivot key ");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton16);
        jRadioButton16.setBounds(600, 350, 79, 23);

        jRadioButton18.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton18.setText("Insertion sort");
        jRadioButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton18);
        jRadioButton18.setBounds(200, 430, 99, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("                              DATA STUCTURE TEST");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 10, 680, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 763, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
              dsaresult=0;
         
     if(jRadioButton2.isSelected()){
             dsaresult++;
         }
     if(jRadioButton6.isSelected()){
             dsaresult++;
         }
     if(jRadioButton11.isSelected()){
             dsaresult++;
         }
     if(jRadioButton15.isSelected()){
             dsaresult++;
         }
     if(jRadioButton19.isSelected()){
             dsaresult++;
         }
        try
        {
            
           
            Class.forName("com.mysql.jdbc.Driver");
            String database="jdbc:mysql://localhost:3306/examination";
            Connection con =  (Connection) DriverManager.getConnection(database,"root","");
           
            Statement stat=con.createStatement();
            String query="Select * from result_table2 where username='"+username+"'and password='"+password+"'";
            System.out.println(query);
            ResultSet rs=stat.executeQuery(query);
            if(rs.next())
            {   
                JOptionPane.showMessageDialog(this,"user's result already exist");
            }
           else 
            { 
                String query1="insert into result_table2 values(null,'"+username+"','"+password+"','"+dsaresult+"')";
                //ResultSet rs1=stat.executeQuery(query1);
                 //System.out.println(query1);
                 stat.executeUpdate(query1);
                 JOptionPane.showMessageDialog(this,"Successfully Submitted");
           }
        }
            catch(Exception e)
                    {
                        System.out.println(e);
                    } 
            
                
 
        
        new resultdsa(studentID,username,password).setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton1.setSelected(false);
            jRadioButton4.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton5.isSelected()){
            jRadioButton6.setSelected(false);
            jRadioButton7.setSelected(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton6.isSelected()){
            jRadioButton5.setSelected(false);
            jRadioButton7.setSelected(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton7.isSelected()){
            jRadioButton6.setSelected(false);
            jRadioButton5.setSelected(false);
            jRadioButton8.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton8.isSelected()){
            jRadioButton6.setSelected(false);
            jRadioButton7.setSelected(false);
            jRadioButton5.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton9.isSelected()){
            jRadioButton10.setSelected(false);
            jRadioButton11.setSelected(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton10.isSelected()){
            jRadioButton9.setSelected(false);
            jRadioButton11.setSelected(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jRadioButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton11ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton11.isSelected()){
            jRadioButton10.setSelected(false);
            jRadioButton9.setSelected(false);
            jRadioButton12.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton11ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton12.isSelected()){
            jRadioButton10.setSelected(false);
            jRadioButton11.setSelected(false);
            jRadioButton9.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jRadioButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton13ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton13.isSelected()){
            jRadioButton14.setSelected(false);
            jRadioButton15.setSelected(false);
            jRadioButton16.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton13ActionPerformed

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton14.isSelected()){
            jRadioButton13.setSelected(false);
            jRadioButton15.setSelected(false);
            jRadioButton16.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton15ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton15.isSelected()){
            jRadioButton14.setSelected(false);
            jRadioButton13.setSelected(false);
            jRadioButton16.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton15ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton16.isSelected()){
            jRadioButton14.setSelected(false);
            jRadioButton15.setSelected(false);
            jRadioButton13.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    private void jRadioButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton17ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton17.isSelected()){
            jRadioButton18.setSelected(false);
            jRadioButton19.setSelected(false);
            jRadioButton20.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton17ActionPerformed

    private void jRadioButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton18ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton18.isSelected()){
            jRadioButton17.setSelected(false);
            jRadioButton19.setSelected(false);
            jRadioButton20.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton18ActionPerformed

    private void jRadioButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton19ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton19.isSelected()){
            jRadioButton18.setSelected(false);
            jRadioButton17.setSelected(false);
            jRadioButton20.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton19ActionPerformed

    private void jRadioButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton20ActionPerformed
        // TODO add your handling code here:
         if(jRadioButton20.isSelected()){
            jRadioButton18.setSelected(false);
            jRadioButton19.setSelected(false);
            jRadioButton17.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton20ActionPerformed

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
            java.util.logging.Logger.getLogger(dsa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dsa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dsa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dsa2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new dsa2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    // End of variables declaration//GEN-END:variables
}
