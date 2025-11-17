package fonksiyonlar;

import java.util.Scanner;

public class kdvHesaplayici {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fiyatý Giriniz.");
        double ilkFiyat = input.nextDouble();
        double sonFiyat = yeniFiyat(ilkFiyat);
        System.out.println("KDV'li Fiyat : " + sonFiyat);
    }

    static double yeniFiyat(double x) {
        double result = (x * 18)/100;
        return result + x;
    }

}
