/*
 Create a Date class with data int year, int month, int date, int hrs, int min,
int sec. Create a default, no-argument constructor which sets the default
date to January 1, 2000, 00:00:00
Create 3 overloaded setter methods
void setDate(int year, int month, int date)
void setDate(int year, int month, int date, int hrs, int min)
void setDate(int year, int month, int date, int hrs, int min, int sec)
Also write a displayDate() method which will display the date depending on
the type of date object created.
 */

import java.util.Scanner; 

class Date
{
    int year, month, date, hrs, min, sec;

    Date()
    {
        year=2000;
        month=1;
        date=1;
        hrs=00;
        min=00;
        sec=00;
    }
    
    void setDate(int year, int month, int date)
    {
        this.year=year;
        this.month=month;
        this.date=date;
    }
    void setDate(int year, int month, int date, int hrs, int min)
    {
        this.year=year;
        this.month=month;
        this.date=date;
        this.hrs=hrs;
        this.min=min;
    }
    void setDate(int year, int month, int date, int hrs, int min, int sec)
    {
        this.year=year;
        this.month=month;
        this.date=date;
        this.hrs=hrs;
        this.min=min;
        this.sec=sec;
    }
    void displayDate()
    {
        System.out.println(date+"/"+month+"/"+year+", "+hrs+":"+min+":"+sec);
    }
}

public class TestDate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        Date d=new Date();
        System.out.println("Default -\n");
        d.displayDate();

        System.out.println("Enter year : ");
        int year=sc.nextInt();
        System.out.println("Enter month :");
        int month=sc.nextInt();
        System.out.println("Enter date :");
        int date=sc.nextInt();
        System.out.println("Enter hours :");
        int hrs=sc.nextInt();
        System.out.println("Enter minutes : ");
        int min=sc.nextInt();
        System.out.println("Enter seconds : ");
        int sec=sc.nextInt();

        Date d1=new Date(year, month, date);
        Date d2=new Date(year, month, date, hrs, min);
        Date d3=new Date(year, month, date, hrs, min, sec);

        d1.displayDate();
        d2.displayDate();
        d3.displayDate();

    }
}
