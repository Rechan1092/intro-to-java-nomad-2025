import processing.core.PApplet;

public class aChess extends PApplet {
    int x = 0;
    int y = 0;

    @Override
    public void settings() {
        size(900, 900);
    }

    @Override
    public void draw() {
        x = 900 / 3;
        y = 900 / 3;

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                int x1 = x + j * 50;
                int y1 = y + i * 50;

                fill(255, 255, 255);
                square(x1, y1, 50);

                if (mouseX >= x1 && mouseY >= y1 && mouseX <= x1 + 50 && mouseY <= y1 + 50) {
                    fill(255, 0, 255);
                    square(x1, y1, 50);
                }
            }
        }
    }

    public static void main(String[] args) {
        PApplet.main("aChess");
    }
}