import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double KDVsiz, KDVli18, KDVli8, KDVTutar18, KDVTutar8 = 0, KDVOran18=0.18, KDVOran8=0.08;
        System.out.print("Lütfen Yatırılan Para Tutarını Girin : ");
        KDVsiz = sc.nextDouble();
        //System.out.println("Not : KDV tutarı %18 olarak hesaplanacak!");
        //KDV'li
        KDVli18 = KDVsiz +  KDVsiz*KDVOran18;
        KDVli8 = KDVsiz +  KDVsiz*KDVOran8;
        KDVTutar18 = KDVsiz*KDVOran18;
        KDVTutar8 = KDVsiz * KDVOran8;
        double tutar = KDVsiz <= 1000 ? KDVTutar18 : KDVTutar8;
        double oran = KDVsiz <= 1000 ? KDVOran18 : KDVOran8;
        double kdvli = KDVsiz <= 1000 ? KDVli18 : KDVli8;

        //KDV %18
        //KDV %8

        System.out.println("----------------------------------------------------");
        System.out.println("KDV'siz Fiyat : "+ KDVsiz);
        System.out.println("KDV Oranı : "+oran);
        System.out.println("KDV'li Fiyat : "+ kdvli);
        System.out.println("KDV Tutarı : "+ tutar);
    }
}