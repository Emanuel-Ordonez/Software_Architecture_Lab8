public class DirectAdministrator extends Administrator{

    public Boolean getFeedback(Hazard h){
        return true;
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        System.out.println(this.name + " Got it");
        for(Employee e: members){
            if(e != r)
                e.seeDanger(this, h);
        }
        if(overseer != null)
            overseer.seeDanger(this, h);
    }
}
