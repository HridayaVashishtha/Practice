/*
Create a four-function calculator for fractions. Here are the formulas for the four arithmetic operations applied to fractions:
Addition: a/b + c/d = (a*d + b*c) / (b*d)
Subtraction: a/b - c/d = (a*d - b*c) / (b*d)
Multiplication: a/b * c/d = (a*c) / (b*d)
Division: a/b / c/d = (a*d) / (b*c)
Create the class fraction. Use default constructor to set numerator and
denominator to 1.
a) There are methods to print the four functions for fractions.
b)Program generates a multiplication table for fractions. Let the user input a
denominator, and then generate all combinations of two such fractions that
are between 0 and 1, and multiply them together. Here’s an example of the
output if the denominator is 6:
 */


 class Fraction {
    int num, den;
    Fraction() {
    num = 1;
    den = 1;
    }
    Fraction(int num, int den) {
    this.num = num;
    this.den = den;
    }
    Fraction add(Fraction f) {
    Fraction res = new Fraction();
    res.num = this.num * f.den + f.num * this.den;
    res.den = this.den * f.den;
    return res;
    }
    Fraction sub(Fraction f) {
    Fraction res = new Fraction();
    res.num = this.num * f.den - f.num * this.den;
    res.den = this.den * f.den;
    return res;
    }
    Fraction multi(Fraction f) {
    Fraction res = new Fraction();
    res.num = this.num * f.num;
    res.den = this.den * f.den;
    return res;
    }
    Fraction divi(Fraction f) {
    Fraction res = new Fraction();
    res.num = this.num * f.den;
    res.den = this.den * f.num;
    return res;
    }
    void reduceFraction() {
    int gcd = findGCD( this.num, this.den );
    if(gcd>1){
    this.num = this.num /gcd;
    this.den = this.den /gcd;
    }
    }
    int findGCD(int n, int d){
    if(d==0){
    return n;
    }else{
    return findGCD(d, n%d);
    }
    }
    }
    import java.util.Scanner;
    public class TestFraction {
    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);
    Fraction f1 = new Fraction();
    Fraction f2 = new Fraction();
    System.out.println("Enter first numerator :");
    f1.num = sc.nextInt();
    System.out.println("Enter first denominator :");
    f1.den = sc.nextInt();
    System.out.println("Enter second numerator :");
    f2.num = sc.nextInt();
    System.out.println("Enter second denominator :");
    f2.den = sc.nextInt();
    Fraction radd = f1.add(f2);
    radd.reduceFraction();
    Fraction rsub = f1.sub(f2);
    rsub.reduceFraction();
    Fraction rmul = f1.multi(f2);
    rmul.reduceFraction();
    Fraction rdiv = f1.divi(f2);
    rdiv.reduceFraction();
    System.out.println("Addition :" + radd.num + "/" + radd.den);
    System.out.println("Subtraction :" + rsub.num + "/" + rsub.den);
    System.out.println("Multiplication :" + rmul.num + "/" + rmul.den);
    System.out.println("Division :" + rdiv.num + "/" + rdiv.den);
    System.out.println("\nMultiplication Table*\n" + "Enter the
    denominator:");
    int deno = sc.nextInt();
    Fraction f3= new Fraction();
    for (int i = 1; i <= deno; i++) {
    for (int j = 1; j <= deno; j++) {
    f3 = new Fraction(i, deno).multi(new Fraction(j, deno));
    f3.reduceFraction();
    System.out.print(" "+f3.num+"/"+f3.den+" ");
    }
    System.out.println(" ");
    }
    }
    }