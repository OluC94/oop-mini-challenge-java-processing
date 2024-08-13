import processing.core.PApplet;

public class LargeAgent implements Agent{

    private final PApplet p5;
    private float x;
    private float y;
    private float radius;


    public LargeAgent(PApplet p5, float x, float y, float radius) {
        this.p5 = p5;
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    @Override
    public void display() {
        this.radius += p5.random(-15.0f, 15.0f);
        p5.fill(200);
        p5.circle(x, y, radius);
    }

    @Override
    public void update() {
        this.x--;
    }
}
