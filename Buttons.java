import javax.swing.*;
import java.awt.*;

public class Buttons extends JButton {

    Buttons(){
        this.setPreferredSize(new Dimension(100,50));
        this.setBackground(new Color(0xA2FF86));
        this.setHorizontalTextPosition(JButton.CENTER);
        this.setVerticalTextPosition(JButton.CENTER);
        this.setForeground(new Color(255,255,255));
        this.setFont(new Font("Helvetica",Font.BOLD,18));
        this.setFocusable(false);
        this.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color(0xA5D7E8)));
        this.setMargin(new Insets(10,10,10,10));

    }
}
