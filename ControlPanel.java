import javax.swing.*;
import java.awt.*;
/***
 * @author Noa
 */
public class ControlPanel extends JPanel {

    Grid g;

    public ControlPanel(Grid f){
        g = f;

        JButton explanation = new JButton("Explanation");
        JButton lexicon = new JButton("Lexicon");
        JButton start = new JButton("Start");
        JButton next = new JButton("Next");
        JButton clear = new JButton("Clear");
        setLayout(new GridLayout(1, 5));
        add(explanation);
        add(lexicon);
        add(start);
        add(next);
        add(clear);

        Nanny actions = new Nanny(g);
        clear.addActionListener(actions);
        next.addActionListener(actions);
    }
}
