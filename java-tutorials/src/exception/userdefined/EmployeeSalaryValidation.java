package exception.userdefined;
import java.util.Scanner;

class InvalidSalaryException extends Exception
{
    InvalidSalaryException(String message)
    {
        super(message);
    }
}

class Employee
{
    private int id;
    private String name;
    private double salary;

    void setName(String name)
    {
        this.name = name;
    }
    void setId(int id)
    {
        this.id = id;
    }
    void setSalary(double salary)
    {
        try{
            if(salary <=0 || salary > 1000000)
            {
                throw new InvalidSalaryException("salary must be between 0 and 1000000");
            }
            this.salary=salary;
        }
        catch(InvalidSalaryException e)
        {
            System.out.println(e.getMessage());
        }

    }
    void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
    }

}

public class EmployeeSalaryValidation
{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(12);
        e.setName("Raju");
        e.setSalary(2000000);
        e.display();

    }
}