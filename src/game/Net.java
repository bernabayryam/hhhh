package game;

import java.awt.*;

public class Net {
    private Object Box;

    private int col;
    private int row;
    private double[][] Boxes;

    public void render(Graphics g) {
        for (int row = 0; row < 64; row++) {
            for (int col = 0; col < 64; col++) {

                colorToPaint();

            }
        }
        }

        /**Method that paints Box
         *
         */

        private void colorToPaint () {
            Graphics g = null;
            if (this.Boxes[col][row] == 1) {

                g.setColor(Color.RED);

            } else if (this.Boxes[col][row] == 2) {

                g.setColor(Color.BLUE);

            } else if (this.Boxes[col][row] == 3) {

                g.setColor(Color.GREEN);
            } else if (this.Boxes[col][row] == 4) {

                g.setColor(Color.BLACK);
            }
            drawBox(col, row, g);
        }

        /**Method that draw
         *
         * @param col
         * @param row
         * @param g
         */
        private void drawBox ( int col, int row, Graphics g){

        }

    }



