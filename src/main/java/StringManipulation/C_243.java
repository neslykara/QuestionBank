package StringManipulation;

import java.util.Locale;

public class C_243
{
    public static void main(String[] args)
    {
       // 1) Sadece tek bir kelmeden oluan sehir isimleri için bir String degisken oluturun.
       //    Sehir isminin, bas harfi büyük ve d er tüm karakterler küçük harfler olacak eklde konsolda
       //    yazdırınız.
               // Örnek:  mIAMI - Miami
               // miami - Miami
               // MIAMI - Miami
               // mIaMi - Miami vb.
        String s1 ="MIAMI" ;
        s1 = s1.trim().toLowerCase();
        System.out.println(s1.toUpperCase().charAt(0) + "" + s1.substring(1, s1.length()));


       // 2) Kisi isimleri için 3 Strng degisken oluturunuz. Bosluk karakterleri hariç 3 isimdeki
       //    karakter sayısının toplamını yazdırınız.
       //    Örnek: simler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
        String name1 = "Ali Can" ;
        String name2 = "Merve Star" ;
        String name3 = "Mark Tom" ;

        int n1 = name1.replace(" ", "").length();
        int n2 = name2.replace(" ", "").length();
        int n3 = name3.replace(" ", "").length();

        System.out.println(n1 + n2 + n3);


        // 3) Br Strng de ken oluturunuz, Strng'dek toplam alfabetk ve sayısal karakter sayısını
        //    konsolda yazdırınız.
        //    Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.

        String str = "' Miami 33018!!! '";
        int harfSayi = str.replaceAll("[^a-zA-Z]" , "").length();
        int rakamSayi = str.replaceAll("[^0-9]" , "").length();


    }
}
