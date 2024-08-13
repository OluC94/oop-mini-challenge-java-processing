import processing.core.PApplet;


public class Main extends PApplet {

    Agent[] agents;

    public static void main(String[] args) {
        PApplet.main(new String[]{"Main"});
    }

    @Override
    public void settings() {
        size(800, 600);
    }

    @Override
    public void setup() {
        populateAgents(100);
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
        agents = new Agent[numAgents];
        for (int i = 0; i < numAgents; i++) {
            float randX = random((float) width /2,  width);
            float randY = random(height);
            float randSize = random(50, 200);
            agents[i] = selectedAgent(this, randX, randY, randSize);
        }
    }

    private Agent selectedAgent(PApplet p5,float x,float y,float size){
        boolean randFloat = p5.random(1) > 0.5;

        return randFloat ? new LargeAgent(this, x, y, size) : new SmallAgent(this, x, y, size);
    }
}