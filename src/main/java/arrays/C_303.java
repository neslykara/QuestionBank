package arrays;

public class C_303
{
    public static void main(String[] args) {
        //8) ilk ve son karakterler aynı olan array ö elern bulmak çn kod yazınız

        String[] words = new String[]{"alabama", "pick", "sos", "sets", "pex"};

        for(String w : words)
        {
            if (w.charAt(0)==w.charAt(w.length()-1))
            {
                System.out.println(w);
            }

        }


        System.out.println("------------------------");



        // 9) Verlen br Strng arraydek belrl br ögenin var olup olmadı ını bulmak çn kod yazınız

        String[] arr = new String[]{"Apex", "is", "an", "object", "oriented", "programming", "language"};

        String oge = "is";
        int kacTane=0;

        for (String w: arr)
        {
            if (w.equalsIgnoreCase(oge))
            {
                kacTane++;
            }

        }

        if (kacTane>0){
        System.out.println(oge + " -> arr içinde "+ kacTane+ " adet bulunmaktadır. ");
        }else {
            System.out.println(oge + " -> arr icinde bulunmamaktadır. ");
        }




    }

}
