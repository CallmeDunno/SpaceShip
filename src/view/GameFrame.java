//File set frame của game
package view;

import javax.swing.JFrame;
import controller.MainGame;
import model.UrlConstants;
import model.ImageUtils;

public class GameFrame extends JFrame {
    private static final long serialVersionUID = 1L; 
    /*Serialization - cơ chế chuyển đổi trạng thái một đối tượng thành 
      một chuỗi byte sao cho chuỗi byte này có thể chuyển đổi ngược lại 
      thành một đối tượng.*/

    public GameFrame() {
        this.add(new MainGame());
        this.setResizable(false);
	this.pack();
	this.setTitle("Space Ship");
	this.setLocationRelativeTo(null);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setIconImage(ImageUtils.generateImageFromUrl(UrlConstants.LOGO));
	this.setAlwaysOnTop(true);
    }
}
