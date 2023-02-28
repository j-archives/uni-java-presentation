
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class libraryFrame extends javax.swing.JFrame {

    /**
     * Creates new form libraryFrame
     */
    public libraryFrame() {
        this.setTitle("ooo");
        this.setResizable(false);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtstudentno = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateday = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        datemonth = new javax.swing.JComboBox<>();
        dateyear = new javax.swing.JComboBox<>();
        timehour = new javax.swing.JComboBox<>();
        timemin = new javax.swing.JComboBox<>();
        timeAMPM = new javax.swing.JComboBox<>();
        btntimeIn = new javax.swing.JButton();
        btntimeOut = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblcontent = new javax.swing.JTable();
        btnclear = new javax.swing.JButton();
        btnremove = new javax.swing.JButton();
        btnlogout = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        jLabel5.setText("username");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(236, 235, 235));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("NOW LIBRARY");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Student Account");

        txtstudentno.setBackground(new java.awt.Color(234, 234, 234));
        txtstudentno.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        txtstudentno.setBorder(null);

        txtname.setBackground(new java.awt.Color(234, 234, 234));
        txtname.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        txtname.setBorder(null);
        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel6.setText("student no.");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel7.setText("name");

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel8.setText("time");

        dateday.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        dateday.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎ ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));
        dateday.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel9.setText("date");

        datemonth.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        datemonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎ ", "January", "February", "March", "April ", "May", "June", "July", "August", "September", "October", "November", "December" }));
        datemonth.setBorder(null);

        dateyear.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        dateyear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎ ", "2000", "2001 ", "2002 ", "2003 ", "2004 ", "2005 ", "2006 ", "2007 ", "2008 ", "2009 ", "2010 ", "2011 ", "2012 ", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023" }));
        dateyear.setBorder(null);

        timehour.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        timehour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎ ", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", " " }));
        timehour.setBorder(null);

        timemin.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        timemin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎ ", "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" }));
        timemin.setBorder(null);

        timeAMPM.setFont(new java.awt.Font("Yu Gothic", 0, 10)); // NOI18N
        timeAMPM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "‎ ", "AM", "PM" }));
        timeAMPM.setBorder(null);

        btntimeIn.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btntimeIn.setForeground(new java.awt.Color(102, 102, 102));
        btntimeIn.setText("TIME IN");
        btntimeIn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btntimeIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimeInActionPerformed(evt);
            }
        });

        btntimeOut.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btntimeOut.setForeground(new java.awt.Color(102, 102, 102));
        btntimeOut.setText("TIME OUT");
        btntimeOut.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btntimeOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntimeOutActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstudentno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btntimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btntimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(timehour, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timemin, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(timeAMPM, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dateday, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(datemonth, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dateyear, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 43, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(65, 65, 65)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtstudentno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datemonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(timehour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeAMPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btntimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblcontent.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        tblcontent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Number", "Name", "Date", "Time In", "Time Out"
            }
        ));
        jScrollPane1.setViewportView(tblcontent);

        btnclear.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnclear.setForeground(new java.awt.Color(102, 102, 102));
        btnclear.setText("CLEAR");
        btnclear.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });

        btnremove.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnremove.setForeground(new java.awt.Color(102, 102, 102));
        btnremove.setText("REMOVE");
        btnremove.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnlogout.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(102, 102, 102));
        btnlogout.setText("LOG OUT");
        btnlogout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnclear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnremove, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntimeInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimeInActionPerformed
        String day = dateday.getSelectedItem().toString();
        String month = datemonth.getSelectedItem().toString();
        String year = dateyear.getSelectedItem().toString();
        
        String min = timemin.getSelectedItem().toString();
        String hour = timehour.getSelectedItem().toString();
        String apm = timeAMPM.getSelectedItem().toString();
        
        
        
        String studentNo = txtstudentno.getText();
        String name = txtname.getText();
        String date = day + " " + month + " " + year;
        String time = hour + ":" + min + " " + apm;
        
        String timein = "Time In";
        
        DefaultTableModel model = (DefaultTableModel)tblcontent.getModel();
        model.addRow(new Object [] {studentNo, name, date, time});
        
        
    }//GEN-LAST:event_btntimeInActionPerformed

    private void btntimeOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntimeOutActionPerformed
        /*String day = dateday.getSelectedItem().toString();
        String month = datemonth.getSelectedItem().toString();
        String year = dateyear.getSelectedItem().toString();
        
        String min = timemin.getSelectedItem().toString();
        String hour = timehour.getSelectedItem().toString();
        String apm = timeAMPM.getSelectedItem().toString();
        
        
        
        String studentNo = txtstudentno.getText();
        String name = txtname.getText();
        String date = day + " " + month + " " + year;
        String time = hour + ":" + min + " " + apm;
        
        String timeout = "Time Out";
        
        DefaultTableModel model = (DefaultTableModel)tblcontent.getModel();
        model.addRow(new Object [] {studentNo, name, date, time, timeout});*/
        DefaultTableModel model = (DefaultTableModel)tblcontent.getModel();
        
        String min = timemin.getSelectedItem().toString();
        String hour = timehour.getSelectedItem().toString();
        String apm = timeAMPM.getSelectedItem().toString();
        String time = hour + ":" + min + " " + apm;
        
        model.setValueAt(time, tblcontent.getSelectedRow(), 4);
        
        
        
    }//GEN-LAST:event_btntimeOutActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblcontent.getModel();
        int rows = model.getRowCount()-1;
        
        for (int i = rows; i >= 0; i--) {
            model.removeRow(i);
        }
        JOptionPane.showMessageDialog(null, "The table is now empty!");
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        DefaultTableModel model = (DefaultTableModel)tblcontent.getModel();
        model.removeRow(tblcontent.getSelectedRow());
        JOptionPane.showMessageDialog(null, "Record/s deleted successfully!");
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to log out?", "Log Out", JOptionPane.YES_NO_OPTION);
        
        if (confirm == JOptionPane.YES_OPTION) {
            //login frame
            loginFrame frame = new loginFrame();
            frame.setVisible(true);
            dispose();
            
        } 
        else {
            //System.exit(0);
        }
    }//GEN-LAST:event_btnlogoutActionPerformed

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
            java.util.logging.Logger.getLogger(libraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(libraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(libraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(libraryFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new libraryFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btntimeIn;
    private javax.swing.JButton btntimeOut;
    private javax.swing.JComboBox<String> dateday;
    private javax.swing.JComboBox<String> datemonth;
    private javax.swing.JComboBox<String> dateyear;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tblcontent;
    private javax.swing.JComboBox<String> timeAMPM;
    private javax.swing.JComboBox<String> timehour;
    private javax.swing.JComboBox<String> timemin;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstudentno;
    // End of variables declaration//GEN-END:variables
}
