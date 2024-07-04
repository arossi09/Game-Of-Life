import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Nanny implements ActionListener {
    private Grid g;

    public Nanny (Grid f){
        g = f;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Genius genius = new Genius();
        if (e.getActionCommand().equals("Clear")){
            g.clearGrid();
        }
        else if(e.getActionCommand().equals("Next"))
            genius.calculate(g);
        g.repaint();
    }
}

