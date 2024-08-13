import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;


public class Main extends PApplet {

    List<Agent> agents;

    public static void main(String[] args) {
        PApplet.main(new String[]{"Main"});
    }

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        agents = new ArrayList<Agent>();
//        populateAgents(100);
    }


    @Override
    public void draw() {
    background(100);
        for (Agent agent : agents) {
            agent.display();
        }
        for (Agent agent : agents) {
            agent.update();
        }
    }

    private void populateAgents(int numAgents) {

        for (int i = 0; i < numAgents; i++) {
            float randX = random((float) width / 2, width);
            float randY = random(height);
            float randSize = random(50, 200);
            agents.add(generateAgent(this, randX, randY, randSize));
        }
    }

    private Agent generateAgent(PApplet p5, float x, float y, float size) {
        boolean randFloat = p5.random(1) > 0.5;

        return randFloat ? new LargeAgent(this, x, y, size) : new SmallAgent(this, x, y, size);
    }

    public void mousePressed() {
        System.out.println("mouse pressed");
        agents.add(new BikeAgent(this, this.mouseX, this.mouseY));
    }
}