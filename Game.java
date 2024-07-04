import javax.swing.*;
import java.awt.*;
/***
 * @author Noa
 */
public class Game extends JFrame {

    public static void main(String[] args){
        Game app = new Game();
        app.setSize(500, 500);
        app.setTitle("Game of Life");
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setResizable(false);
        app.setVisible(true);
    }
    public Game(){
        JFrame window = new JFrame();
        JLabel header = new JLabel("Conway's Game of Life");
        add(header, BorderLayout.NORTH);
        Grid g = new Grid();
        ControlPanel c = new ControlPanel(g); //added grid for nanny

        Mousetrack grid_clicker = new Mousetrack(g);

        g.addMouseListener(grid_clicker); //blake, trying this
        add(g, BorderLayout.CENTER);
        add(c, BorderLayout.SOUTH);


    }
}