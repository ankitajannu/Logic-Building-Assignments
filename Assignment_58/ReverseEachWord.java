import java.util.Arrays;
import java.util.Scanner;

class ReverseEachWord
{
    String reverseWord(String inputString)
    {
        inputString = inputString.trim();

        inputString = inputString.replaceAll("\\s+", " ");

        String tokens[] = inputString.split(" ");

        StringBuilder sb = null;
        String result = "";

        for(String s : tokens)
        {
            sb = new StringBuilder(s);
            result = result + sb.reverse().toString() + " ";
        }

        return result.trim();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sc.nextLine();

        ReverseEachWord robj = new ReverseEachWord();

        System.out.println("Input String : " + str);
        System.out.println("String with Reversed words are : " + robj.reverseWord(str));
    }
}
