import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class cell extends JTextField implements MouseListener, ActionListener {
    int row = 0, col = 0;

    cell(){
        this.setPreferredSize(new Dimension(10,10));
        this.setBackground(new Color(0x0B2447));
        this.setCaretColor(this.getBackground());
        this.addMouseListener(this);
        this.setHorizontalAlignment(JTextField.CENTER);
        this.setForeground(new Color(0xA5D7E8));
        this.getCaret().setVisible(false);
        this.setFont(new Font("Helvetica",Font.BOLD,25));
        this.setBorder(BorderFactory.createMatteBorder(1,1,1,1,new Color(0x19376D)));


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.setBackground(new Color(0x576CBC));
        this.setCaretColor(this.getBackground());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setBackground(new Color(0x0B2447));
        this.setCaretColor(this.getBackground());
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
