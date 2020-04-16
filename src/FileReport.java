public class FileReport extends Decision{

    public FileReport(){
        super();
    }

    public FileReport(Manager m, int p, Hazard h){
        super(m, p, h);
    }

    public void execute(CEO commander){
        commander.report();
    }
}
