/*Write a program to input the three angles of a triangle and check whether it forms a triangle
or not, if it forms a triangle, check whether it is an equilateral, isosceles or a scalene triangle.*/
import java.util.Scanner;
class triangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a1 , a2 , a3;
        System.out.println("Enter the angles of the triangle : ");
        a1=sc.nextInt();
        a2=sc.nextInt();
        a3=sc.nextInt();
        if((a1+a2+a3)==180)
        {
            System.out.println("A Triangle can be formed . ");
            if(a1==a2 && a2==a3 && a1==a3)
            {
                System.out.println("The Triangle formed is an equilateral triangle . ");
            }
            if(a1==a2 || a2==a3 || a1==a3)
            {
                System.out.println("The triangle formed is an isosceles triangle . ");
            }
            if(a1!=a2 && a2!=a3 && a1!=a3)
            {
                System.out.println("The Triangle formed is a scalene triangle . ");
            }
        }
        else {
            System.out.println("A Triangle cannot be formed . ");
        }
    }
}
