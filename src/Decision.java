public class Decision {

    private Manager suggestedBy;
    private int priority;
    private Hazard hazard;

    public void execute(CEO commander){
    if(hazard!=null) {
        Evacuation evac = new Evacuation();
        evac.execute(commander);
    }
    else {
        FileReport file = new FileReport();
        file.execute(commander);
    }
    }
}
