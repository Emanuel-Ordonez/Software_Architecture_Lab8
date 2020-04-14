public class Employee implements HReporter_IF{
    protected String name;
    protected Administrator overseer;

    public void seeDanger(HReporter_IF r, Hazard h){
    }

    public void evacuate(){
    }

    public void setDirectOverseer(HReporter_IF r){
        this.overseer = (Administrator) r;
    }

    public HReporter_IF getDirectOverseer(){
        return overseer;
    }
}
