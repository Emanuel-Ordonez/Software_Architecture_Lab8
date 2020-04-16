import java.util.ArrayList;
import java.util.List;

public class Surpervisor extends DirectAdministrator{

    public Surpervisor(String name) {
        super(name);
    }

    List<RegularEmployee> members = new ArrayList<RegularEmployee>();

    public void addMember(RegularEmployee e){
        members.add(e);
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        for(RegularEmployee e: members){
            e.fixIt();
        }
    }

    public void evacuate(){
        for(RegularEmployee e: members){
            e.evacuate();
        }
        this.evacuate();
    }
}
