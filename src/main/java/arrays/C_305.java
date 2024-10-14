package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C_305
{
    // 12) Kullanıcıdan aldı ınız tamsayılar le br array oluturunuz ve bu arraydek en küçük ve en
    //büyük ö eler arasındak farkı konsolda yazdırınız

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç adet veri girişi yapacağınızı belirtiniz");
        int length = scan.nextInt();

        int[] nums = new int[length];
        for (int i = 0; i < length; i++)
        {
            System.out.println(i +1 + ".sayiyi giriniz.");
            nums[i] = scan.nextInt();
        }

        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("maxIleMinFarki : "+(nums[nums.length-1]-nums[0]));



    }




}
