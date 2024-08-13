import processing.core.PApplet;

public class Circle extends Shape implements P5Shape {

    private float radius;

    public Circle(PApplet p5, float x, float y, float radius) {
        super(p5, x, y);
        this.radius = radius;
    }

    public Circle createRandomShape(){
        float x = p5.random(0f, 800f);
        float y = p5.random(0f, 600f);
        float randomRadius = p5.random(10, 50);
        return new Circle(p5, x, y, randomRadius);
    }

    @Override
    public void display(){
        p5.fill(super.colour);
        p5.circle(x, y, radius);
    }

    @Override
    public void update() {
        final int stepSize = 5;
        x+= p5.random(-stepSize, stepSize);
        y+= p5.random(-stepSize, stepSize);
        radius = PApplet.constrain(radius + p5.random(-1, 1), 5, 100);
    }
}
