import java.util.ArrayList;
import java.util.List;

public class Administrator extends Employee{
    List<Employee> members = new ArrayList<Employee>();

    public Administrator(String name){
        super(name);
    }

    public void addMember(Employee e){
        members.add(e);
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        System.out.println("Admin");
    }

    public void evacuate(){
        for(Employee e: members){
            e.evacuate();
        }
        super.evacuate();//calls the super meathod evacuate
    }
}
