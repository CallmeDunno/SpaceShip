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
import javax.swing.JPanel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;
import model.UrlConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;


public class Main_Interface_1 extends JFrame implements ActionListener {

    private JButton CreateUser = new JButton();
    private JButton Login = new JButton();
    private JButton PlayNow = new JButton();
    private JButton Tutorial = new JButton();
    private JLabel main_img = new JLabel();
    private JPanel FormContainer = new JPanel();

    public Main_Interface_1() {

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        FormContainer.setBackground(new Color(255, 255, 255, 70));

        Login.setBackground(new Color(51, 255, 255));
        Login.setFont(new Font("Algerian", 1, 24));
        Login.setText("LOGIN");
        Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Login.addActionListener(this);

        Tutorial.setBackground(new Color(51, 255, 255));
        Tutorial.setFont(new Font("Algerian", 1, 24));
        Tutorial.setText(" TUTORIALS");
        Tutorial.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Tutorial.addActionListener(this);

        PlayNow.setBackground(new Color(51, 255, 255));
        PlayNow.setFont(new Font("Algerian", 1, 24));
        PlayNow.setText("PLAY NOW");
        PlayNow.setCursor(new Cursor(Cursor.HAND_CURSOR));
        PlayNow.addActionListener(this);

        CreateUser.setBackground(new Color(51, 255, 255));
        CreateUser.setFont(new Font("Algerian", 1, 24));
        CreateUser.setText("CREATE USERNAME");
        CreateUser.setCursor(new Cursor(Cursor.HAND_CURSOR));
        CreateUser.addActionListener(this);

        this.Grouplayout();
        getContentPane().add(FormContainer, new AbsoluteConstraints(308, 126, 448, 350));
        main_img.setIcon(new ImageIcon(getClass().getResource("/view/img/mainInterface.png")));
        getContentPane().add(main_img, new AbsoluteConstraints(0, 0, 1064, 605));
        pack();
        setLocationRelativeTo(null);
    }

    public JButton getCreateUser() {
        return CreateUser;
    }

    public void setCreateUser(JButton CreateUser) {
        this.CreateUser = CreateUser;
    }

    public JButton getLogin() {
        return Login;
    }

    public void setLogin(JButton Login) {
        this.Login = Login;
    }

    public JButton getPlayNow() {
        return PlayNow;
    }

    public void setPlayNow(JButton PlayNow) {
        this.PlayNow = PlayNow;
    }

    public JButton getTutorial() {
        return Tutorial;
    }

    public void setTutorial(JButton Tutorial) {
        this.Tutorial = Tutorial;
    }

    public JLabel getMain_img() {
        return main_img;
    }

    public void setMain_img(JLabel main_img) {
        this.main_img = main_img;
    }

    public JPanel getFormContainer() {
        return FormContainer;
    }

    public void setFormContainer(JPanel FormContainer) {
        this.FormContainer = FormContainer;
    }

    private void Grouplayout() {
        GroupLayout jPanel1Layout = new GroupLayout(FormContainer);
        FormContainer.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(100, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(CreateUser, GroupLayout.Alignment.TRAILING)
                                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(Tutorial, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(PlayNow, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(Login, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
                                                .addGap(42, 42, 42)))
                                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Login)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(PlayNow)
                                .addGap(32, 32, 32)
                                .addComponent(Tutorial)
                                .addGap(36, 36, 36)
                                .addComponent(CreateUser)
                                .addGap(35, 35, 35))
        );
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        if (evt.getSource() == Login) {
            Main_Interface_1.this.LoginActionPerformed(evt);
        } else if (evt.getSource() == PlayNow) {
            Main_Interface_1.this.playNowActionPerformed(evt);
        } else if (evt.getSource() == Tutorial) {
            Main_Interface_1.this.TutorialActionPerformed(evt);
        } else if (evt.getSource() == CreateUser) {
            Main_Interface_1.this.CreateUserActionPerformed(evt);
        }
    }

    private void TutorialActionPerformed(ActionEvent evt) {
        new Tutorial().setVisible(true);
        
    }

    private void LoginActionPerformed(ActionEvent evt) {

        login log = new login();
        log.setVisible(true);
        this.setVisible(false);

    }

    private void playNowActionPerformed(ActionEvent evt) {
        loadingDisplay load = new loadingDisplay();
        load.loading();
        load.setVisible(true);
        this.setVisible(false);
    }

    private void CreateUserActionPerformed(ActionEvent evt) {
        Register reg = new Register();
        reg.setVisible(true);
        this.setVisible(false);
    }

    public static void main(String args[]) {
        new Main_Interface_1().setVisible(true);
    }
}
