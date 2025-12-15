import processing.core.PApplet;

public class test extends PApplet {
//    глобальные переменные
    public static float angle = 0;
    public static float angle2 = 0;
    public static float deltaY = 2;
    public static float y = 0;

    @Override
    public void settings() {
        size(800,800);
    }

    @Override
    public void draw() {
        background(255);

        pushMatrix();
        translate(300, y);
        rotate(angle);
        line(-50, 0, 50, 0);
        line(0, -50, 0, 50);
        line(-50, -50, 50, 50);
        line(-50, 50, 50, -50);
        popMatrix();

        pushMatrix();
        translate(600, y);
        rotate(angle2);
        line(-50, 0, 50, 0);
        line(0, -50, 0, 50);
        line(-50, -50, 50, 50);
        line(-50, 50, 50, -50);
        popMatrix();


        angle = angle + 0.05f;
        angle2 = angle2 - 0.05f;
        y = y + deltaY;

        if (y == 900) {
            y = 0;
        }
    }

    public static void main(String[] args) {
        PApplet.main("test");
    }
}
