import java.util.List;

public class Manager extends Administrator{

    public Manager(String name) {
        super(name);
    }

    public void addMember(DirectAdministrator direct){
        members.add(direct);
    }

    public List<Decision> suggestDecisions(Hazard h){
        return null;
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        Boolean reportToCEO = true;
        for(Employee e: members){
            DirectAdministrator d = (DirectAdministrator)e;
            if(d.getFeedback(h) == false)
                reportToCEO = false;
        }
        if(reportToCEO && this.overseer != null){
            this.overseer.seeDanger(this, h);
        }
    }
}
