import processing.core.PApplet;

public class Shape implements P5Shape {
    protected final PApplet p5;
    protected float x;
    protected float y;
    protected int colour;

    public Shape(PApplet p5, float x, float y) {
        this.p5 = p5;
        this.x = x;
        this.y = y;
        this.colour = p5.color(p5.random(0, 255), p5.random(0, 255), p5.random(0, 255));
    }

    public Shape[] createShapes(int countToCreate) {
        Shape[] shapes = new Shape[countToCreate];
        for (int i = 0; i < countToCreate; i++) {
            shapes[i] = this.createRandomShape();
        }
        return shapes;
    }

    private Shape createRandomShape(){
        return new Shape(p5, x, y);
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
