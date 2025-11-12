import java.util.*;

class Fibonacci
{
    public void FibonacciSeries(int n)
    {
        int i = 0, first = 0, next = 0, second = 1;

        for(i = 1; i <= n; i++)
        {
            System.out.println(first+"\t");
            next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int iValue = 0;

        System.out.println("Enter the number of terms : ");
        iValue = sc.nextInt();

        Fibonacci fobj = new Fibonacci();

        fobj.FibonacciSeries(iValue);
    }
}