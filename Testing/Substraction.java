package Testing;

public class Substraction {
    int firstNumber;
    int secondNumber;

    public Substraction (int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    int substract()
    {
        System.out.println("The substraction of two numbers is");
        System.out.println(firstNumber+secondNumber);
        return firstNumber+secondNumber;
    }

    public static void main(String args [])
    {
        Substraction obj = new Substraction(30,20);
        Addition obj2 = new Addition(100,50);
        obj2.add();
        obj.substract();
    }

}
