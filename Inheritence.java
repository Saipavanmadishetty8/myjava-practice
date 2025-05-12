public class Inheritence {

    public static void main(String[] args){
        Rec r = new Rec();
        Circle c = new Circle();
        r.N();
        r.colour("red");
        c.N();

        c.colour("blue");
    }
}
class Shape{
    //        int a;
    String color;
    public void colour(String color){
        this.color=color;
        System.out.println("Shape color is "+color);
    }
}
class Rec extends Shape{
    public void N(){
        System.out.println("I am a rectangle");
    }
}
class Circle extends Shape{
    public void N(){
        System.out.println("I am a circle");
    }
}
