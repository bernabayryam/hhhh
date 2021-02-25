package game;

import java.awt.*;

public class Net {
    private Object Serial;

    public void render(Graphics g) {
        for (int x = 0; x < 64; x++) {
            for (int y = 0; y < 64; y++) {

                ColorBox(g);

            }
        }
    }

    private void ColorBox(Graphics g) {
        int colorBox = 0;
        if(colorBox == 1) {
    g.setColor(Color.RED);
}
else if(colorBox == 2){
    g.setColor(Color.GREEN);
}
else if(colorBox == 3){
g.setColor(Color.BLUE);
}
else if(colorBox == 4) {
    g.setColor(Color.BLACK);
}
        displaySerialNumb();
    }

    //Method for visualizing the serial number.
    private Object displaySerialNumb() {
        int type = 0;

        switch (type) {
            case 1:
                Serial = "BBB1111110";
                break;

            case 2:
                Serial = "BBB1111111";
                break;

            case 3:
                Serial = "BBB1111112";
                break;

            case 5:
                Serial = "BBB1111114";
                break;
        }
        return Serial;
    }



    }

