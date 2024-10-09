package Testing;

public class Addition {
    int firstNumber;
    int secondNumber;

    public Addition(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    int add()
    {
        System.out.println("Changing it to Multiplication");
        System.out.println(firstNumber+secondNumber);
        return firstNumber+secondNumber;
    }

    public static void main(String args[])
    {
        Addition addition = new Addition(5,10);
        addition.add();
    }
}

