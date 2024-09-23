package ifStatement;

import java.util.Scanner;

public class C_254
{
    public static void main(String[] args)
    {
       // 1) Aa ıdak seçenekler do rultusunda gereken kodu yazınız.
       // a)
       // Aralık, Ocak, ubat çn "Kı "
       // b) Mart, Nsan, Mayıs çn "lkbahar"
       // c) Hazran, Temmuz, Austos çn "Yaz"
       // d) Eylül, Ekm, Kasım çn "Sonbahar"
       // e) D erler çn "Geçersz ay adı"
        Scanner input = new Scanner(System.in);

 //       System.out.println("Hangi mevsimde oldugunu ögrenmek istediginiz ay adini yaziniz.");
 //       String monthName = input.next();
 //       monthName = monthName.toLowerCase();
 //       if (monthName.equals("aralık") || monthName.equals("ocak") || monthName.equals("şubat"))
 //       {
 //           System.out.println("KIŞ");
 //       } else if (monthName.equals("mart") || monthName.equals("nisan") || monthName.equals("mayıs"))
 //       {
 //           System.out.println("İLKBAHAR");
 //       } else if (monthName.equals("haziran") || monthName.equals("temmuz") || monthName.equals("ağustos"))
 //       {
 //           System.out.println("YAZ");
 //       } else if (monthName.equals("eylül") || monthName.equals("ekim") || monthName.equals("kasım"))
 //       {
 //           System.out.println("SONBAHAR");
 //       }else
 //       {
 //           System.out.println("Gecersiz ay adi");
 //       }
//
 //       System.out.println("---------------");
        // 2) Aa ıdak seçenekler do rultusunda gereken kodu yazınız.
       // a)
       // fre bo luk karakternden farklı en az 8 karakter çeryorsa "Geçerl fre"
       // b)  Herhang br pozsyonda frede bo luk karakter varsa " frede bo luk karakter kullan
       // mayınız"
       // c) a ve b koullarının sa lanmaması durumunda "Geçersz fre"
       // Not: Çözümdeki koulların sıralarına dikkat ediniz.


        System.out.println("Lutfen parolanızı giriniz.");
        String pwd = input.nextLine();
        System.out.println(pwd);

        boolean lengthCntrl = pwd.replaceAll("[\\s]" , "").length() >= 8;
        boolean spaceCntrl = pwd.replaceAll("[\\S]" , "").length()==0;
        if (!spaceCntrl)
        {
            System.out.println("Sifrede bosluk karakter kullanmayiniz");
        } else if (lengthCntrl)
        {
            System.out.println("Gecerli sifre");
        }
        else
        {
            System.out.println("Gecersiz sifre");
        }


    }
}
