package loops;

public class C_285
{
    public static void main(String[] args)
    {
        //Aa ıdak görüntüyü br for döngüsü kullanarak elde eden kodu yazınız.
        // A A A A A A A A
        // A X X X X X X A
        // A X X X X X X A
        // A X X X X X X A

        int row = 4;
        int column = 8;

        for (int i = 1; i <=row ; i++)
        {
            for (int j = 1; j <=column ; j++)
            {
                if (i==1)
                {
                    System.out.print("A ");
                } else
                {
                    if (j==1 || j==column)
                    {
                        System.out.print("A ");
                    }  else
                   {
                       System.out.print("X ");
                   }
                }
            }
            System.out.println();
        }



    }
}
