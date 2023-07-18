import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SudokuGrid extends JPanel implements KeyListener {
    cell[][] cell = new cell[9][9];
    generateSudoko problem = new generateSudoko(9,40);

    int[][] values ;

    @Override
    public void keyTyped(KeyEvent e) {
        int num = e.getKeyChar()-48;
        if(num >=1 && num <=9){
            cell source = (cell) e.getSource();
            cell[source.row][source.col] = new cell();
            cell[source.row][source.col].addKeyListener(this);
            cell[source.row][source.col].row = source.row;
            cell[source.row][source.col].col = source.col;
            source.setText("");
            if(problem.unUsedInBox(source.row,source.col,num) && problem.unUsedInRow(source.row,num) && problem.unUsedInCol(source.col,num)){
                source.setForeground(new Color(0xA2FF86));
            }else{
                source.setForeground(new Color(0xD71313));
            }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public class innerGrid extends JPanel{
        innerGrid(int gridNum){
            this.setLayout(new GridLayout(3,3));
            this.setBackground(new Color(0x19376D));
            this.setBorder(BorderFactory.createMatteBorder(0,0,0,0,new Color(0x0B2447)));
            for(int i=0;i<9;i++){
                this.add(cell[gridNum][i]);
            }
        }
    }

    SudokuGrid(){
        this.setLayout(new GridLayout(3,3));
        this.setBackground(new Color(0x19376D));
        values = problem.getSudoko();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                cell[i][j] = new cell();
                cell[i][j].addKeyListener(this);
            }
        }
        for(int i=0; i<9; i++){
            this.add(new innerGrid(i));
        }

        fillValues();

    }

    public void fillValues(){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){

                cell[i][j].row = i;
                cell[i][j].col = j;
                if(values[i][j]>0)
                    cell[i][j].setText(Integer.toString(values[i][j]));
            }
        }
    }


}
