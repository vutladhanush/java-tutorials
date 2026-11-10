class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Employee extends Person {

    double salary;

    Employee(String name, int age, double salary) {

        super(name, age);

        this.salary = salary;
    }

    void display() {

        System.out.println(super.toString());
        System.out.println("Salary: " + salary);
    }
}

public class SuperKeywordDemo {

    public static void main(String[] args) {

        Employee employee = new Employee("Ram", 25, 24000);

        employee.display();
    }
}