package arrays;

import java.util.Arrays;

public class C_304
{
    public static void main(String[] args)
    {
        //10) Verlen br Strng arraydek ö elern karakterlernn toplamını bulmak çn kod yazınız

        String[] arr = new String[]{"alabama", "pick", "sos", "sets", "pex"};
        int characterSum=0;

        for (String w: arr)
        {
            characterSum = characterSum + w.length();
        }
        System.out.println(characterSum);


        System.out.println("--------------------------");


        // 11) Tamsayılardan oluan arrayde bulunan sıfırları, array sonuna yerletren kod yazınız.
        // Örnek: (5, 0, 2, 0, 3) ==> (5, 2, 3, 0, 0)

        int[] sayi = new int[]{5,0,2,0,3};
        System.out.println(Arrays.toString(sayi)); //[5, 0, 2, 0, 3]

        int[] yeni = new int[5];
        int idx = 0;

        for (int w: sayi)
        {
            if(w!=0)
            {
             yeni[idx]=w;
             idx++;
            }
        }
        System.out.println(Arrays.toString(yeni));







    }
}
