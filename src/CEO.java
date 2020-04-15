import java.util.*;

public class CEO extends Administrator{

    public CEO(String name) {
        super(name);
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

        Decision d = ds.get(0);
        d.execute(this);

        d = ds.get(1);
        d.execute(this);
    }

    private List<Decision> sortByPriority(List<Decision> ds){
        System.out.println("Sorted decisions");
        return ds;
    }

    public void report(){

    }
}
