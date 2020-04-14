public class RegularEmployee extends Employee{
    public void seeDanger(HReporter_IF r, Hazard h){
        if(r!=null) {
            fixIt();
        }
        else{
            fixIt();
            //overseer.seeDanger(this,new Hazard());
        }
    }

    public void evacuate() {
        this.evacuate();
    }

    public void fixIt(){
        System.out.println("Fixing it");
    }
}
