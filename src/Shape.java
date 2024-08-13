import processing.core.PApplet;

public class Shape implements P5Shape {
    private final PApplet p5;
    private float x;
    private float y;
    private int colour;

    public Shape(PApplet p5, float x, float y) {
        this.p5 = p5;
        this.x = x;
        this.y = y;
        this.colour = p5.color(p5.random(0, 255), p5.random(0, 255), p5.random(0, 255));
    }

    @Override
    public void display() {
        // to be overridden by subclasses
    }

    @Override
    public void update() {
        // to be overridden by subclasses
    }
}
