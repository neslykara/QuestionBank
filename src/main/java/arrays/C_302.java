package arrays;

import java.util.Arrays;

public class C_302
{
    public static void main(String[] args)
    {
        //Verlen br Strng'de 'a' veya 'A' le ba layan kelmey sayısını bulunuz
        String s = "Apex is an object oriented programming language";

        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        int sayaç =0;

        for (String w: words)
        {
            if (w.charAt(0)=='A' || w.charAt(0)=='a')
            {
                System.out.println("w: "+w);
                sayaç++;
            }

        }
        System.out.println(sayaç);

        System.out.println("-----------------------");

        //Verlen br Strng'dek sesl harf sayısını bulunuz

        String s1 = "Apex is an object oriented programming language";
        s1 = s1.toLowerCase();
        String[] harf  =s1.split("");
        System.out.println(Arrays.toString(harf));

        int sesliHarf = 0;
        for(String w : harf)
        {
            if (w.contains("a") || w.contains("e") || w.contains("i") || w.contains("o") || w.contains("u"))
            {
                sesliHarf++;
            }
        }
        System.out.println("Sesli harf sayisi = " + sesliHarf);




    }
}
