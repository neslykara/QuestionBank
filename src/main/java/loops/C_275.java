package loops;

public class C_275
{
    public static void main(String[] args) {
        //Br Strng’ de tekrarlanan karakterler yazdırmak çn kod yazınız.
        //Örne n; accessores ´ ces

        String s = "accessores";
        String tekrarsız = "";

        for (int i = 0 ; i <s.length() ; i++)
        {
            if (s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
            {
                tekrarsız = tekrarsız+s.charAt(i);
            }
        }
        System.out.println(tekrarsız);


    }
}
