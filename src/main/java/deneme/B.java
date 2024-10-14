package deneme;

public class B extends A
{
    public int sayi1 = 15;
    public void m1(){
        System.out.println("B");
    }





     public B()
   {
       super("Ali");
       System.out.println("Child parametresiz const");
   }
  public B(String surname)
   {
      // super("Ali");
       System.out.println("Child parametreli const "+surname);
   }


}
