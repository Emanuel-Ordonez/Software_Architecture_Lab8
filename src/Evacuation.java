public class Evacuation extends Decision{

    public Evacuation(){
        super();
    }

    public Evacuation(Manager m, int p, Hazard h){
        super(m, p, h);
    }

    public void execute(CEO commander){
        commander.evacuate();
        FileReport y = new FileReport();
        y.execute(commander);
    }
}
