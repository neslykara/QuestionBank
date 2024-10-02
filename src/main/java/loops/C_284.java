package loops;

public class C_284
{
    public static void main(String[] args)
    {
        // Br Strng’  tersne çevrmek çn kod yazınız. Örnek; Mark ==> kraM

        String s = "Mark";
        String ters = "";

        for (int i = s.length()-1; i >=0 ; i--)
        {
            ters=ters + s.charAt(i);
        }
        System.out.println(ters);



        //------------while
        String ters2 = "";
        int k = s.length()-1;
        while (k>=0)
        {
            ters2 = ters2 + s.charAt(k);
            k--;
        }
        System.out.println(ters2);


        //------------do-while
        String ters3 = "";

        int t = s.length()-1;
        do
        {
            ters3 = ters3 + s.charAt(t);
            t--;
        }while (t>=0);
        System.out.println(ters3);


    }
}
