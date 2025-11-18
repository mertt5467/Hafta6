package fonksiyonlar;

import java.util.Scanner;

public class fonksiyonlar5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Sayýyý giriniz.");
        int sayi1 = input.nextInt();
        durum(sayi1);
        
    }

    static int durum(int x) {
        int toplam = 0;
        System.out.println("Girilen Sayý = " + x);
        if (x <= 0) {
            System.out.println("Geçersiz sayý!");
            return -1;
        } else {
            System.out.print("Hem 3'e hem 5'e tam bölünen sayýlar: ");
            for (int i = 1; i < x; i++) {
                if (i % 15 == 0) {
                    System.out.print(i + ", ");
                    toplam += i;    
                }
            }
            System.out.println("\nToplam: " + toplam);
            return x;
        }

    }

}
