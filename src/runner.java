public class runner {

    public static void main(String args[]){
        Surpervisor s1 = new Surpervisor("Jack");
        Surpervisor s2 = new Surpervisor("Jeff");

        ProjectLeader p1 = new ProjectLeader("Chuck");
        ProjectLeader p2 = new ProjectLeader("Denise");

        RegularEmployee r1 = new RegularEmployee("John");
        RegularEmployee r2 = new RegularEmployee("Mary");
        RegularEmployee r3 = new RegularEmployee("Jane");
        RegularEmployee r4 = new RegularEmployee("Tom");
        RegularEmployee r5 = new RegularEmployee("Nick");

        r1.setDirectOverseer(s1);
        r2.setDirectOverseer(s1);
        r3.setDirectOverseer(s1);
        r4.setDirectOverseer(s1);
        r5.setDirectOverseer(s1);

        RegularEmployee r6 = new RegularEmployee("Rob");
        RegularEmployee r7 = new RegularEmployee("Ed");
        RegularEmployee r8 = new RegularEmployee("Rick");
        RegularEmployee r9 = new RegularEmployee("Michael");

        r6.setDirectOverseer(s2);
        r7.setDirectOverseer(s2);
        r8.setDirectOverseer(s2);
        r9.setDirectOverseer(s2);

        RegularEmployee r10 = new RegularEmployee("Joe");
        RegularEmployee r11 = new RegularEmployee("Frank");
        RegularEmployee r12 = new RegularEmployee("Sam");
        RegularEmployee r13 = new RegularEmployee("Greg");

        r10.setDirectOverseer(p1);
        r11.setDirectOverseer(p1);
        r12.setDirectOverseer(p1);
        r13.setDirectOverseer(p1);

        RegularEmployee r14 = new RegularEmployee("Amy");
        RegularEmployee r15 = new RegularEmployee("Wil");
        RegularEmployee r16 = new RegularEmployee("Nancy");
        RegularEmployee r17 = new RegularEmployee("Adam");

        r14.setDirectOverseer(p2);
        r15.setDirectOverseer(p2);
        r16.setDirectOverseer(p2);
        r17.setDirectOverseer(p2);

        Manager m1 = new Manager("Bob");

        s1.setDirectOverseer(m1);
        s2.setDirectOverseer(m1);

        Manager m2 = new Manager("Rachel");

        p1.setDirectOverseer(m2);
        p2.setDirectOverseer(m2);

        CEO ceo = new CEO("Steve");

        m1.setDirectOverseer(ceo);
        m2.setDirectOverseer(ceo);

        r1.seeDanger();
    }
}
