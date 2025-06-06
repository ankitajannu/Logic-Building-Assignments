import java.util.*;

class Pattern
{
    public void Display()
    {
        int i = 0, j = 0;

        for(i = 1; i <= 3; i++)
        {
            for(j = 1; j <= 3; j++)
            {
                System.out.print("*\t");
            }
        System.out.println();
        }
    }
}

class program89
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        Pattern pobj = new Pattern();

        pobj.Display();  
    }
}
