public class Evacuation extends Decision{

    public Evacuation(){
        super();
    }

    public Evacuation(Manager m, int p, Hazard h){
        super(m, p, h);
    }

    public void execute(CEO commander){
        commander.evacuate();
    }
}
