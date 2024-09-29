package loops;

public class C_279
{
    public static void main(String[] args)
    {
        //Aa ıdak görüntüyü br for döngüsü kullanarak elde eden kodu yazınız.
        // A
        // A A
        // A A A
        // A A A A

        int num = 4;

        for (int i = 1; i <=num ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print("A ");
            }
            System.out.println();
        }

    }
}
