import processing.core.PApplet;

public class SmallAgent implements Agent {
    private final PApplet p5;
    private float x;
    private float y;
    private float length;
    private int colour = 255;

    public SmallAgent(PApplet p5, float x, float y, float length) {
        this.p5 = p5;
        this.x = x;
        this.y = y;
        this.length = length;
    }


    @Override
    public void display() {
        if (length > 150){
            length /= 10;
        }
        p5.fill(colour);
        p5.circle(x, y, length);
    }

    @Override
    public void update() {
        if (x < 0){
            x = p5.width;
        }

        if (colour == 0){
            colour = 255;
        }

        colour--;
        this.x -= 2;
    }
}
