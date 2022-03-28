/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import view.Main_Interface_1;
import view.Main_Interface_1;
import view.loadingDisplay;
import view.Register;
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
import javax.swing.WindowConstants;
import model.UrlConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Dell Inspiron 5515
 */
public class login extends JFrame implements ActionListener {

    private String checkLogin = "^[a-zA-Z0-9._\\s]{8,20}$";
    private JTextField TextUser = new JTextField();
    private JLabel blUsername = new JLabel();
    private JButton btnBack = new JButton();
    private JButton btnLogin = new JButton();
    private JButton btnRegister = new JButton();
    private JPanel formLogin = new JPanel();
    private JLabel loginLabel = new JLabel();
    private JLabel mainImg = new JLabel();

    public login() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        formLogin.setBackground(new Color(0, 0, 0, 80));

        loginLabel.setFont(new Font("Harrington", 1, 36));
        loginLabel.setForeground(new Color(255, 255, 255));
        loginLabel.setText(" Login");

        blUsername.setBackground(new Color(0, 0, 0));
        blUsername.setFont(new Font("Harrington", 0, 24));
        blUsername.setForeground(new Color(255, 255, 255));
        blUsername.setText("Username:");

        TextUser.setBackground(new Color(51, 51, 255));
        TextUser.setFont(new Font("Tahoma", 0, 14));
        TextUser.setForeground(new Color(255, 255, 255));
        TextUser.addActionListener(this);

        btnLogin.setBackground(new Color(51, 51, 255));
        btnLogin.setFont(new Font("Harrington", 1, 24));
        btnLogin.setForeground(new Color(255, 255, 255));
        btnLogin.setText("LOGIN");
        btnLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnLogin.addActionListener(this);

        btnRegister.setBackground(new Color(51, 51, 255));
        btnRegister.setFont(new Font("Harrington", 0, 24));
        btnRegister.setForeground(new Color(255, 255, 255));
        btnRegister.setText(" Create an username");
        btnRegister.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnRegister.addActionListener(this);

        btnBack.setBackground(new Color(51, 51, 255));
        btnBack.setFont(new Font("Harrington", 1, 24));
        btnBack.setForeground(new Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnBack.addActionListener(this);
        Grouplayout();

        getContentPane().add(formLogin, new AbsoluteConstraints(756, 112, 392, 420));
        mainImg.setIcon(new ImageIcon(getClass().getResource("/view/img/loginbackgroud.png")));
        getContentPane().add(mainImg, new AbsoluteConstraints(0, 0, 1380, 700));
        pack();
        setLocationRelativeTo(null);
    }

    public String getCheckLogin() {
        return checkLogin;
    }

    public void setCheckLogin(String checkLogin) {
        this.checkLogin = checkLogin;
    }

    public JTextField getTextUser() {
        return TextUser;
    }

    public void setTextUser(JTextField TextUser) {
        this.TextUser = TextUser;
    }

    public JLabel getBlUsername() {
        return blUsername;
    }

    public void setBlUsername(JLabel blUsername) {
        this.blUsername = blUsername;
    }

    public JButton getBtnBack() {
        return btnBack;
    }

    public void setBtnBack(JButton btnBack) {
        this.btnBack = btnBack;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }

    public void setBtnLogin(JButton btnLogin) {
        this.btnLogin = btnLogin;
    }

    public JButton getBtnRegister() {
        return btnRegister;
    }

    public void setBtnRegister(JButton btnRegister) {
        this.btnRegister = btnRegister;
    }

    public JPanel getFormLogin() {
        return formLogin;
    }

    public void setFormLogin(JPanel formLogin) {
        this.formLogin = formLogin;
    }

    public JLabel getLoginLabel() {
        return loginLabel;
    }

    public void setLoginLabel(JLabel loginLabel) {
        this.loginLabel = loginLabel;
    }

    public JLabel getMainImg() {
        return mainImg;
    }

    public void setMainImg(JLabel mainImg) {
        this.mainImg = mainImg;
    }

    private void Grouplayout() {
        GroupLayout formLoginLayout = new GroupLayout(formLogin);
        formLogin.setLayout(formLoginLayout);
        formLoginLayout.setHorizontalGroup(
                formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, formLoginLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(blUsername, GroupLayout.PREFERRED_SIZE, 123, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextUser, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
                                .addGap(185, 185, 185))
                        .addGroup(formLoginLayout.createSequentialGroup()
                                .addGroup(formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(formLoginLayout.createSequentialGroup()
                                                .addGap(145, 145, 145)
                                                .addComponent(loginLabel, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(formLoginLayout.createSequentialGroup()
                                                .addGap(66, 66, 66)
                                                .addGroup(formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(btnRegister, GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                                                        .addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(GroupLayout.Alignment.TRAILING, formLoginLayout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addGap(160, 160, 160))
        );
        formLoginLayout.setVerticalGroup(
                formLoginLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(formLoginLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(loginLabel)
                                .addGap(38, 38, 38)
                                .addGroup(formLoginLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(blUsername)
                                        .addComponent(TextUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addComponent(btnLogin)
                                .addGap(34, 34, 34)
                                .addComponent(btnRegister)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                .addComponent(btnBack)
                                .addContainerGap()
                        )
        );

    }

    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == TextUser) {
            login.this.TextUserActionPerformed(evt);
        } else if (evt.getSource() == btnLogin) {
            login.this.btnLoginActionPerformed(evt);
        } else if (evt.getSource() == btnRegister) {
            login.this.btnRegisterActionPerformed(evt);
        } else if (evt.getSource() == btnBack) {
            login.this.btnBackActionPerformed(evt);
        }
    }

    private void btnLoginActionPerformed(ActionEvent evt) {
        try {
            if ("".equals(TextUser.getText())) {
                JOptionPane.showConfirmDialog(this, "Vui lòng không để trông username !");
            } else if (!TextUser.getText().matches(checkLogin)) {
                JOptionPane.showConfirmDialog(this, "Vui lòng nhập lại username !");
            } else {
                loadingDisplay load = new loadingDisplay();
                this.setVisible(false);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void TextUserActionPerformed(ActionEvent evt) {

    }

    private void btnRegisterActionPerformed(ActionEvent evt) {

        Register reg = new Register();
        reg.setVisible(true);
        this.setVisible(false);
    }

    private void btnBackActionPerformed(ActionEvent evt) {
        view.Main_Interface_1 main = new Main_Interface_1();
        main.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {
        login log = new login();
        log.setVisible(true);
    }

}
