import java.util.Scanner;

class Pattern
{
    private int num;

    public void setNum(int num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return this.num;
    }

    public void printAnswer()
    {
        int i = 0, j = 0;

        for(i = 1; i <= num; i++)
        {
            for(j = i; j < num; j++)
            {
                System.out.print(" ");
            }

            for(j = 1; j <= i; j++)
            {
                System.out.print((char)('A'+j-1));
            }

            for(j = i-1; j >= 1; j--)
            {
                System.out.print((char)('A'+j-1));
            }

            System.out.println();
        
        }
    }

    public void inputNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        setNum(num);
    }

    public static void main(String[] ar)
    {
        Pattern ob = new Pattern();
        ob.inputNum();
        ob.printAnswer();
    }
}