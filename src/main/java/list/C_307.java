package list;

import java.util.ArrayList;
import java.util.Arrays;

public class C_307
{
    // 1) Br tamsayı lstesndek tüm ö elernn toplamını bulunuz
    // 2) Br tamsayı lstesnde 13 öğesnden öncek tüm lste ö elernn toplamını bulunuz
    public static void main(String[] args)
    {

        //---------- example-1
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10,5,15,20));
        System.out.println(nums);
        int sum = 0;

        for (int w : nums){
            sum = sum + w;
        }
        System.out.println(sum);


        System.out.println("----------------");
        //---------------example-2
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(20,30,40,13,50,60));
        System.out.println(numbers);
        int sum2 = 0;

        for (int w : numbers){
            if (w==13){
                break;
            }
            sum2 = sum2 + w ;
        }

        System.out.println(sum2);




    }
}
