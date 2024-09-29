package loops;

public class C_277
{
    public static void main(String[] args) {
      //  Benzersz (Tekrarsız) rakamları br tamsayı olarak yazdırmak çn kod yazınız.
      //  Örnek; 223878 -> 37

        int sayi = 223878;
        String s = String.valueOf(sayi);
        String tekrarsiz = "";

        for (int i = 0; i <s.length() ; i++)
        {
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
            {
                tekrarsiz = tekrarsiz + s.charAt(i);
            }
        }
        Integer tekrarsızSayi = Integer.valueOf(tekrarsiz);
        System.out.println(tekrarsızSayi);


    }
}
