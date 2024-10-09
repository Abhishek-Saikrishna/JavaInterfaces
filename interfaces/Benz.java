package interfaces;
public class Benz implements Car{
    @Override
    public void drive() {
        System.out.println("The Car you are driving is benz");
    }

    public static void main(String args[])
    {
        Car obj1 = new Benz();
        Car obj2 = new Toyoto();
        obj1.drive();
        obj2.drive();
    }
}
