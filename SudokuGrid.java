import javax.swing.*;
import java.awt.*;

public class SudokuGrid extends JPanel {
    cell[][] cell = new cell[9][9];
    generateSudoko problem = new generateSudoko(9,40);

    int[][] values ;

    public class innerGrid extends JPanel{
        innerGrid(int gridNum){
            this.setLayout(new GridLayout(3,3));
            this.setBackground(new Color(0x19376D));
            this.setBorder(BorderFactory.createMatteBorder(0,0,0,0,new Color(0x0B2447)));
            for(int i=0;i<9;i++){
                cell[gridNum][i] = new cell();
                this.add(cell[gridNum][i]);
            }
        }
    }

    SudokuGrid(){
        this.setLayout(new GridLayout(3,3));
        this.setBackground(new Color(0x19376D));
        values = problem.getSudoko();
        for(int i=0; i<9; i++){
            this.add(new innerGrid(i));
        }

        fillValues();

    }

    public void fillValues(){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(values[i][j]>0)
                    cell[i][j].setText(Integer.toString(values[i][j]));
            }
        }
    }
}
