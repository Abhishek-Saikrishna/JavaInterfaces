package interfaces;

public class Student {
    int rollNo;
    int marks;
    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display()
    {
        System.out.println("The marks of student are"+marks);
    }
}


class Execute
{
    public static void main(String args [])
    {
        Student student = new Student(05,100);
        student.display();

    }
}
