package fonksiyonlar;

import java.util.Scanner;

public class paraUstuMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double paraUstu;
        System.out.println("Lütfen alacaðýnýz ürününün numarasýný yazýnýz.");
        yiyeceklist();
        int numara = input.nextInt();
        int ucret = yiyecekler(numara);

        if (ucret == -1) {
            System.out.println("Program sonlandýrýlýyor...");
        } else {
            System.out.println("Ödeyeceðiniz tutarý giriniz");
            double odeme = input.nextDouble();
            if (odeme <= 0) {
                System.out.println("Lütfen geçerli bir sayý giriniz.");
            } else {
                paraUstu = odeme - ucret;
                if (paraUstu >= 0) {
                    System.out.println("Para Üstü :\n" + paraUstu);
                } else {
                    paraUstu = ucret - odeme;
                    System.out.println("Bakiye Yetersiz! " + paraUstu + " TL daha gerek.");
                }
            }
        }
    }

    static void yiyeceklist() {
        System.out.println("1 - Su (10 TL)");
        System.out.println("2 - Çubuk Kraker (15 TL)");
        System.out.println("3 - Bisküvi (25 TL)");
        System.out.println("4 - Lolipop (12 TL)");
        System.out.println("5 - Çikolata (18 TL)");
        System.out.println("6 - Meyve Suyu (20 TL)");
        System.out.println("7 - Soda (30 TL)");
        System.out.println("8 - Kek (15 TL)");
    }

    static int yiyecekler(int x) {
        int fiyat = -1;
        switch (x) {
            case 1:
                fiyat = 10;
                break;
            case 2:
                fiyat = 15;
                break;
            case 3:
                fiyat = 25;
                break;
            case 4:
                fiyat = 12;
                break;
            case 5:
                fiyat = 18;
                break;
            case 6:
                fiyat = 20;
                break;
            case 7:
                fiyat = 30;
                break;
            case 8:
                fiyat = 15;
                break;
            default:
                System.out.println("Geçersiz bir numara girdiniz");
                break;
        }

        return fiyat;
    }

}
