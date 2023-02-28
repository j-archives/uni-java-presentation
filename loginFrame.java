import javax.swing.border.LineBorder;
import java.awt.Color;



public class loginFrame extends javax.swing.JFrame {

    
    public loginFrame() {
        initComponents();
        this.setTitle("ooo");
        this.setResizable(false);
        round();
        
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtusername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        btnlogin = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cbxshow = new javax.swing.JCheckBox();
        btnsignup = new javax.swing.JButton();
        lblvalid = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bearReading.jpg"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Login");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel3.setText("NOW LIBRARY");

        txtusername.setForeground(new java.awt.Color(102, 102, 102));
        txtusername.setText("Enter Username");
        txtusername.setBorder(null);
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel4.setText("username");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText("password");

        passwordfield.setForeground(new java.awt.Color(102, 102, 102));
        passwordfield.setText("Enter Password");
        passwordfield.setBorder(null);
        passwordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordfieldFocusLost(evt);
            }
        });
        passwordfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordfieldActionPerformed(evt);
            }
        });

        btnlogin.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnlogin.setText("LOGIN");
        btnlogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        cbxshow.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        cbxshow.setText("show password");
        cbxshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxshowActionPerformed(evt);
            }
        });

        btnsignup.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnsignup.setForeground(new java.awt.Color(102, 102, 102));
        btnsignup.setText("SIGN UP");
        btnsignup.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnsignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsignupActionPerformed(evt);
            }
        });

        lblvalid.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lblvalid.setText("ooo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtusername)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordfield)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblvalid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbxshow))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2))
                .addGap(0, 127, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordfield, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbxshow)
                    .addComponent(lblvalid))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsignup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public String username, password;
    private void round(){
        btnlogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btnsignup.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
    }
    
    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusernameActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        if (txtusername.getText().equals(username) && passwordfield.getText().equals(password)) {
            libraryFrame frame = new libraryFrame();
            frame.setVisible(true);
            dispose();
        }
        
        else {
            lblvalid.setText("Invalid Username or Password");
            lblvalid.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        if (txtusername.getText().equals("Enter Username")) {
            txtusername.setText("");
            txtusername.setForeground(new Color (102, 102, 102));
        }
    }//GEN-LAST:event_txtusernameFocusGained

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
        if (txtusername.getText().equals("")) {
            txtusername.setText("Enter Username");
            txtusername.setForeground(new Color (102, 102, 102));
        }
    }//GEN-LAST:event_txtusernameFocusLost

    private void cbxshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxshowActionPerformed
        if (cbxshow.isSelected()) {
            passwordfield.setEchoChar((char)0);
        }
        else {
            passwordfield.setEchoChar('*');
        }
    }//GEN-LAST:event_cbxshowActionPerformed

    private void passwordfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordfieldActionPerformed

    private void passwordfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusGained
       if (passwordfield.getText().equals("Enter Password")) {
            passwordfield.setText("");
            passwordfield.setForeground(new Color (102, 102, 102));
        }
    }//GEN-LAST:event_passwordfieldFocusGained

    private void passwordfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordfieldFocusLost
        if (passwordfield.getText().equals("")) {
            passwordfield.setText("*");
            passwordfield.setForeground(new Color (102, 102, 102));
        }
    }//GEN-LAST:event_passwordfieldFocusLost

    private void btnsignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsignupActionPerformed
        signupFrame frame = new signupFrame();
        frame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnsignupActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btnsignup;
    private javax.swing.JCheckBox cbxshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblvalid;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
