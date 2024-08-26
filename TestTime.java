/*Design a Time class with data members hours, minutes and seconds. Add a
no-argument constructor to the class which initializes hours, minutes, and
seconds to 0. Further add two conversion() methods to the class.
conversion1() method has the time in seconds as a parameter and converts
and displays the time into hours, minutes and seconds, apart from
initializing the time object. Write another method conversion2() which has
3 parameters, hours, minutes and seconds, which will compute and display
the total seconds of a Time object. Write another class called TestTime
which contains the main() method.
Create 2 different objects of Time class in main(), first object should call
conversion1() method user to enter seconds as an integer in the argument.
And second object should call conversion2() with appropriate parameters.
For example, if user enters 4205 seconds as an input called totSeconds, the
answer should be:
Hours : 1
Minutes : 10
Seconds : 5
Similarly, vice-versa. Use Scanner for reading data through keyboard
 */

 import java.util.Scanner;

 class Time
{
    int hours;
    int minutes;
    int seconds;

    Time()
    {
        hours=0;
        minutes=0;
        seconds=0;
    }
    
    void conversion1(int sec)
    {
        hours = sec/3600;
        sec = sec%3600;
        minutes = sec/60;
        seconds = sec%60;
        System.out.println("Hours : " + hours);
        System.out.println("Minutes : " + minutes);
        System.out.println("Seconds : " + seconds);
    }

    void conversion2(int hour, int min, int sec)
    {
        hours = hour;
        minutes = min;
        seconds = sec;

        int total = hour*3600 + min*60 + sec;
        System.out.println("Total seconds : " + total);
    }
}

class TestTime
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Time t1=new Time();


        System.out.println("Enter time (in seconds) : ");
        int totseconds=sc.nextInt();
        t1.conversion1(totseconds);
        
        Time t2=new Time();

        System.out.println("Enter hours : ");
        int hours=sc.nextInt();
        System.out.println("Enter minutes : ");
        int minutes=sc.nextInt();
        System.out.println("Enter seconds : ");
        int seconds=sc.nextInt();
        t2.conversion2(hours, minutes, seconds);
    }
}