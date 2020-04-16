import java.util.ArrayList;
import java.util.List;

public class Surpervisor extends DirectAdministrator{

    public Surpervisor(String name) {
        super(name);
    }

    public void addMember(RegularEmployee e){
        members.add(e);
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        System.out.println(this.name + " has been notified of Hazard\n");
        for(Employee e: members){
            if(e != r)
                e.seeDanger(e,h);
        }
        (this.overseer).seeDanger(this, h);
    }
}
