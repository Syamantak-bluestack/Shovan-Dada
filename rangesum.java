//Write a program to find the sum of all 3 digit odd natural numbers, which are multiples of 5.
class rangesum
{
    public static void main(String args[])
    {
        int i , sum = 0 ;
        for(i = 101 ; i<=999 ; i+=2)
        {
            if(i%5==0)
            {
                sum+=i;
            }
        }
        System.out.println("The sum is : " + sum);
    }
}
