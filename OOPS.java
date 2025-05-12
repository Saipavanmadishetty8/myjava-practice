class Student{
    String name;
    int age;
    int marks;

    void showDeatils(){
        System.out.println("Name: "+name+"\nAge: "+age+"\nMarks: "+marks);
    }
}
class EngineeringStudent extends Student{
    String branch;
    public String getBranch(){
        return branch;
    }
}
public class OOPS {
   public static void main(String[] args){
       EngineeringStudent s = new EngineeringStudent();
       s.name = "Sai Pavan";
       s.age= 21;
       s.marks = 100;
       s.branch = "AIML";
       s.showDeatils();
       System.out.println(s.getBranch());
   }

}
