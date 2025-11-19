package fonksiyonlar;

import java.util.Scanner;

public class fonksiyonlar1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayý girin:");
            int sayi = input.nextInt();
            int result = islem(sayi);
            if (result >= 0) {
                System.out.println("çift sayýlarýn toplamý: " + result);
            }
            
        
    }

    static int islem(int x) {
        int toplam = 0;
        if (x < 0) {
            System.out.println("Negatif sayý girilemez!");
            return -1;
        } else {
            for (int i = x; i > 0; i--) {
                if (i % 2 == 0) {
                    toplam += i;
                }

            }
            return toplam;
        }

    }
}
