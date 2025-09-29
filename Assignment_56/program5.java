import java.util.*;

class StringX
{
    private String str;

    public StringX(String str)
    {
        this.str = str;
    }

    public boolean CheckExpression()
    {
        char Arr[] = str.toCharArray();
        int iCount = 0, i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == '(')
            {
                iCount++;
            }
            else if(Arr[i] == ')')
            {
                iCount--;

                if(iCount < 0)
                {
                    return false;
                }
            }
        }

        return (iCount == 0);
    }
}

class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter first string : ");
        String str = sobj.nextLine();

        StringX cobj = new StringX(str);

        bRet = cobj.CheckExpression();
    
        if(bRet == true)
        {
            System.out.println("This is a correct expression");
        }
        else 
        {
            System.out.println("This is not a correct expression");
        }
    }
} 