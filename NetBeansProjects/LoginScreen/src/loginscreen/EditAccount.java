/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package loginscreen;

import java.sql.Connection;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Chris
 */
public class EditAccount extends javax.swing.JFrame {

    /**
     * Creates new form EditAccount
     */
	 Mediator mediator;
	 Connection conn;
	 String loginName;

    public EditAccount(Mediator m, String l, Connection c) {
	mediator = m;
	loginName = l;
	conn = c;
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

		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);

	
        LeftJPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        RICImgLabel = new javax.swing.JLabel();
        RightInnerJpanel = new javax.swing.JPanel();
        yearLabel = new javax.swing.JLabel();
        semesterLabel = new javax.swing.JLabel();
        confirmLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        passwordTextField = new javax.swing.JTextField();
        confirmTextField = new javax.swing.JTextField();
        firstNameText = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        editAccountLabel = new javax.swing.JLabel();
        editAccountButton = new javax.swing.JButton();
        majorLabel = new javax.swing.JLabel();
        yearComboBox = new javax.swing.JComboBox();
        lastNameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        majorComboBox = new javax.swing.JComboBox();
        semesterComboBox = new javax.swing.JComboBox();
        emailTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftJPanel.setBackground(new java.awt.Color(255, 255, 255));
        LeftJPanel.setPreferredSize(new java.awt.Dimension(361, 468));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        RICImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginscreen/resources/index.jpg"))); // NOI18N

        RightInnerJpanel.setBackground(new java.awt.Color(255, 255, 255));
        RightInnerJpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        yearLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        yearLabel.setText("Start Year:");

        semesterLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        semesterLabel.setText("Semester:");

        confirmLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        confirmLabel.setText("Confirm Password:");

        passwordLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        passwordLabel.setText("Password:");

        firstNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        firstNameLabel.setText("First Name:");

        cancelButton.setBackground(new java.awt.Color(255, 0, 0));
        cancelButton.setForeground(new java.awt.Color(255, 255, 255));
        cancelButton.setText("Cancel");
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });

        editAccountLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        editAccountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editAccountLabel.setText("Edit Account");

        editAccountButton.setBackground(new java.awt.Color(0, 0, 255));
        editAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        editAccountButton.setText("Save Changes");
        editAccountButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editAccountButtonMouseClicked(evt);
            }
        });
        
		majorLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        majorLabel.setText("Major:");

        lastNameLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lastNameLabel.setText("Last Name");

        emailLabel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        emailLabel.setText("Email:");

        majorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Computer Science - BA", "Computer Science - BS" }));

        semesterComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fall", "Spring", "Summer" }));
		
		yearComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { Integer.toString(year), Integer.toString(year+1), Integer.toString(year+2), Integer.toString(year+3) }));

		firstNameText.setText(Student.getFirstName(loginName, conn));
		lastNameText.setText(Student.getLastName(loginName, conn));
		emailTextField.setText(Student.getEmail(loginName, conn));
		passwordTextField.setText(Student.getPassword(loginName, conn));
		confirmTextField.setText(Student.getConfirmPassword(loginName, conn));
		semesterComboBox.setSelectedIndex((Integer.parseInt(Student.getSemester(loginName, conn)) - 1));
		majorComboBox.setSelectedIndex(18 - Integer.parseInt(Student.getMajorNum(loginName, conn)));
		yearComboBox.setSelectedIndex(Integer.parseInt(Student.getYear(loginName, conn)) - year);

        javax.swing.GroupLayout RightInnerJpanelLayout = new javax.swing.GroupLayout(RightInnerJpanel);
        RightInnerJpanel.setLayout(RightInnerJpanelLayout);
        RightInnerJpanelLayout.setHorizontalGroup(
            RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightInnerJpanelLayout.createSequentialGroup()
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RightInnerJpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(majorLabel)
                            .addComponent(semesterLabel)
                            .addComponent(yearLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(confirmLabel)
                            .addComponent(passwordLabel))
                        .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(RightInnerJpanelLayout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(majorComboBox, 0, 136, Short.MAX_VALUE)
                                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(firstNameText)
                                    .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameText)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightInnerJpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(passwordTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(confirmTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(RightInnerJpanelLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(editAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RightInnerJpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(emailLabel))
                    .addGroup(RightInnerJpanelLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(editAccountButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        RightInnerJpanelLayout.setVerticalGroup(
            RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RightInnerJpanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(editAccountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(majorLabel)
                    .addComponent(majorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(semesterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semesterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearLabel)
                    .addComponent(yearComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(confirmLabel)
                    .addComponent(confirmTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(RightInnerJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editAccountButton)
                    .addComponent(cancelButton))
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(RightInnerJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(RICImgLabel)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(RICImgLabel)
                .addGap(18, 18, 18)
                .addComponent(RightInnerJpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout LeftJPanelLayout = new javax.swing.GroupLayout(LeftJPanel);
        LeftJPanel.setLayout(LeftJPanelLayout);
        LeftJPanelLayout.setHorizontalGroup(
            LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LeftJPanelLayout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        LeftJPanelLayout.setVerticalGroup(
            LeftJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        mediator.showStartup();
    }//GEN-LAST:event_cancelButtonMouseClicked
    //method to retrieve the passed data and populate the text fields
    private void editAccountButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAccountButtonMouseClicked
        if (passwordTextField.getText().equals(confirmTextField.getText())){
		Student.updateAccount(firstNameText.getText(), lastNameText.getText(),
                        (String)majorComboBox.getSelectedItem(), (String)semesterComboBox.getSelectedItem(),
                        (String)yearComboBox.getSelectedItem(), emailTextField.getText(),
                        passwordTextField.getText(), confirmTextField.getText(),loginName,conn);
		mediator.createStartupScreen2(loginName);
        }
	else{//if error on password entries this will capture and throw the message below.
		JOptionPane.showMessageDialog(null, "Password and Comfirm Password do not match");
        }
    }//GEN-LAST:event_editAccountButtonMouseClicked

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
            java.util.logging.Logger.getLogger(EditAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LeftJPanel;
    private javax.swing.JLabel RICImgLabel;
    private javax.swing.JPanel RightInnerJpanel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JTextField confirmTextField;
    private javax.swing.JButton editAccountButton;
    private javax.swing.JLabel editAccountLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JComboBox majorComboBox;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JComboBox semesterComboBox;
    private javax.swing.JLabel semesterLabel;
    private javax.swing.JComboBox yearComboBox;
    private javax.swing.JLabel yearLabel;
    // End of variables declaration//GEN-END:variables
}
