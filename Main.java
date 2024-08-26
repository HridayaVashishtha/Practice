/*
 * Create a Test class with a data double base, int power, int logBase, int
argument. Create a default, no-argument constructor which sets the default
value of all variables to 2. There are 2 overloaded functions:
1. double calculate (double base, int power)
This function returns the value when *base* is raised to *power*
For example: calculate (3.0, 2) returns the value of 3.0 raised to 2 i.e., 9.0
2. double calculate (int logBase, int argument)
This function returns the value of the log of *argument* to the base
*logBase*. For example: calculate (3, 9) returns log of 9 to the base 3 i.e.,
2.0 Create a main method in a separate class to call the above functions
with the following inputs:
1. calculate (2, 4)
2. calculate (2.0, 4.0)
Create a display() method which displays the output based on the type of
Test object created.
 */
import java.util.Scanner;

class TestCal
{
    double base;
    int power;
    int logbase;
    int argument;

    TestCal()
    {
        base=2.0;
        power=2;
        logbase=2;
        argument=2;
    }

    double calculate(double base, int power)
    {
        double res=1;
        for(int i=0; i<power; i++)
        {
            res*=base;
        }
        return res;
    }
    double calculate(int logbase, int argument)
    {
        double res = Math.log(argument) / Math.log(logbase);
        return res;
    }

    void display(double res)
    {
        System.out.println("Result : "+res);
    }
}


public class Main{
    public static void main(String[] args) {

        TestCal t1 = new TestCal();
        double num1=t1.calculate(2.0, 4);
        t1.display(num1);
        double num2=t1.calculate(2, 4);
        t1.display(num2);
    }
}
