// Accept String from user and display below patterns
// Input : Hello

/* Output : 
    H   e   l   l   o
    H   e   l   l
    H   e   l
    H   e
    H
    H   e   
    H   e   l
    H   e   l   l
    H   e   l   l   o
*/

import java.util.*;

class Pattern
{
    public void Pattern(String str)
    {
        int i = 0, j = 0;
        char Arr[] = str.toCharArray();

        for(i = Arr.length; i > 0; i--)
        {
            for(j = 0; j < Arr.length; j++)
            {
                if(i > j)
                {
                    System.out.print(Arr[j]+"\t");
                }   
            }
            System.out.println();
        }

        for(i = 0; i < Arr.length-1; i++)
        {
            for(j = 0; j < Arr.length; j++)
            {
                if(i >= j)
                {
                    System.out.print(Arr[j]+"\t");
                }   
            }
            System.out.println();
        }
    }
}
class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String name = sobj.nextLine();

        Pattern pobj = new Pattern();

        pobj.Pattern(name);
    }

}
