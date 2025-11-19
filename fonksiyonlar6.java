package fonksiyonlar;

import java.util.Scanner;

public class fonksiyonlar6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayý giriniz.");
        int sayi = input.nextInt();
        result(sayi);

    }

    static void result(int x) {
        if (x > 0) {
            System.out.println("Sayý Pozitif");
        } else if (x == 0) {
            System.out.println("Sayý Nötr");
        } else {
            System.out.println("Sayý Negatif");
        }
    }

}
