package StringManipulation;

public class C_248
{
    public static void main(String[] args)
    {
      //  15) Strng gomlekFyat = ‘$12.99’;
      //  Strng ktapFyat = ‘$35.99’;
      //  Gömlek ve ktap fyatlarının toplamını bulmak çn gereken kodu yazınız.
        String tsrtPrice = "$12.99";
        String bookPrice = "$35.990";
        tsrtPrice = tsrtPrice.replace("$", "");
        bookPrice = bookPrice.replace("$","");

        System.out.println("tsrtPrice = " + tsrtPrice);
        System.out.println("bookPrice = " + bookPrice);

        Double tPrice = Double.valueOf(tsrtPrice);
        Double bPrice = Double.valueOf(bookPrice);

        System.out.println("totalPrice " + (tPrice + bPrice));


      //  16) Verlen br smn adının ve soyadının ba harflern almak çn kodu yazınız.
      //  Not: kinci isim kapsam dı ındadır.
      //      Örnek: Tom Hanks ==> TH, Mary Star ==> MS
        String name = "Tom Hanks";
        char basHarf1 = name.trim().split(" ")[0].charAt(0);
        char basHarf2 = name.trim().split(" ")[1].charAt(0);
        System.out.println("" + basHarf1 + basHarf2);


      //  17) Br Strng’ de kullanılan noktalama aretlernn sayısını bulmak çn br kod yazınız.
      //  String s = "Vay be! Ali 13 ya ında ama üniversite ö rencisi."
        String str = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
       // str = str.replaceAll("[^\\p{Punct}]", "");
       // System.out.println(str);
      int noktalamaLngth = str.replaceAll("[^\\p{Punct}]", "").length();
       System.out.println("noktalamaLngth = " + noktalamaLngth);

    }
}
