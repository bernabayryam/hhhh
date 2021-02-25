package game;


import org.w3c.dom.events.MouseEvent;

import javax.swing.*;
import java.awt.*;

public class Game extends JFrame implements Mouse{


    public Game() {
        this.setSize(64, 64);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setVisible(true);
    }

    /**Method that visualise board
     *
     * @param g
     */

    public void paint(Graphics g) {

        super.paint(g);
        for (int row = 4; row < 68; row++) {
            for (int col = 4; col < 68; col++) {
                Net tile = new Net();
                tile.render(g);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }
}



