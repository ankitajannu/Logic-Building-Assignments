import java.util.*;

class Display
{
    public void DisplayClass(float fPerc)
    {
        if((fPerc < 0.0f) || (fPerc > 100.0f))
        {
            System.out.println("Unable to proceed as input is invalid");
            return;
        }

        if((fPerc >= 0.0f) && (fPerc <= 35.0f))
        {
            System.out.println("You are fail");
        }
        else if((fPerc >= 35.0f) && (fPerc <= 50.0f))
        {
            System.out.println("Pass class");
        }
        else if((fPerc >= 50.0f) && (fPerc <= 60.0f))
        {
            System.out.println("Second class");
        }
        else if((fPerc >= 60.0f) && (fPerc <= 70.0f))
        {
            System.out.println("First class");
        }
        else if((fPerc >= 70.0f) && (fPerc <= 100.0f))
        {
            System.out.println("First class with distinction");
        }
    }
}

class Program6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float fValue = 0;

        System.out.println("Please enter your percentage : ");
        fValue = sobj.nextFloat();

        Display dobj = new Display();
        dobj.DisplayClass(fValue);
    }
}