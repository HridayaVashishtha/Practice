/*
 Create a class 'Employee' with three data members which are name, age and
Salary. The constructor of the class assigns default values name as
"unknown", age as '18' and salary as 20000. Write the setter and getter
methods for class Employee. Write another method which prints the name,
age and Salary of an employee. Test the methods in a separate class called
TestEmployee which contains the main() method

 */

import java.util.Scanner;

class Employee {
    String name;
    int age;
    double salary;

    Employee()
    {
        name="Unknown";
        age=18;
        salary=20000;
    }

    void SetAge(int age)
    {
        this.age=age;
    }
    void SetName(String name)
    {
        this.name=name;
    }
    void SetSalary(double salary)
    {
        this.salary=salary;
    }

    String GetName()
    {
        return name;
    }
    int GetAge()
    {
        return age;
    }
    double GetSalary()
    {
        return salary;
    }

    void print()
    {
        System.out.println("Name : " + GetName());
        System.out.println("Age : " + GetAge());
        System.out.println("Salary : " + GetSalary());
    }
}




public class TestEmployee {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();

        System.out.println("Default details -");
        emp.print();
        
        System.out.println("Enter name : ");
        String name=sc.next();
        emp.SetName(name);
        System.out.println("Enter age : ");
        int age=sc.nextInt();
        emp.SetAge(age);
        System.out.println("Enter salary : ");
        double salary=sc.nextDouble();
        emp.SetSalary(salary);

        System.out.println("Given details -");
        emp.print();
    }
}
