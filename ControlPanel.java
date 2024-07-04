import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {
    public ControlPanel(){
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
    }
}
