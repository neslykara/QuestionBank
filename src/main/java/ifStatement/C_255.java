package ifStatement;

import java.util.Scanner;

public class C_255
{
    public static void main(String[] args)
    {
      // 3) Ayın numarasını grd nzde ayın adını yazdırmak çn gereken kodu yazınız.
      //     Örnek; 1 çn çıktı: "Ocak", 2 çn çıktı: " ubat" vb
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adini  ögrenmek istediginiz ay numarasini giriniz.");
        int monthNum = input.nextInt();

        if (monthNum == 1){
            System.out.println("OCAK");
        }
        else if (monthNum == 2) {System.out.println("SUBAT");}
        else if (monthNum == 3) {System.out.println("MART");}
        else if (monthNum == 4) {System.out.println("NİSAN");}
        else if (monthNum == 5) {System.out.println("MAYIS");}
        else if (monthNum == 6) {System.out.println("HAZİRAN");}
        else if (monthNum == 7) {System.out.println("TEMMUZ");}
        else if (monthNum == 8) {System.out.println("AĞUSTOS");}
        else if (monthNum == 9) {System.out.println("EYLÜL");}
        else if (monthNum == 10) {System.out.println("EKİM");}
        else if (monthNum == 11) {System.out.println("KASIM");}
        else if (monthNum == 12) {System.out.println("ARALIK");}
        else {System.out.println("Girdiğinis deger 1-12 aralıgında olmalidir");}


    }
}
