/*
 * Write a menu-driven program to recruit an employee (depending on his
performance in various rounds) in some software company using
constructor overloading.
Selection Criteria for each post is given below:
i) Programmer (Minimum total of 80 marks):-
Rounds:-
(1) Course Work
(2) Aptitude Test
(3) Technical Test
(4) Interview
ii) Team Leader (Minimum total of 85 marks ):-
Rounds:-
(1) Technical Test
(2) Interview
iii) Project Manager (Minimum score 90 marks)
Rounds:-
(1) Interview
Create a class Posting and write 3 constructors to initialize the object and
set the parameters and display the employee post according to selection
criteria.
Data members:
● int courseWork;
● int AptTest;
int TechTest;
● int interview;
Constructors:
● Posting (int courseWork, int AptTest, int TechTest,int interview)
● Posting (int TechTest,int interview)
● Posting (int interview)
Make use of ‘this’ keyword.
 */

import java.util.Scanner;

class Posting
{
    int courseWork;
    int AptTest;
    int TechTest;
    int interview;

    Posting()
    {
        courseWork=0;
        AptTest=0;
        TechTest=0;
        interview=0;
    }

    Posting (int courseWork, int AptTest, int TechTest,int interview)
    {
        this.courseWork=courseWork;
        this.AptTest=AptTest;
        this.TechTest=TechTest;
        this.interview=interview;
    }
    Posting (int TechTest,int interview)
    {
        this.TechTest=TechTest;
        this.interview=interview;
    }
    Posting (int interview)
    {
        this.interview=interview;
    }

}

public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Apply for recruition here!");
        System.out.println("To hire you we need your marks in various rounds...");
        System.out.println("(1) Course Work : ");
        int courseWork=sc.nextInt();
        System.out.println("(2) Aptitude Test : ");
        int AptTest=sc.nextInt();
        System.out.println("(3) Technical Test : ");
        int TechTest=sc.nextInt();
        System.out.println("(2) Interview : ");
        int interview=sc.nextInt();

        int total=courseWork+AptTest+TechTest+interview;

        System.out.println("Which post are you applying for?");
        System.out.println("1.Proggramer\n2.Team leader\n3.Project manager");
        System.out.println("Enter your preference : ");
        int num=sc.nextInt();

        switch(num)
        {
            case 1 :
                Posting post1=new Posting(courseWork, AptTest, TechTest, interview);
                if(total>=80)
                {
                    System.out.println("Congratulations!\nYou're Hired 🥳");
                }
                else
                    System.out.println("Better luck next time!");
                break;
            
            case 2 :
                Posting post2=new Posting (TechTest, interview);
                if(total>=85)
                {
                    System.out.println("Congratulations!\nYou're Hired 🥳");
                }
                else
                    System.out.println("Better luck next time!");
                break;

            case 3 :
                Posting post3=new Posting (interview);
                if(total>=90)
                    System.out.println("Congratulations!\nYou're Hired 🥳");
                else
                    System.out.println("Better luck next time!");
                break;

            default :
                System.out.println("Enter a valid number!");
        }
    }
    
}
