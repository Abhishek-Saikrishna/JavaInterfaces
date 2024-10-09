package interfaces;
public class Benz implements Car{
    @Override
    public void drive() {
        System.out.println("The Car you are driving is benz");
    }

    public static void main(String args[])
    {
        Car obj1 = new Benz();
        obj1.drive();
    }
}
