public class runner {

    public static void main(String args[]){
        RegularEmployee a = new RegularEmployee("John");
        RegularEmployee ab = new RegularEmployee("Joe");
        RegularEmployee b = new RegularEmployee("Fernando");
        Surpervisor c = new Surpervisor("Elise");
        ProjectLeader d = new ProjectLeader("Joseph");
        Manager e = new Manager("Valarie");
        CEO f = new CEO("Roger");


        a.setDirectOverseer(c);
        ab.setDirectOverseer(c);
        b.setDirectOverseer(d);
        c.setDirectOverseer(e);
        d.setDirectOverseer(e);
        e.setDirectOverseer(f);

        a.seeDanger();

        Evacuation x = new Evacuation();
        x.execute(f);
    }
}
