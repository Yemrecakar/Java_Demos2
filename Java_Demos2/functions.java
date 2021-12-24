import java.util.Scanner;
public class Main {


    public static int fakt (int a)
    {
        if(a==1 || a==0)
        {
            return 1;
        }
        else

        return (afakt(a-1));//5fakt(4),54fakt(3)... 54321


    }


    public static void main(String[] args)
   {
       System.out.println("sayi giriniz:");//burada sayi sitedim
        Scanner cagir=new Scanner(System.in);//burada da scanner sınıfından nesne vasıtasıyla next fonk eriştim
        int sayi=cagir.nextInt();//sayiyi cagir nesnesiyle cagirdik
       int sonuc= fakt(sayi);
        System.out.println("sayinin faktöriyeli "+ sonuc);




   }
}