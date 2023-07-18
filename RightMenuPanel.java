import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RightMenuPanel extends JPanel implements ActionListener {

    int[][] solution;
    cell[][] Cells;

    Buttons[] buttons = new Buttons[4];

    JPanel innerPanel = new JPanel();
    RightMenuPanel(int[][] solution , cell[][] Cells){
        this.Cells = Cells;
        this.solution = solution;
        this.setPreferredSize(new Dimension(220,100));
        this.setLayout(null);

        Insets insets = this.getInsets();

        innerPanel.setLayout(new GridLayout(4,1,40,50));

        innerPanel.setBounds(35,180,150,400);
        innerPanel.setBackground(new Color(0x0B2447));

        for(int i=0; i<4; i++){
            buttons[i] = new Buttons();
            if(i==0){
                buttons[0].setText("Solve");
            }else if(i==1){
                buttons[1].setText("New Game");
            }else if(i==2){
                buttons[2].setText("Pause");
            }else {
                buttons[3].setText("Play");
            }

            buttons[i].addActionListener(this);
            innerPanel.add(buttons[i]);
        }

        this.add(innerPanel,BorderLayout.CENTER);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Buttons pressed = (Buttons) e.getSource();

        if(pressed.getText().equals("Solve")){
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    Cells[i][j].setText(Integer.toString(solution[i][j]));
                }
            }
        }
    }
}
