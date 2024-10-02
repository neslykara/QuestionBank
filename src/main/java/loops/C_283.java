package loops;

public class C_283
{
    public static void main(String[] args)
    {
        //Verlen ondalık sayının sadece ondalık kısmındak rakamlarını, kendsnden önce br yıldız 
        //isaretyle yazdırmak çn gereken kodu yazınız.
        // Örne n; 75.4238 ´ *4*2*3*8

        Double sayi = 75.4238;
        String sayiStrng = String.valueOf(sayi);
        sayiStrng = sayiStrng.split("\\.")[1];
        String s = "";

        for (int i = 0; i < sayiStrng.length(); i++)
        {
            s = s + "*"+sayiStrng.charAt(i);
        }

        System.out.print(s);

    }
}
