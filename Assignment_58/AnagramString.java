import java.util.Arrays;
import java.util.Scanner;

class AnagramString
{
    static boolean isAnagrams(String str1, String str2)
    {
        if(str1.length() != str2.length())
        {
            return false;
        }

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1,arr2);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String1 : ");
        String str1 = sc.nextLine();

        System.out.println("Enter String2 : ");
        String str2 = sc.nextLine();

        if(isAnagrams(str1,str2))
        {
            System.out.println("Anagram Strings!!");
        }
        else
        {
            System.out.println("Strings are not Anagram!!");
        }
    }
}