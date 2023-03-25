/*Write a program to input an integer and check whether it is perfect, abundant or deficient
number.*/ 
import java.util.Scanner;
class perfect
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int no , sum =0  ;
        System.out.println("Enter the no :- ");
        no=sc.nextInt();
        for(int i = 1 ; i<no ; i++)
        {
            if(no%i==0)
            {
                sum+=i;
            }
        }
        if(sum==no)
        {
            System.out.println("Perfect Number ");
        }
        else if(sum>no)
        {
            System.out.println("Abundunt Number ");
        }
        else
        {
            System.out.println("Deficient Number ");
        }
        
    }
}
