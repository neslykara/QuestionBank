package StringManipulation;

public class C_244
{
    public static void main(String[] args)
    {
      //  4) Br Strng de ken oluturunuz, Strng'dek rakam olmayan karakterlern sayısını
      //  konsolda yazdırınız.
      //  Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
        String s = "'1a3Bcf4!...'";
        int sLength = s.replaceAll("[0-9]" , "").length();
        System.out.println("sLength = " + sLength);


      // 5) Br Strng de ken oluturunuz ve Strng de kenn konsolda bo luk olmayan son
      // karakteri yazdırınız.
      // Örnek: 'Ali Can' için n yazdırmalısınız.
      // ‘Miami’ için i yazdırmalısınız.
        String str = "Miami   ";
        str = str.trim();
        char sonChar = str.charAt(str.length()-1);
        System.out.println("sonChar = " + sonChar);


       // 6) Br Strng de ken oluturunuz ve Strng'n lk ve son karakterlernn ASCII de erlernn
       // toplamını bulunuz.
        String s1 = "Ali Can";
        int chAscii = (int)s1.charAt(s1.length()-1);
        System.out.println("chAscii = " + chAscii);




    }
}
