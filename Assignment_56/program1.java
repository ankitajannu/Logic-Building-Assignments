import java.util.*;

class StringX
{
    private String str1;
    private String str2;

    public StringX(String str1, String str2)
    {
        this.str1 = str1;
        this.str2 = str2;
    }

    public boolean Rotation()
    {
        int i = 0, j = 0, n = 0;
        boolean bFlag = false;

        if(str1.length() != str2.length())
        {
            return false;
        }

        n = str1.length();

        for(i = 0; i < n; i++)
        {
            bFlag = true;

            for(j = 0; j < n; j++)
            {
                if(str1.charAt((i + j) % n) != str2.charAt(j))
                {
                    bFlag = false;
                    break;
                }
            }

            if(bFlag)
            {
                return true;
            }
        }

        return false;
    }
}


class program1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        boolean bRet = false;

        System.out.println("Enter first string : ");
        String str1 = sobj.nextLine();

        System.out.println("Enter secind string : ");
        String str2 = sobj.nextLine();

        StringX cobj = new StringX(str1, str2);

        bRet = cobj.Rotation();
    
        if(bRet == true)
        {
            System.out.println("First string is the rotation of the second string");
        }
        else 
        {
            System.out.println("First string is not the rotation of the second string");
        }
    }
} 