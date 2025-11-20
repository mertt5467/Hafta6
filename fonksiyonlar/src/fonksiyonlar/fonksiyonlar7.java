package fonksiyonlar;

import java.util.Scanner;

public class fonksiyonlar7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Sayýyý Giriniz.");
        int sayi = input.nextInt();
        result(sayi);
    }
    
    static void result(int x) {
        if(x <= 0){
            System.out.println("Lütfen 1 veya üzeri bir sayý giriniz.");
            return;
        }
        for (int i = 1; i <= x; i++) {
            System.out.println(i);
        }
    }

}
