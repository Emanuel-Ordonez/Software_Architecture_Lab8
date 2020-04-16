public class RegularEmployee extends Employee{

    public RegularEmployee(String name){
        super(name);
    }

    public void seeDanger(){
        System.out.println(this.name + " Employee sees danger");
        (this.getDirectOverseer()).seeDanger(this, new Hazard()); //inform supervisor
    }

    public void evacuate() {
        this.evacuate();
    }

    public void fixIt(){
        System.out.println("The employee " + this.name + " is fixing it");
    }
}
