public class RegularEmployee extends Employee{

    public RegularEmployee(String name){
        super(name);
    }

    public void seeDanger(){
        (this.getDirectOverseer()).seeDanger(this, new Hazard()); //inform supervisor
    }

    public void evacuate() {
        this.evacuate();
    }

    public void fixIt(){
        System.out.println("The employee " + this.name + " is fixing it");
    }
}
