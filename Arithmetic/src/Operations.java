/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author INTEL COREi7
 */
public class Operations extends javax.swing.JFrame {

float firstnum;
float secondnum;
float add;
float sub;
float mul;
float div;
    public Operations() {
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

        JOptionPane = new javax.swing.JOptionPane();
        Num1 = new javax.swing.JTextField();
        Num2 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Answer = new javax.swing.JLabel();
        Sub = new javax.swing.JButton();
        Mul = new javax.swing.JButton();
        Div = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Num2ActionPerformed(evt);
            }
        });

        Add.setText("Addition");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Answer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Sub.setText("Subtraction");
        Sub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubActionPerformed(evt);
            }
        });

        Mul.setText("Multiplication");
        Mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MulActionPerformed(evt);
            }
        });

        Div.setText("Division");
        Div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivActionPerformed(evt);
            }
        });

        jLabel1.setText("Number2");

        jLabel2.setText("Number1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Num2, javax.swing.GroupLayout.DEFAULT_SIZE, 277, Short.MAX_VALUE)
                                .addComponent(Num1))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(Add)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Sub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mul)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Div)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(4, 4, 4)
                .addComponent(Num1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Num2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Answer, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Sub)
                        .addComponent(Mul)
                        .addComponent(Div))
                    .addComponent(Add))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Num2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Num2ActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
try {
firstnum = Float.parseFloat(Num1.getText());
} catch (NumberFormatException e) {
// we have to use JOptionPane.showMessageDialog() to display error messages
JOptionPane.showMessageDialog(this, "Incorrect Value of First Number", "Error", JOptionPane.ERROR_MESSAGE);
}
try {
secondnum = Float.parseFloat(Num2.getText());
} catch (NumberFormatException e) {
JOptionPane.showMessageDialog(this, "Incorrect Value of Second Number", "Error", JOptionPane.ERROR_MESSAGE);
}
add=firstnum+secondnum;
Answer.setText("The Total of Two Numbers :"+add);



        
    }//GEN-LAST:event_AddActionPerformed

    private void SubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubActionPerformed
try {
firstnum = Float.parseFloat(Num1.getText());
} catch (NumberFormatException e) {
// we have to use JOptionPane.showMessageDialog() to display error messages
JOptionPane.showMessageDialog(this, "Incorrect Value of First Number", "Error", JOptionPane.ERROR_MESSAGE);
}
try {
secondnum = Float.parseFloat(Num2.getText());
} catch (NumberFormatException e) {
JOptionPane.showMessageDialog(this, "Incorrect Value of Second Number", "Error", JOptionPane.ERROR_MESSAGE);
}
sub=firstnum-secondnum;
Answer.setText("The Difference of Two Numbers :"+sub);
    }//GEN-LAST:event_SubActionPerformed

    private void MulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MulActionPerformed
try {
firstnum = Float.parseFloat(Num1.getText());
} catch (NumberFormatException e) {
// we have to use JOptionPane.showMessageDialog() to display error messages
JOptionPane.showMessageDialog(this, "Incorrect Value of First Number", "Error", JOptionPane.ERROR_MESSAGE);
}
try {
secondnum = Float.parseFloat(Num2.getText());
} catch (NumberFormatException e) {
JOptionPane.showMessageDialog(this, "Incorrect Value of Second Number", "Error", JOptionPane.ERROR_MESSAGE);
}
mul=firstnum*secondnum;
Answer.setText("The Product of Two Numbers :"+mul);
    }//GEN-LAST:event_MulActionPerformed

    private void DivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivActionPerformed
try {
firstnum = Float.parseFloat(Num1.getText());
} catch (NumberFormatException e) {
// we have to use JOptionPane.showMessageDialog() to display error messages
JOptionPane.showMessageDialog(this, "Incorrect Value of First Number", "Error", JOptionPane.ERROR_MESSAGE);
}
try {
secondnum = Float.parseFloat(Num2.getText());
} catch (NumberFormatException e) {
JOptionPane.showMessageDialog(this, "Incorrect Value of Second Number", "Error", JOptionPane.ERROR_MESSAGE);
}
div=firstnum/secondnum;
Answer.setText("The Quotient of Two Numbers :"+div);
    }//GEN-LAST:event_DivActionPerformed

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
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Operations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Operations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Answer;
    private javax.swing.JButton Div;
    private javax.swing.JOptionPane JOptionPane;
    private javax.swing.JButton Mul;
    private javax.swing.JTextField Num1;
    private javax.swing.JTextField Num2;
    private javax.swing.JButton Sub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
