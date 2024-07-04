import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
/***
 * @author Blake
 */

public class Mousetrack implements MouseListener{
    Grid g;
    public Mousetrack (Grid f){
        g = f;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int x = e.getX() / 20;
        int y = e.getY() / 20;
        System.out.println(x + ", " + y);
        g.flipPoint(y,x);
        g.repaint();
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
