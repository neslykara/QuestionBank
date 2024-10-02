package loops;

public class C_282
{
    public static void main(String[] args)
    {
        //Strng çndek tüm küçük harfler yıldız aretyle yazdırmak çn gereken kodu yazınız.
        // Örne n; 'Ali Can?' ==> l*i*a*n*

       String name="Ali Can?";
       String s ="";
       name=name.replaceAll("[^a-z]","");
       for (int i = 0; i <name.length() ; i++)
       {
           s = s + name.charAt(i)+"*";
       }
        System.out.println(s);



    }
}
