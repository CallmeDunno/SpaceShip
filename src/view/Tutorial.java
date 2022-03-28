package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.Constants;
import model.UrlConstants;

public class Tutorial extends JFrame {

    private final ImageIcon imageLogo = new ImageIcon(UrlConstants.LOGO);
    private final String content = UrlConstants.TUTORIAL_GAMEPLAY;
    private final JLabel titleTutorial = new JLabel("TUTORIAL", JLabel.CENTER);

    public Tutorial() {
        buildTutorial();
        setTitle("Tutorial");
        setIconImage(imageLogo.getImage());
        setSize(Constants.BOARD_WITH, Constants.BOARD_HEIGHT);
        getContentPane().setBackground(Color.black);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    private void buildTutorial() {
        titleTutorial.setFont(new Font("Harrington", 1, 24));
        titleTutorial.setForeground(new Color(51, 255, 255));
        setLayout(new GridLayout(10, 1));
        add(titleTutorial);
        String[] line = content.split("\n");
        for (String string : line) {
            JLabel label = new JLabel(string, JLabel.CENTER);
            label.setFont(new Font("Algerian", 3, 12));
            label.setForeground(new Color(51, 255, 255));
            add(label);
        }
    }
}
