import java.util.*;

class Pattern
{
    public void Display()
    {
        int j = 0;

        for(j = 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }
        System.out.println();

        for(j = 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }
        System.out.println();

        for(j = 1; j <= 3; j++)
        {
            System.out.print("*\t");
        }
        System.out.println();
    }
}

class program88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Pattern pobj = new Pattern();

        pobj.Display();  
    }
}

