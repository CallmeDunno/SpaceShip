package view;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.WindowConstants;
import model.UrlConstants;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Dell Inspiron 5515
 */
public class loadingDisplay extends JFrame {
    private JLabel mainImg = new JLabel();
    private JLabel jLabel3 = new JLabel();
    private JProgressBar loadingBar = new JProgressBar();
    private JLabel loadingLabel = new JLabel();
    private JLabel loadingValue = new JLabel();
           
    public loadingDisplay() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new AbsoluteLayout());

        loadingValue.setFont(new java.awt.Font("Harrington", 0, 18)); 
        loadingValue.setForeground(new java.awt.Color(255, 255, 255));
        loadingValue.setText("0 %");
        getContentPane().add(loadingValue, new AbsoluteConstraints(728, 560, 56, -1));

        loadingLabel.setFont(new java.awt.Font("Harrington", 1, 24)); 
        loadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        loadingLabel.setText("Loading...");
        getContentPane().add(loadingLabel, new AbsoluteConstraints(14, 546, -1, -1));

        jLabel3.setFont(new java.awt.Font("Harrington", 3, 48));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SPACE SHIP");
        getContentPane().add(jLabel3, new AbsoluteConstraints(252, 28, 336, 70));

        loadingBar.setForeground(new java.awt.Color(255, 153, 153));
        getContentPane().add(loadingBar, new AbsoluteConstraints(-14, 588, 812, 14));
        
        mainImg.setIcon(new ImageIcon(getClass().getResource("/view/img/loading_c.gif"))); 
        getContentPane().add(mainImg, new AbsoluteConstraints(0, 0, 798, 600));
        pack();
        setLocationRelativeTo(null);
        
    }

    public JLabel getMainImg() {
        return mainImg;
    }

    public void setMainImg(JLabel mainImg) {
        this.mainImg = mainImg;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JProgressBar getLoadingBar() {
        return loadingBar;
    }

    public void setLoadingBar(JProgressBar loadingBar) {
        this.loadingBar = loadingBar;
    }

    public JLabel getLoadingLabel() {
        return loadingLabel;
    }

    public void setLoadingLabel(JLabel loadingLabel) {
        this.loadingLabel = loadingLabel;
    }

    public JLabel getLoadingValue() {
        return loadingValue;
    }

    public void setLoadingValue(JLabel loadingValue) {
        this.loadingValue = loadingValue;
    }
    
    public void loading(){
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(50);
                this.loadingValue.setText(i+"%");
                
                if(i==30){
                    this.loadingLabel.setText("Connecting to Database");
                }
                
                if(i==60){
                    this.loadingLabel.setText("Connection success !");
                }
                        
                if(i==90){
                    this.loadingLabel.setText("Loading...");
                }
                this.loadingBar.setValue(i);
            }
//            start ga,
            this.setVisible(false);
        } catch (Exception e) {
        }
        

    }
    public static void main(String args[]) {
        loadingDisplay load = new loadingDisplay();
        load.setVisible(true);
        load.loading();
    }

              
   
}
