package OOPS;

public class P3 {
    private String name;
    private int age;
    public P3(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void introduce(){
        System.out.println("Hi I am "+name+" and my age is "+age);
    }
}
