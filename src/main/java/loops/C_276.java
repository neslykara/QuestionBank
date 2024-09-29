package loops;

public class C_276 {
    public static void main(String[] args) {
        // 3) Br Strng ‘ n palndrom olup olmadı ını kontrol etmek çn kod yazınız. Br Strng, ters le
        //aynıysa, buna palndrom denr. Örne n; “anna”, “123321” palndromlardır.

        String s = "nesli";
        String ters ="";

        for (int i = s.length()-1; i >= 0; i--)
        {
            ters = ters + s.charAt(i);

        }
        System.out.println(ters);
       if (s.equals(ters))
       {
           System.out.println( "Palindromdur");
       }else
       {
           System.out.println("Palindrom değildir");
       }

    }
}
