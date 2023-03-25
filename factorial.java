/*Write a program to input an integer and find its factorial. Factorial of a number is the product
of all natural numbers till that number.*/
import java.util.Scanner;
class factorial
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int no , fact =1  ;
        System.out.println("Enter the no :- ");
        no=sc.nextInt();
        for(int i = 1 ; i<= no ; i++)
        {
            fact*=i;
        }
        System.out.println("The factorial is " + fact);
    }    
}
