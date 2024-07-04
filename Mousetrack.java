import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mousetrack implements MouseListener{
    Grid g;
    public Mousetrack (Grid f){
        g = f;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        g.flipPoint(x,y);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
