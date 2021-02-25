package game;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame {
    public Game(){
        this.setSize(64, 64);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }
    //Method that visualise board.
    public void paint(Graphics g) {
        super.paint(g);
        for (int row = 0; row < 64; row++) {
            for (int col = 0; col< 64; col++) {
                Net tile = new Net();
                tile.render(g);
            }
        }

    }
}