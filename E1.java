import java.util.List;

abstract class Employee {
    abstract double calculateSalary();
    public void displayRole(){
        System.out.println("I am an Employee!");
    }

}
class FullTimeEmployee extends Employee implements Benefits,Project{
    @Override
    double calculateSalary(){
        return 50000.75;
    }
    public void showBenefits(){
        System.out.println("Full-time: Health insurance, bonuses, etc.");
    }
    public void assignProject(String pName){
        System.out.println("New project is assigned with name "+pName);
    }
}
class PartTimeEmployee extends Employee implements Benefits,Project{
    private int numHours;

    public PartTimeEmployee(int numHours){
        this.numHours=numHours;
    }
    @Override
    double calculateSalary(){
        return numHours*300;
    }
    public void showBenefits(){
        System.out.println("Part-time: Limited benefits or none.");
    }
    public void assignProject(String pName){
        System.out.println("New project is assigned with name "+pName);
    }
}
interface Benefits{
    void showBenefits();
}
public class E1{
    public static void main(String[] args){
        FullTimeEmployee e1= new FullTimeEmployee();
        PartTimeEmployee e2 = new PartTimeEmployee(8);
        System.out.println(e1.calculateSalary());
        e1.showBenefits();
        e1.assignProject("Bank System UI.");
        System.out.println(e2.calculateSalary());;
        e2.showBenefits();
        e2.assignProject("Bank System Testing.");
    }
}
interface Project{
    void assignProject(String projectName);
}
class Manager{
    void assignProjectsToAll(String projectName, List<Project> team){
        for(Project p:team ){
            p.assignProject(projectName);
        }
    }
}
