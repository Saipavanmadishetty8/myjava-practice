package OOPS;

public class P1 {
    public static void main(String[] args){
        Student s = new Student("Pranav",22);
        Student s1 = new Student("Pavan",22);
        System.out.println(s.displayInfo());
        System.out.println(s1.displayInfo());
    }
}

class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
//    public Person(){}
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }

    public String displayInfo(){
        return "Name: "+name+"\nAge: "+age;
    }
}
class Student extends Person{
    private static int counter =1;
    private int studentI;
    public Student(String name,int age){
        super(name, age);
        this.studentI=counter++;
    }
    public String displayInfo(){
        return "StudentID: "+ studentI+"\n"+super.displayInfo();
    }
}
