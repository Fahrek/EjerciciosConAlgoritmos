package algorithmsex;

import java.util.Scanner;

public class MeaningOfLife 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String chain = "";
        int value;
        
        do 
        {
            value = sc.nextInt();
            chain += value + ",";
        } while (value != 42);
       
        String[] array = chain.split(",");
        for (int i = 0; i < array.length-1; i++) 
        {
            System.out.println(array[i]);
        }
    }
}
