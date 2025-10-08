package java21.encapsulation;

public class Encapsulations {

    String name;
    int age;
    double salary;

    // Setter methods
    void setName(String name) {
        this.name = name;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter methods
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Encapsulations obj = new Encapsulations();
        obj.setName("John Doe");
        obj.setAge(30);
        obj.setSalary(75000.50);

        System.out.println("Getting employee details:");
        System.out.println("Name: " + obj.getName());
        System.out.println("Age: " + obj.getAge());
        System.out.println("Salary: " + obj.getSalary());
    }
}
