package JavaCodes;

import java.util.Scanner;

public class Max_Occurence
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char arr[]=s.toCharArray();
        int n;
        n=s.length();

        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                {
                    System.out.println("Repeated char "+ arr[i]);
                }
            }
        }
    }
}
