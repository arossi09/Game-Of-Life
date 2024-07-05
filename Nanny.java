import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Timer;

/***
 * @author Blake
 */
public class Nanny implements ActionListener {
    private Grid g;
    private Timer timer;
    Genius genius;

    ActionListener timing = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("here");
            genius.calculate(g);
            g.repaint();
        }
    };
    public Nanny (Grid f){
        g = f;
        genius = new Genius();

        this.timer = new Timer(700, timing); //timer doesnt work but doesnt crash either
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Clear")){
            g.clearGrid();
            timer.stop();
        }
        else if(e.getActionCommand().equals("Next")){
            genius.calculate(g); }
        g.repaint();
        if(e.getActionCommand().equals("Start")){
            timer.start();
        }
    }
}

