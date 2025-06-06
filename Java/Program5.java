import java.util.*;

class Calculate
{
    public float CalculatePercentage(int iTotalMarks, int iObtainedMarks)
    {
        float fPercentageValue = 0.0f;
        fPercentageValue = ((float)iObtainedMarks / (float)iTotalMarks * 100);
        return fPercentageValue;
    }
}

class Program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int iTotal = 0;
        int iObtained = 0;
        float fPercentage = 0.0f;

        System.out.println("Enter your total marks : ");
        iTotal = sobj.nextInt();

        System.out.println("Enter your total marks : ");
        iObtained = sobj.nextInt();

        Calculate cobj = new Calculate();
        fPercentage = cobj.CalculatePercentage(iTotal,iObtained);

        System.out.println("Percentage is : "+fPercentage);
        
    }
}