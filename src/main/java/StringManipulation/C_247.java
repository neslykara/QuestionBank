package StringManipulation;

public class C_247
{
    public static void main(String[] args)
    {
      //  13) Aa ıdak koullar çn br parolanın geçerl olup olmadı ını kontrol etmek çn kod yazınız;
      //  fre bo luk karakternden farklı olacak eklde en az 8 karakter çermeldr. frede en az 1
      //  sembol olmalıdır.
      //  Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
      //         'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
      //         '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
      //         '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
      //         '! a b 3 k' kodunuz konsolda false yazdırmalıdır
        String pwd ="! a b 3 k";
        boolean spaceCntrl = pwd.replace(" ","").length()>=8;
        boolean sembolCntrl = pwd.replace("[^\\p{Punct}]" , "").length()>0;
        System.out.println(sembolCntrl && spaceCntrl);



      //  14) Br Strng’ n belrl br tek karaktere sahp olup olmadı ını üç farklı eklde kontrol etmek
      //  çn kod yazınız.
        String s = "Java";
        boolean cntrl1 = s.contains("v");
        System.out.println("cntrl1 = " + cntrl1);

        boolean cntrl2 = s.replaceAll("[^v]" , "").length()>0;
        System.out.println("cntrl2 = " + cntrl2);

        boolean cntrl3 = s.indexOf("v")>-1;
        System.out.println("cntrl3 = " + cntrl3);

    }
}
