package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C_309
{
    // 4) Br lstedek ö elern azalan sırada olup olmadı ını kontrol ednz.
    // Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
    // (Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır

    public static void main(String[] args)
    {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Yellow","KBlue","HRed","AGreen"));
        ArrayList<String> colorsControl = new ArrayList<>();

     //   for (int i = 0; i < colors.size() ; i++)
     //   {
     //       colorsControl.add(colors.get(i));
     //   }

        colorsControl.addAll(colors); //Bir arrayList i diğer arrayListe eklemek için addAll methodu kullanılır.
        Collections.sort(colorsControl);

        int k = 0;
        for (int i = colors.size()-1 ; i >= 0  ; i--)
        {
           if(colors.get(k)==colorsControl.get(i)) {
               k++;
           }
        }

        if (k== colors.size()){
            System.out.println("list azalan sıradadır");
        }else{
            System.out.println("list azalan sırada değildir");

        }




    }
}
