public class DirectAdministrator extends Administrator{

    public DirectAdministrator(String name) {
        super(name);
    }

    public void addMember(RegularEmployee reg){
        members.add(reg);
    }

    public Boolean getFeedback(Hazard h){
        System.out.println("Feedback by " + this.name);
        //if(h)
            return true;
        //else
        //    return false;
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
