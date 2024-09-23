package StringManipulation;

public class C_245
{
    public static void main(String[] args)
    {
      //  7) Br Strng de ken oluturunuz ve lk karakter dı ındak tüm karakterler konsolda
      //  yazdırınız.
      //          Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
        String s1 = "Java";
        String ilkHaric = s1.substring(1,s1.length());
        System.out.println("ilkHaric = " + ilkHaric);


      //  8) Br Strng de ken oluturunuz ve son karakter dı ındak tüm karakterlern konsolda
      //  büyük harfle yazdırınız.
      //      Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
        String buyukHarf = s1.toUpperCase().substring(0,s1.length()-1);
        System.out.println("buyukHarf = " + buyukHarf);


      //  9) Br Strng de ken oluturunuz ve konsolda lk karakter ve son karakter dı ındak tüm
      //  karakterler büyük harflerle yazdırınız.
      //  Örnek: String 'Java'  ise konsolda 'AV' yazdırmalısınız.
        String ilkSonHaric = s1.toUpperCase().substring(1,s1.length()-1);
        System.out.println("ilkSonHaric = " + ilkSonHaric);


    }
}
