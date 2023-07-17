import javax.swing.*;
import java.awt.*;

public class Main {

    public static class newWindow extends JFrame{
        RightMenuPanel rightMenuPanel = new RightMenuPanel();
        SudokuGrid sudokuGrid = new SudokuGrid();

        newWindow(){
            this.setTitle("Sudoku");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.getContentPane().setBackground(new Color(0x0B2447));
            this.setLayout(new BorderLayout());
            this.setBounds(50,50,1030,810);
            this.setLocationRelativeTo(null);

            rightMenuPanel.setBackground(new Color(0x0B2447));
            rightMenuPanel.setBorder(BorderFactory.createMatteBorder(0,1,0,0,new Color(0x19376D)));

            this.add(rightMenuPanel,BorderLayout.EAST);
            this.add(sudokuGrid);

            this.setVisible(true);

        }
    }

    public static void main(String[] args) {
        newWindow frame = new newWindow();
    }
}
