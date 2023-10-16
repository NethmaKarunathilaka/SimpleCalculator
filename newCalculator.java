/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;
/**
 *
 * @author Nethma
 */
public class newCalculator extends javax.swing.JFrame {
     int num1;
     int num2;
     int result;
     String op;
     
    public newCalculator() {
        initComponents();
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jdiv = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        jmul = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        jmin = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jadd = new javax.swing.JButton();
        j0 = new javax.swing.JButton();
        jcorrect = new javax.swing.JButton();
        jdlt = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jenter = new javax.swing.JButton();
        jresult = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(java.awt.Color.black);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jdiv.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jdiv.setText("/");
        jdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdivActionPerformed(evt);
            }
        });
        getContentPane().add(jdiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, 50));

        j7.setBackground(new java.awt.Color(204, 204, 204));
        j7.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j7.setText("7");
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });
        getContentPane().add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 50));

        j8.setBackground(new java.awt.Color(204, 204, 204));
        j8.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j8.setText("8");
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });
        getContentPane().add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 50));

        j9.setBackground(new java.awt.Color(204, 204, 204));
        j9.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j9.setText("9");
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });
        getContentPane().add(j9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 50));

        jmul.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jmul.setText("*");
        jmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmulActionPerformed(evt);
            }
        });
        getContentPane().add(jmul, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 60, 50));

        j4.setBackground(new java.awt.Color(204, 204, 204));
        j4.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j4.setText("4");
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 50));

        j5.setBackground(new java.awt.Color(204, 204, 204));
        j5.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j5.setText("5");
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });
        getContentPane().add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 60, 50));

        j6.setBackground(new java.awt.Color(204, 204, 204));
        j6.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j6.setText("6");
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        getContentPane().add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 60, 50));

        jmin.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jmin.setText("-");
        jmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jminActionPerformed(evt);
            }
        });
        getContentPane().add(jmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 60, 50));

        j1.setBackground(new java.awt.Color(204, 204, 204));
        j1.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j1.setMnemonic('1');
        j1.setText("1");
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 60, 50));

        j2.setBackground(new java.awt.Color(204, 204, 204));
        j2.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j2.setText("2");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 60, 50));

        j3.setBackground(new java.awt.Color(204, 204, 204));
        j3.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j3.setText("3");
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 60, 50));

        jButton14.setBackground(new java.awt.Color(204, 204, 255));
        jButton14.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, 50));

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 50));

        jButton16.setBackground(new java.awt.Color(204, 204, 204));
        jButton16.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 50));

        jButton17.setBackground(new java.awt.Color(204, 204, 204));
        jButton17.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 50));

        jadd.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jadd.setText("+");
        jadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jaddActionPerformed(evt);
            }
        });
        getContentPane().add(jadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 60, 50));

        j0.setBackground(new java.awt.Color(204, 204, 204));
        j0.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        j0.setText("0");
        j0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j0ActionPerformed(evt);
            }
        });
        getContentPane().add(j0, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 60, 50));

        jcorrect.setBackground(new java.awt.Color(204, 204, 204));
        jcorrect.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jcorrect.setText("C");
        jcorrect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcorrectActionPerformed(evt);
            }
        });
        getContentPane().add(jcorrect, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 60, 50));

        jdlt.setBackground(new java.awt.Color(204, 204, 204));
        jdlt.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jdlt.setText("D");
        jdlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdltActionPerformed(evt);
            }
        });
        getContentPane().add(jdlt, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 60, 50));

        jButton22.setBackground(new java.awt.Color(204, 204, 255));
        jButton22.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 60, 50));

        jButton23.setBackground(new java.awt.Color(204, 204, 204));
        jButton23.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 50));

        jButton24.setBackground(new java.awt.Color(204, 204, 204));
        jButton24.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 60, 50));

        jButton25.setBackground(new java.awt.Color(204, 204, 204));
        jButton25.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 60, 50));

        jenter.setFont(new java.awt.Font("Microsoft JhengHei Light", 1, 24)); // NOI18N
        jenter.setText("ENTER");
        jenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenterActionPerformed(evt);
            }
        });
        getContentPane().add(jenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 200, 50));

        jresult.setFont(new java.awt.Font("Microsoft YaHei UI Light", 1, 24)); // NOI18N
        getContentPane().add(jresult, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 270, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Enternumber(String n){
       // String num=jresult.getText()+n;
        jresult.setText(n);//to display values in result
    }
private void Enterchar(String m){
    
    jresult.setText(m);
}

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
        Enternumber("7");//to get values
    }//GEN-LAST:event_j7ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
        Enternumber("8");
    }//GEN-LAST:event_j8ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        Enternumber("9");
    }//GEN-LAST:event_j9ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
      Enternumber("4");  
    }//GEN-LAST:event_j4ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
       Enternumber("5");
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
       Enternumber("6"); 
    }//GEN-LAST:event_j6ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
       Enternumber("1"); 
    }//GEN-LAST:event_j1ActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
       Enternumber("2"); 
    }//GEN-LAST:event_j2ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
       Enternumber("3");  
    }//GEN-LAST:event_j3ActionPerformed

    private void j0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j0ActionPerformed
        Enternumber("0"); 
    }//GEN-LAST:event_j0ActionPerformed

    private void jaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jaddActionPerformed
      int x=Integer.valueOf(jresult.getText());
      num1=x;
        Enterchar("+");
        op="+";
        //jresult.setText("");
            
    }//GEN-LAST:event_jaddActionPerformed

    private void jenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenterActionPerformed
        int y=Integer.valueOf(jresult.getText());
        num2=y; 
         switch(op){
             case "+": result=num1+num2;
             jresult.setText(String.valueOf(String.valueOf(num1)+"+"+String.valueOf(num2)+"="+result));
             break;
             case "-": result=num1-num2;
             jresult.setText(String.valueOf(String.valueOf(num1)+"-"+String.valueOf(num2)+"="+result));
             break;
             case "*": result=num1*num2;
             jresult.setText(String.valueOf(String.valueOf(num1)+"*"+String.valueOf(num2)+"="+result));
             break;
             case "/": double dresult,dnum1,dnum2;
                 dnum1=num1;
                 dnum2=num2;
                 dresult=dnum1/dnum2;
             jresult.setText(String.valueOf(String.valueOf(num1)+"/"+String.valueOf(num2)+"="+dresult));    
             
         }
        
        
    }//GEN-LAST:event_jenterActionPerformed

    private void jminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jminActionPerformed
        int x=Integer.valueOf(jresult.getText());
        num1=x;
        Enterchar("-");
        //jresult.setText("");
        op="-";
    }//GEN-LAST:event_jminActionPerformed

    private void jmulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmulActionPerformed
        int x=Integer.valueOf(jresult.getText());
        num1=x;
        Enterchar("*");
        //jresult.setText("");
        op="*";
    }//GEN-LAST:event_jmulActionPerformed

    private void jdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdivActionPerformed
        int x=Integer.valueOf(jresult.getText());
        num1=x;
        Enterchar("/");
        //jresult.setText("");
        op="/";
    }//GEN-LAST:event_jdivActionPerformed

    private void jdltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdltActionPerformed
        
    }//GEN-LAST:event_jdltActionPerformed

    private void jcorrectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcorrectActionPerformed
      jresult.setText("");
    }//GEN-LAST:event_jcorrectActionPerformed
    
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
            java.util.logging.Logger.getLogger(newCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newCalculator().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton j0;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JButton jadd;
    private javax.swing.JButton jcorrect;
    private javax.swing.JButton jdiv;
    private javax.swing.JButton jdlt;
    private javax.swing.JButton jenter;
    private javax.swing.JButton jmin;
    private javax.swing.JButton jmul;
    private javax.swing.JTextField jresult;
    // End of variables declaration//GEN-END:variables
}
