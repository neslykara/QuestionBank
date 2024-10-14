package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C_306
{
   //  13) Kullanıcıdan 2 Strng grmesn steynz. Strnglern karakterler ve karakter sayıları aynıysa
   // konsola "Anagramdır" yazdırın. Aks takdrde, konsolda "Anagram Değildir" yazdırınız.
   //     Örne n; "Mary" ve "army" ve "RAMY" Anagramlardır

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki string girişi yapınız \n 1.string:");
        String s1 = scan.nextLine();
        System.out.println("2.string:");
        String s2 = scan.nextLine();

        if(s1.length()!=s2.length()){
            System.out.println("Anagram değildir");
            return;
        }

        char[] arrS1 = s1.toLowerCase().toCharArray();
        char[] arrS2 = s2.toLowerCase().toCharArray();
        Arrays.sort(arrS1);
        Arrays.sort(arrS2);

            if (Arrays.equals(arrS1,arrS2)){
                System.out.println("Anagramdır.");
            }else {
                System.out.println("Anagram değildir.");
            }





        System.out.println(Arrays.toString(arrS1));
        System.out.println(Arrays.toString(arrS2));





    }



}
