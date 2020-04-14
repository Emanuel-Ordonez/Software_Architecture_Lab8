import java.util.List;

public class Administrator extends Employee{
    private List<Employee> members;

    public void seeDanger(HReporter_IF r, Hazard h){

    }

    public void evacuate(){
        for(Employee e: members){
            e.evacuate();
        }
        this.evacuate();
    }
}
