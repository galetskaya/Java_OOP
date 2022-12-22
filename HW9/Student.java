package HW9;

public class Student {
    private String name;
    private int age;
    private float average;

  

    public Student(String name, int age, float average) {
        this.name = name;
        this.age = age;
        this.average = average;
    }



    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", average=" + average + "]";
    }



  
}
