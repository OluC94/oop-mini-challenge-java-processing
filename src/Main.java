import processing.core.PApplet;


public class Main extends PApplet {
//    Spark[] sparks;
//    Shape[] shapes;
//    Shape shape;
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
//        sparks = Spark.createSparks(this, 100);
//        shape = new Circle(this, 200, 200, 40);
//        shapes =
    populateAgents(10);
    }


    @Override
    public void draw() {
    background(100);
//        for (Spark s : sparks){
//            s.display();
//        }
//
//        for (Spark s : sparks){
//            s.update();
//        }
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
            float randRadius = random(100, 200);
            agents[i] = new LargeAgent(this, randX, randY, randRadius);
        }
    }
}