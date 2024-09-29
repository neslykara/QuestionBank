package loops;

public class C_278
{
    public static void main(String[] args)
    {
        //Aa ıdak görüntüyü br for döngüsü kullanarak elde eden kodu yazınız.
        // A A A A A
        // A A A A A
        // A A A A A

        int row = 3;
        int column = 5;


        for (int i = 1; i <= row ; i++)
        {
            for (int j = 1; j <= column ; j++)
            {
                System.out.print("A ");
            }
            System.out.println();

        }



    }
}
