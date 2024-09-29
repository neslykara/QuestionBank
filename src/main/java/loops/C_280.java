package loops;

import java.util.Scanner;

public class C_280
{
    public static void main(String[] args)
    {
        //Aa ıdak çarpım tablosunu oluturmak çn kod yazınız.
        // 3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30

        Scanner scan = new Scanner(System.in);
        System.out.println("Çarpım tablosunu görmek istediğiniz sayıyı giriniz.");
        int sayi = scan.nextInt();

        for (int i = 1; i <=10 ; i++)
        {
            System.out.println(sayi + "x" + i + "=" + sayi*i);
        }

    }
}
