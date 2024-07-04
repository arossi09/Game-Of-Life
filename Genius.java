public class Genius {
    public void calculate(Grid g){
        int[][] temp = new int[g.getRows()][g.getColumns()];
        for(int i = 0; i < g.getRows(); i++){
            for(int j = 0; j < g.getColumns(); j++){
                int alive = count(g, i , j);
                int current = g.getPoint(i, j);
                if(current == 1){
                    if(alive < 2 || alive > 3){
                        temp[i][j] = 0;
                    }
                    else{
                        temp[i][j] = 1;
                    }
                }
                else{
                    if(alive == 3){
                        temp[i][j] = 1;
                    }
                    else{
                        temp[i][j] = 0;
                    }
                }
            }
        }
        for(int i = 0; i < g.getRows(); i++){
            for(int j = 0; j < g.getColumns(); j++){
                g.setPoint(i, j, temp[i][j]);
            }
        }
    }
    private int count(Grid g, int row, int col){
        int alive = 0;
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){
                if(i == 0 && j == 0) continue;
                int neighborRow = row + i;
                int neighborColumns = col + j;
                if(neighborRow >= 0 && neighborRow < g.getRows() && neighborColumns >= 0 && neighborColumns < g.getColumns()){
                    alive += g.getPoint(neighborRow, neighborColumns);
                }
            }
        }
        return alive;
    }


}
