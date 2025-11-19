package fonksiyonlar;

import java.util.Scanner;

public class fonksiyonlar8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayý giriniz.");
        long sayi = input.nextLong();
        result(sayi);

    }

    static void result(long x) {
        int sayac = 0;
        if (x == 0) {
            System.out.println("Girdiðiniz sayý 1 basamaklýdýr.");
            return;
        }
        if (x < 0) {
            x *= -1;
        }
        while (x > 0) {
            x /= 10;
            sayac++;
        }
        System.out.println("Girdiðiniz sayý " + sayac + " basamaklýdýr.");
    }
}