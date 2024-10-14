package list;

import java.util.ArrayList;
import java.util.Arrays;

public class C_308
{
    // 3) Br tamsayı lstesndek tüm çft sayıların çarpımını bulunuz
    public static void main(String[] args)
    {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(2,3,4,5,6,7,8,9,10));
        System.out.println(nums);
        int protect = 1 ;

        for (int w : nums){
            if (w%2==0){
                protect = protect * w ;
            }
        }
        System.out.println(protect);

    }
}
