package list;

import java.util.ArrayList;
import java.util.Arrays;

public class C_310
{
    // 5) Lstede eleman olarak 15 varsa, tüm 15'ler 51 olarak de trnz.
    // Örnek: (12, 11, 15, 34, 43) ==> Çıktı (12, 11, 51, 34, 43

    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(12,11,15,34,43));

        for (int i = 0; i < nums.size(); i++)
        {
            if(nums.get(i)==15){
                nums.set(i,51);
            }
        }

        System.out.println(nums);

    }
}
