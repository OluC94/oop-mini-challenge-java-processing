import processing.core.PApplet;

public class BikeAgent implements Agent {
    private PApplet p5;

    public BikeAgent(PApplet p5) {
        this.p5 = p5;
    }

    @Override
    public void display() {
        p5.circle(100, 100, 100);
    }

    @Override
    public void update() {

    }
}
