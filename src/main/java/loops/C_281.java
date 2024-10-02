package loops;

public class C_281
{
    public static void main(String[] args)
    {
        //20'den 3'e kadar olan tek tamsayıları aynı satırda ardı ık olacak eklde aralarında bo luk
        //bırakarak yazdırmak çn gereken kodu yazınız
      for (int i = 20; i >=3 ; i--)
      {
          if (i%2!=0)
          {
              System.out.print(i + " ");
          }
      }
      System.out.println();


        //----------------do-while
        int k = 20;
        do {
            if (k%2 != 0)
            {
                System.out.print(k + " ");
            }

            k--;
        }while (k>=3);
        System.out.println();

        //----------------while
        int t = 20;
        while (t>=3)
        {
            if (t % 2 != 0)
            {
                System.out.print(t+ " ");
            }
            t--;
        }


    }
}
