package arrays;

public class C_301
{
    public static void main(String[] args)
    {
        // Strng’ lerden oluan br arrayde ö eler 'n' veya 'k' le btyorsa, o ö elern ba harflern
        //alınız.
        // Örnek: { “Kemal”, “Jonathan”, “Mark”, “Jackson”, “Ali” } ==> Çıktı JJM


        String[] names = new String[]{ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };

        for (String w : names)
        {
            if(w.charAt(w.length()-1)=='k' || w.charAt(w.length()-1)=='n' )
            {
                System.out.print(w.charAt(0));

            }
        }


        //Strng’ lerden oluan br arrayde kullanılan ö elern toplam karakter sayısını bulunuz.
        // Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı 26

        int totalCharacter = 0;
        for (String w : names)
        {
            totalCharacter = totalCharacter + w.length();
        }
        System.out.println("\n"+totalCharacter);










    }
}
