public class RegularEmployee extends Employee{

    public RegularEmployee(String name) {
        super(name);
    }

    public  void seeDanger(){//used to be called by main
        this.seeDanger(null,null);
    }

    public void seeDanger(HReporter_IF r, Hazard h){
        System.out.println("Employee" + this.name + " sees danger");
        if(r!=null)
            fixIt();
        else{
            fixIt();
            (this.getDirectOverseer()).seeDanger(this, new Hazard("Danger",5));
        }
    }

    /*public void evacuate() {
        //this.evacuate();
    }*/

    public void fixIt(){
        System.out.println("The employee " + this.name + " is fixing it\n");
    }
}
