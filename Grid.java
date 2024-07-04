import javax.swing.*;
import java.awt.*;


public class Grid extends JPanel{

    private int rows = 20;
    private int columns = 20;

    private int cellsize = 20;
    private int[][] grid = new int[rows][columns];


    public Grid(){
        setSize(rows, columns);
        setVisible(true);

    }



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

    public void setPoint(int row, int column, int value){
        grid[row][column] = value;
    }

    public int getPoint(int row, int column){
        if (grid[row][column] == 1) {
            return 1;
        } else {
            return 0;
        }
    }



    public void setColumns(int n){
        columns = n;
    }

    public void setRows(int n){
        rows = n;
    }

    public int getRows(){return rows;}

    public int getColumns(){return columns;}

    public int getCellsize(){return cellsize;}

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