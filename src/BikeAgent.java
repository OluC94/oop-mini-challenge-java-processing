import processing.core.PApplet;
import processing.core.PVector;

public class BikeAgent implements Agent {
    private PApplet p5;
    private PVector position;
    private PVector velocity;

    public BikeAgent(PApplet p5, int x, int y) {
        this.p5 = p5;
        this.position = new PVector(x, y);
        this.velocity = PVector.random2D();
    }

    @Override
    public void display() {
        p5.fill(255, 255, 0);
        p5.circle(position.x, position.y, 20);
    }

    @Override
    public void update() {

        position.add(velocity);
        float steeringAngle = p5.random(-0.03f, 0.03f);
        velocity.rotate(steeringAngle);
    }
}
