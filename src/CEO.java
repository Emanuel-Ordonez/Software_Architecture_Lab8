import java.util.*;

public class CEO extends Administrator{

    public CEO(String name) {
        super(name);
    }

    public void addMember(Manager manager){
        members.add(manager);
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        List<Decision> decisions = new ArrayList<Decision>();
        for(Employee e: members){
            Manager m = (Manager)e;
            decisions.add((Decision) m.suggestDecisions(h));
        }
        implementDecision(decisions);
    }

    public void implementDecision(List<Decision> ds){
        ds = sortByPriority(ds);
        int y;

        //if there aren't more decisions put limit
        if(ds.size()<2)
            y=ds.size();
        else
            y=2;

        Decision d = new Decision();
        for(int x=0; x<y;x++) {
            d = ds.get(x);
            if(d != null)//just in case a decision is null
                d.execute(this);
        }

    }

    private List<Decision> sortByPriority(List<Decision> ds){
        System.out.println("Sorted decisions");
        return ds;
    }

    public void report(){

    }
}
