import processing.core.PApplet;

public class snowflakes extends PApplet {

    public static float initValue = PI/8;
    public static float deltaY = 1;
    public static float y = 0;
//    public static float deltaX = 10;
//    public static float x = 0;

    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void draw(){
        background(255);

        pushMatrix();
        translate(width/2, y);
        rotate(initValue);
        line(-10,0,10,0);
        popMatrix();

        initValue += 0.1f;
        y += deltaY+.5f;
    }

    public static void main(String[] args) {
        PApplet.main("snowflakes");
    }
}