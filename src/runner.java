public class runner {
    public static void main(String args[]){
        RegularEmployee a = new RegularEmployee("Ralph");
        RegularEmployee b = new RegularEmployee("Fernando");
        Surpervisor c = new Surpervisor("Elise");
        ProjectLeader d = new ProjectLeader("Joseph");
        Manager e = new Manager("Valarie");
        CEO f = new CEO("Roger");


        a.setDirectOverseer(c);
        b.setDirectOverseer(d);
        c.setDirectOverseer(e);
        d.setDirectOverseer(e);
        e.setDirectOverseer(f);

        System.out.println("Yay");
    }
}
