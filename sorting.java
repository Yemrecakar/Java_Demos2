import java.util.Scanner;
public class Main {


    public static void main(String[] args)//dizinin elemanlarindan en kucugunu bulan program
   {
       int n;
       int enkucuk;

       System.out.println("n sayisini giriniz:");//burada sayi sitedim
        Scanner cagir=new Scanner(System.in);//burada da scanner sınıfından nesne vasıtasıyla next fonk eriştim
        n=cagir.nextInt();//sayiyi cagir nesnesiyle cagirdik
        int dizi[]=new int [n];
        for(int i=0;i<n;i++)
        {
         System.out.println((i+1)+" .sayiyi giriniz:");//burada sayi sitedim

      dizi[i]=cagir.nextInt();//sayiyi cagir nesnesiyle cagirdik
        enkucuk=dizi[0];
        if(enkucuk>dizi[i])
            {
             System.out.println(" en kucuk eleman "+dizi[i]);
             }
       else
         System.out.println("en kucuk eleman :"+enkucuk);

        }

    }






   }