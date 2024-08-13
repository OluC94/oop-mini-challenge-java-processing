import processing.core.PApplet;


public class Main extends PApplet {
//    Spark[] sparks;
//    Shape[] shapes;
//    Shape shape;
    Agent agent = new LargeAgent(this, 200, 200, 50);
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
        agent.display();
        agent.update();
    }
}