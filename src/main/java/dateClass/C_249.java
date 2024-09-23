package dateClass;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class C_249
{
    public static void main(String[] args)
    {
     //  1) Al 'nn kaç gün yaadı ını bulan kodu yazınız.
     //  Al 'nn do um tarh 12 Mayıs 2002'dr.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogum tarihini (yyyy-mm-dd) formatinda yaziniz");
        String dogumTarihstr = input.nextLine();

        LocalDate dogumTarihi = LocalDate.parse(dogumTarihstr);
        LocalDate bugunTarih = LocalDate.now();

        long yasananGun = ChronoUnit.DAYS.between(dogumTarihi , bugunTarih);
        System.out.println("yasananGun = " + yasananGun);

          //      LocalDate dogumGunuTarh = LocalDate.of(2002, 5, 12);
          //  LocalDate bugunTarh = LocalDate.now();
          //  long yasadgGunSays = ChronoUnt.DAYS.between(dogumGunuTarh, bugunTarh);
          //  System.out.prntln("Al ’ nn su ana kadar yasadg gun says :  " + yasadgGunSays);

     //  2) Al 'nn kaç ay yaadı ını bulan kodu yazınız.
     //  Al 'nn do um tarh 4 Hazran 1997'dr.

        long yasananAy = ChronoUnit.MONTHS.between(dogumTarihi,bugunTarih);
        System.out.println("yasananAy = " + yasananAy);

          //      LocalDate dogumGunuTarh = LocalDate.of(1997, 06, 04);
          //  LocalDate bugunTarh = LocalDate.now();
          //  long yasadgAySays = ChronoUnt.MONTHS.between(dogumGunuTarh, bugunTarh);
          //  System.out.prntln("Al 'nn su ana kadar yasadgı ay says :" + yasadgAySays);

     //  3) Al 'nn do um tarh 4 Hazran 1997'dr. Al 'nn do um tarhnden 2 yıl, 3 ay ve 12 gün
     //  sonrak tam tarh bulmak çn kodu yazınız

        LocalDate istenenTarih = dogumTarihi.plusYears(2).plusMonths(3).plusDays(12);
        System.out.println("istenenTarih = " + istenenTarih);


    }
}
