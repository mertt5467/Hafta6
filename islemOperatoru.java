package fonksiyonlar;

import java.util.Scanner;

public class islemOperatoru {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Sayýyý giriniz.");
        int sayi1 = input.nextInt();
        System.out.println("2. Sayýyý giriniz.");
        int sayi2 = input.nextInt();
        int islem = carpim(sayi1, sayi2);
        System.out.println("Çarpým: " + islem);

    }

    static int carpim(int a, int b) {
        return a * b;

    }

}
