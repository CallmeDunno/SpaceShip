//File tạo frame game
package view;

import java.awt.EventQueue; //Trang chủ Oracle khuyên dùng vì giúp đảm bảo an toàn cho ứng dụng
import javax.swing.JFrame;

public class BoatApplication {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> { //invokeLater() chạy ứng dụng trong 1 luồng do EventQueue quản lý & lambda expression
            JFrame frame = new GameFrame();
            frame.setVisible(true);
        });
    }
}
