public class Decision {

    private Manager suggestedBy;
    private int priority;
    private Hazard hazard;

    public void execute(CEO commander){
        System.out.println("Hello");
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
