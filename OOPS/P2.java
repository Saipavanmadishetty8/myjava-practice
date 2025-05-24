package OOPS;

import java.util.stream.StreamSupport;

public class P2 {
    public static void main(String[] args){
        Car c= new Car("Audi","R8");
        Car c1 = new Car("Bugati","Chiron");
//        System.out.println(c.getInfo());
//        System.out.println(c1.getInfo());
        Bike b = new Bike("Kawaski","H2R");
        Bike b1 = new Bike("Ducati","V4");
        Truck t = new Truck("Volvo","V16");
        Truck t1 = new Truck("Benz","216");
        Vehicle[] v={c,b,t,c1,b1,t1};
        for(Vehicle i:v){
            System.out.println(i.getInfo());
            System.out.println("----------------");
        }

    }
}
abstract class Vehicle{
    private String brand;
    private String model;
    public Vehicle(String brand, String model){
        this.brand = brand;
        this.model = model;
    }
    public String getbasicInfo(){
        return "Brand: "+brand+"\nModel: "+model;
    }
    abstract String getInfo();
}
class Car extends Vehicle{
    private static int c = 1000;
    private int carID;
    public Car(String brand,String model){
        super(brand,model);
        this.carID=c++;
    }
    @Override
    public String getInfo(){
        return "CarID: "+carID+"\n"+super.getbasicInfo();
    }
}
class Bike extends Vehicle{
    private static int c = 1000;
    private int bikeID;
    public Bike(String brand,String model){
        super(brand,model);
        this.bikeID=c++;
    }
    @Override
    public String getInfo(){
        return "BikeID: "+bikeID+"\n"+super.getbasicInfo();
    }
}
class Truck extends Vehicle{
    private static int c = 1000;
    private int truckID;
    public Truck(String brand,String model){
        super(brand,model);
        this.truckID=c++;
    }
    @Override
    public String getInfo(){
        return "TruckID: "+truckID+"\n"+super.getbasicInfo();
    }
}
