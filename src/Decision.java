public class Decision {

    private Manager suggestedBy;
    private int priority;
    private Hazard hazard;

    public Decision(){

    }

    public Decision(Manager m, int p, Hazard h){
        this.suggestedBy=m;
        this.priority=p;
        this.hazard=h;
    }

    public void execute(CEO commander){
        if(hazard.getHazard_level()>3) {
            Evacuation evac = new Evacuation();
            evac.execute(commander);
        }
        else {
            FileReport file = new FileReport();
            file.execute(commander);
        }
    }

}
