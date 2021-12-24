import java.util.Scanner;//diziye eleman ekleme ve eklem-nilen elemanları 
 
public class Main {
    public static void main(String args[]) {
         int n;
         Scanner nesne=new Scanner(System.in);
        System.out.println(" boyut giriniz ");//boyutu aldik
          n=nesne.nextInt();

    int dizi[] = new int[n];
    int toplam=0;



    for(int i=0;i<n;i++)
    {
    System.out.println((i+1)+". elemani giriniz:");
      dizi[i]=nesne.nextInt();
      toplam+=dizi[i]  ;
      }
           System.out.println("toplam = "+toplam);
 
    }
}