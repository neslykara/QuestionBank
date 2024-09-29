import java.util.Scanner;

public class Deneme {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Passwordunuzu giriniz");
        String password = scan.nextLine();
        while(!(password.equals("AliCan"))) {
            System.out.println("Yanlış");
            System.out.println("Passwordunuzu giriniz");
            password = scan.nextLine();
        }
        System.out.println("Dogru");
    }
}
