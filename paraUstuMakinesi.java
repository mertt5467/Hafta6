package fonksiyonlar;

import java.util.Scanner;

public class paraUstuMakinesi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double paraUstu;
        System.out.println("Lütfen alacaðýnýz ürününün numarasýný yazýnýz.");
        yiyeceklist();
        byte numara = input.nextByte();
        int ucret = yiyecekler(numara);

        if (ucret <= 0) {

        } else {
            System.out.println("Ödeyeceðiniz tutarý giriniz");
            double odeme = input.nextShort();
            if (odeme <= 0) {
                System.out.println("Lütfen geçerli bir sayý giriniz.");
            } else {
                paraUstu = odeme - ucret;
                if (paraUstu >= 0) {
                    System.out.println("Para Üstü :\n" + paraUstu);
                } else {
                    System.out.println("Bakiye Yetersiz!");
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
    }

    static int yiyecekler(byte x) {
        byte fiyat = 0;
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
            default:
                System.out.println("Lütfen Geçerli bir sayý giriniz.");
                break;
        }

        return fiyat;
    }

}
