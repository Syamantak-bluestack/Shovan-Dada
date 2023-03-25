class lucasseries
{
    public static void main (String args[])
    {
        int a , b , c , sum =0;
        a=2;
        b=1;
        sum=a+b;
        for(int i = 1 ; i<=8 ; i++)
        {
            c=a+b;
            sum=sum+c;
            a=b;
            b=c;
        }
        System.out.println("The sum is : " + sum );
    }
}
