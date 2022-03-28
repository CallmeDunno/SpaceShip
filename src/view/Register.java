package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import model.UrlConstants;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Dell Inspiron 5515
 */
public class Register extends JFrame implements ActionListener {

    private String checkUsername = "^[a-zA-Z0-9._\\s]{8,20}$";
    private JLabel UsernameLabel = new JLabel();
    private JButton btnBack = new JButton();
    private JButton btnReset = new JButton();
    private JButton btnSubmit = new JButton();
    private JPanel formRegister = new JPanel();
    private JLabel mainImg = new JLabel();
    private JLabel registerLabel = new JLabel();
    private JTextField txtUsername = new JTextField();

    public Register() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        formRegister.setBackground(new Color(0, 0, 0, 70));

        registerLabel.setFont(new Font("Algerian", 1, 36));
        registerLabel.setForeground(new Color(255, 255, 255));
        registerLabel.setText("Register");

        UsernameLabel.setBackground(new Color(0, 0, 0));
        UsernameLabel.setFont(new Font("Harrington", 1, 18));
        UsernameLabel.setForeground(new Color(255, 255, 255));
        UsernameLabel.setText("Username:");

        btnReset.setBackground(new Color(51, 255, 255));
        btnReset.setFont(new Font("Algerian", 1, 24));
        btnReset.setForeground(new Color(255, 255, 255));
        btnReset.setText("Reset");
        btnReset.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnReset.addActionListener(this);

        btnSubmit.setBackground(new Color(51, 255, 255));
        btnSubmit.setFont(new Font("Algerian", 1, 24));
        btnSubmit.setForeground(new Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnSubmit.addActionListener(this);

        btnBack.setBackground(new Color(51, 255, 255));
        btnBack.setFont(new Font("Algerian", 1, 24));
        btnBack.setForeground(new Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBack.addActionListener(this);

        this.GroupLayout();

        getContentPane().add(formRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 252, 392, 252));
        mainImg.setIcon(new ImageIcon(getClass().getResource("/view/img/Register_c.png")));
        getContentPane().add(mainImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));
        pack();
        setLocationRelativeTo(null);
    }

    public String getCheckUsername() {
        return checkUsername;
    }

    public void setCheckUsername(String checkUsername) {
        this.checkUsername = checkUsername;
    }

    public JLabel getUsernameLabel() {
        return UsernameLabel;
    }

    public void setUsernameLabel(JLabel UsernameLabel) {
        this.UsernameLabel = UsernameLabel;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public JButton getBtnReset() {
        return btnReset;
    }

    public void setBtnReset(JButton btnReset) {
        this.btnReset = btnReset;
    }

    public JButton getBtnSubmit() {
        return btnSubmit;
    }

    public void setBtnSubmit(JButton btnSubmit) {
        this.btnSubmit = btnSubmit;
    }

    public JPanel getFormRegister() {
        return formRegister;
    }

    public void setFormRegister(JPanel formRegister) {
        this.formRegister = formRegister;
    }

    public JLabel getMainImg() {
        return mainImg;
    }

    public void setMainImg(JLabel mainImg) {
        this.mainImg = mainImg;
    }

    public JLabel getRegisterLabel() {
        return registerLabel;
    }

    public void setRegisterLabel(JLabel registerLabel) {
        this.registerLabel = registerLabel;
    }

    public JTextField getTxtUsername() {
        return txtUsername;
    }

    public void setTxtUsername(JTextField txtUsername) {
        this.txtUsername = txtUsername;
    }

    private void GroupLayout() {
        GroupLayout jPanel1Layout = new GroupLayout(formRegister);
        formRegister.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addComponent(registerLabel)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnSubmit, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                                .addGap(227, 227, 227)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btnReset)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnBack))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(UsernameLabel)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                                .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)))
                                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(registerLabel)
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(UsernameLabel)
                                        .addComponent(txtUsername, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnSubmit)
                                        .addComponent(btnBack)
                                        .addComponent(btnReset))
                                .addGap(72, 72, 72))
        );

    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == btnReset) {
            Register.this.btnResetActionPerformed(evt);
        } else if (evt.getSource() == btnSubmit) {
            Register.this.btnSubmitActionPerformed(evt);
        } else if (evt.getSource() == btnBack) {
            Register.this.btnBackActionPerformed(evt);
        }
    }

    private void btnResetActionPerformed(ActionEvent evt) {
        txtUsername.setText(null);
    }

    private void btnSubmitActionPerformed(ActionEvent evt) {
        try {
            if ("".equals(txtUsername.getText())) {
                JOptionPane.showConfirmDialog(this, "Vui lòng không để trống username !");
            } else if (!txtUsername.getText().matches(checkUsername)) {
                JOptionPane.showConfirmDialog(this, "Vui lòng nhập lại username !");
            } else {
                //add vào db

                JOptionPane.showConfirmDialog(this, "Tạo username thành công");
                txtUsername.setText(null);

                login log = new login();
                log.setVisible(true);
                this.setVisible(false);
            }
        } catch (Exception e) {
        }
    }

    private void btnBackActionPerformed(ActionEvent evt) {
        login log = new login();
        log.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) throws UnsupportedLookAndFeelException {
        Register reg = new Register();
        reg.setVisible(true);
    }

}
