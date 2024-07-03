import javax.swing.*;
import java.awt.*;


public class Grid extends JPanel{

    int rows = 11;
    int columns = 11;

    int cellsize = 20;
    int[][] grid = new int[rows][columns];


    public Grid(){
        setSize(rows, columns);
        setVisible(true);

    }

    /*
    public static void main(String[] args) {
        Grid application = new Grid();
        application.setVisible(true);
        application.clearGrid();

        JFrame frame = new JFrame("Testing");
        frame.add(application);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(250,250);

        application.flipPoint(5,5);
        application.flipPoint(5,4);
        application.flipPoint(5,6);
        application.flipPoint(4,3);
        application.flipPoint(4,7);
        application.flipPoint(2,4);
        application.flipPoint(2,6);


        application.repaint();
    }
    */
    public void clearGrid(){
        for(int x = 0; x < columns; x++){
            for(int y = 0; y < rows; y++){
                grid[y][x] = 0;
            }
        }
    }

    public void flipPoint(int row,int column){
        if (grid[row][column] == 1) {
            grid[row][column] = 0;
        } else {
            grid[row][column] = 1;
        }

    }


    public void setColumns(int n){
        columns = n;
    }

    public void setRows(int n){
        rows = n;
    }

    public void setCellsize(int n){
        cellsize = n;
    }


    @Override
    public void paintComponent(Graphics g) {
        for(int x = 0; x < columns; x+=1){
            for(int y = 0; y < rows; y+= 1){
                g.setColor(Color.LIGHT_GRAY);
                g.drawRect(x*cellsize,y*cellsize,cellsize,cellsize);
                if(grid[y][x] == 1){

                    g.setColor(Color.YELLOW);
                }else{
                    g.setColor(Color.GRAY);
                }
                g.fillRect(x*cellsize,y*cellsize,cellsize,cellsize);
            }
        }
    }
}