package arrays;

import java.util.Arrays;

public class C_300
{
    public static void main(String[] args) {
        //Tamsayılardan oluan br arrayde en küçük poztf elemanı ve en büyük negatf elemanı
        //bulunuz.
        // Örnek:(-12, 18, -5, 23, -2) ==> En küçük poztf 18, en büyük negatf -2

        int[] nums = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(nums);

        int minPoz = nums[nums.length-1];
        int maxNeg = nums[0];

        for (int w: nums)
        {
            if (w>0)
            {
                minPoz=Math.min(minPoz,w);
            } else if (w<0) {
                maxNeg=Math.max(maxNeg,w);

            }

        }
        System.out.println(minPoz);
        System.out.println(maxNeg);
    }
}
