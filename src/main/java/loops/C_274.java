package loops;

public class C_274
{
    public static void main(String[] args) {
        // 1) 120'den 11'e kadar 4 le bölüneblen ve 6 le bölüneblen tüm tam sayıları aynı satırda k
        //ardı ık tam sayı arasında bo luk bırakarak yazınız

        //1.yol:
        for (int i = 120; i >= 11; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(i + " ");

            }
        }

        System.out.println();
            //2.yol

            int k = 120;
            while (k >= 11)
            {
                if (k % 4 == 0 && k % 6 == 0) {
                    System.out.print(k + " ");
                }
                k--;
            }


        }
    }
