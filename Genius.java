public class Genius {
    public static void Genius(Grid g){

    }
    public int calculate(Grid g){
        for(int i = 0; i < g.rows; i++){
            for(int j = 0; j < g.columns; j++){
                int alive = count(g);
                if(g.getPoint(i, j) == 1){
                    if(alive < 2 || alive > 3){
                        g.flipPoint(i, j);
                    }
                    else{
                        g.flipPoint(i, j);
                    }
                }
                else{
                    if(alive == 3){
                        = 0;
                    }
                }


            }
        }
    }
    private int count(Grid g){
        for(int i = -1; i <= 1; i++){
            for(int j = -1; j <= 1; j++){

            }
        }
    }


}
