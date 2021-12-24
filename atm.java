import java.util.Scanner;//atm örneği
 
public class Main {
    public static void main(String args[]) {

       int bakiye=850;
       int yatirilan=0;
       int toplam=0;
       int cekilen;

      System.out.println("islemleriniz su sekildedir:\n");

      System.out.println("1. para yatırma\n 2.para cekme\n 3.kart iade \n 4.bakiye sorgulama \n 5.ana menuye donun \n islemi seciniz:");
      Scanner nesne=new Scanner(System.in);
      int islem=nesne.nextInt();



      switch(islem)
      {
        case 1:
            System.out.println("bakiyeniz: "+bakiye);
            System.out.println("ne kadar yatıracaksınız?");
            yatirilan=nesne.nextInt();
            toplam=yatirilan+bakiye;
            System.out.println("yeni bakiye="+toplam);
            break;

        case 2:

            System.out.println("bakiyeniz: "+bakiye);
            System.out.println("ne kadar cekeceksiniz?");
            cekilen=nesne.nextInt();
            toplam=cekilen-bakiye;
            System.out.println("yeni bakiye="+toplam);
            break;
        case 3:
            System.out.println("Kartınızı iade ediyoruz!!!")
            break;
        case 4:
            System.out.println("Bakiyenizi göstereceğiz...")
            System.out.println(bakiye)
            break;
        case 5:
            System.out.println("Ana menüye dönüyorsunuz")

        default