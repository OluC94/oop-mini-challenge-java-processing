import processing.core.PApplet;
import processing.core.PVector;

public class BikeAgent implements Agent {
    private PApplet p5;
    private PVector position;
    private PVector velocity;
    private PVector acceleration;

    public BikeAgent(PApplet p5, int x, int y) {
        this.p5 = p5;
        this.position = new PVector(x, y);
        this.velocity = new PVector(0, 0);
        this.acceleration = new PVector(0, 9.8f);
    }

    @Override
    public void display() {
        p5.fill(255, 255, 0);
        p5.circle(position.x, position.y, 20);
    }

    @Override
    public void update() {

        velocity.add(acceleration);
        position.add(velocity);
        float steeringAngle = p5.random(-0.03f, 0.03f);
        velocity.rotate(steeringAngle);

        if (position.y >= p5.height ){
            position.y = p5.height - 1;
            velocity.rotate((float) Math.PI);
            velocity.setMag((float) (velocity.mag() * 0.99));
        }

    }
}
