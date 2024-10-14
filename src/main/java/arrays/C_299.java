package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class C_299
{
    public static void main(String[] args) {
      //Tamsayılardan oluan br arrayde ortadak elemanı bulunuz.
      //        Örnek: (12, 5, 8) ==> (5, 8, 12) ==> Çıktı =8
      //(12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Çıktı =(8+12)/2 = 1

        int[] sayi = new int[3];
        sayi[0] = 5;
        sayi[1] = 7;
        sayi[2] = 12;
      //  sayi[3] = 13;

        System.out.println(Arrays.toString(sayi));


        if (sayi.length % 2 ==0)
        {
            int orta1 = sayi[sayi.length/2-1];
            int orta2 = sayi[sayi.length/2];
            double result = (orta1+orta2)/2;
            System.out.println(result);
        }else{
            System.out.println(sayi[(sayi.length-1)/2]);
        }



       // Strng’ lerden oluan br arrayde uzunlu u en küçük olan elemanları bulunuz.
       //         Örnek: ( Kemal, Jonathan, Mark, Ange, Vel ) ==> Output s Mark, Ve

        String[] names = new String[]{"Kemal", "Jonathan", "Mark", "Angie","Veli"};

        int minLength = names[0].length();

        for (String w : names)
        {
           minLength =Math.min(minLength,w.length());

        }


        for (String w: names)
        {
            if (w.length()==minLength)
            {
                System.out.println(w);
            }

        }





    }

}
