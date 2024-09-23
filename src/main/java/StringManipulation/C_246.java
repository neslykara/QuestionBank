package StringManipulation;

public class C_246
{
    public static void main(String[] args)
    {
      //  10) Br Strng n ortadak herhang br konumda yalnızca tek br bo luk karakter olup
      //  olmadı ını kontrol etmek çn kod yazınız.
      //      Örnek: ‘Ali          Can’  için konsolda false yazmalıdır.
      //             ‘     Ali Can      ’ için konsolda false yazmalıdır.
      //             ‘     Ali             Can      ’ için konsolda false yazmalıdır.
      //             ‘Ali Can’  için konsolda true yazmalıdır.
        String s1 = " Ali Can";
        s1=s1.replace(" ","*");
        boolean control1 = !s1.contains("**");
        System.out.println("control1 = " + control1);
        System.out.println(s1);


      //  11) Br Strng’ n ba ında ve sonunda bo luk karakter olup olmadı ını kontrol etmek çn kod
      //  yazınız.
      //          Örnek: ‘   Ali  ’ için kodunuz konsolda false yazmalıdır
      //                 ‘Ali’
      //                  için kodunuz konsolda true yazmalıdır
        String s2 = " Ali";
        boolean control2 = (s2.length()==s2.trim().length());
        System.out.println("control2 = " + control2);


       // 12) Br Strng’ n ba ında büyük harf ve sonunda nokta olup olmadı ını kontrol etmek çn kod
       // yazınız.
       //         Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
       //                ‘ali.’ için kodunuz konsolda false yazdırmalıdır
       //                ‘       Ali.       ’ için kodunuz konsolda false yazdırmalıdır
       //                ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
       //                ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
        String s3 = " Ali.";
        boolean ilkChar =s3.toUpperCase().charAt(0) == s3.trim().charAt(0);
        System.out.println("ilkChar = " + ilkChar);
        boolean sonChar = s3.endsWith(".");
        System.out.println("sonChar = " + sonChar);
        if(ilkChar==true && sonChar==true)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }



    }
}
