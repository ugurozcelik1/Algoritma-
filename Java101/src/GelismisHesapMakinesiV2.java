import java.util.Scanner;

public class GelismisHesapMakinesiV2 {
    static void sum (){
        Scanner input = new Scanner(System.in);
        int result = 0;
        while (true){
            System.out.print("Sayı: ");
            int a = input.nextInt();
            result += a;
            System.out.println("Toplam: " + result);
            if (a == 0) break;
        }
    }
    static void  minus (){
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç işlem yapacaksınız: ");
        int times = input.nextInt();
        int result = 0;
        for (int i = 1; i <= times; i++){
            System.out.print(i + ". sayı: ");
            int a = input.nextInt();
            if (i == 1){
                result = a;
            }else {
                result -= a;
            }
            System.out.println(result);
            if (a == 0) break;
        }
    }
    static  void times (){
        Scanner inp = new Scanner(System.in);
        int result = 1;
        while (true){
            System.out.print("Sayı: ");
            int a = inp.nextInt();
            result *= a;
            if (a == 1){
                System.out.println("Sonuç: " + result);
                break;
            }
            if (a == 0){
                System.out.println("Sonuç: 0");
                break;
            }
            System.out.println("Sonuç: " + result);
        }
    }
    static void divided (){
        Scanner input = new Scanner(System.in);
        double result = 1.0;
        System.out.print("Kaç işlem Yapacaksınız: ");
        int times = input.nextInt();
        for (int i = 1; i <= times; i++){
            System.out.println("Sayı: ");
            int a = input.nextInt();
            if (i == 1){
                result = a;
                if (a == 0){
                    System.out.println("Sonuç: " + 0);
                    break;
                }
            }else {
                if (a == 0){
                    System.out.println("Bir sayı 0'a bölünemez.");
                    break;
                }else {
                    result /= a;
                    System.out.println("Sonuç: " + result);
                }
            }
        }
    }
    static void power (){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz: ");
        int base = input.nextInt();
        System.out.print("Üssü giriniz: ");
        int exp = input.nextInt();
        int result = 1;
        for (int i = 1; i <= exp; i++){
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }
    static void fact (){
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı: ");
        int a = input.nextInt();
        int result = 1;
        for (int i = 1; i <= a; i++){
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }
    static void mod (){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı: ");
        int a = input.nextInt();
        System.out.print("Bölüm: ");
        int b = input.nextInt();
        int result = a % b;
        System.out.println("Bölümünden kalan: " + result);
    }
    static void rectangle (){
        Scanner input = new Scanner(System.in);
        System.out.print("Uzun kenar: ");
        int a = input.nextInt();
        System.out.print("Kısa kenar: ");
        int b = input.nextInt();
        int resultAlan = a * b;
        int resultCevre = 2*(a + b);
        System.out.println("Dikdörtgen alanı: " + resultAlan);
        System.out.println("Dikdörtgen çevresi: " + resultCevre);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String menu = "1. Toplama\n" +
                "2. Çıkarma\n" +
                "3. Çarpma\n" +
                "4. Bölme\n" +
                "5. Üs alma\n" +
                "6. Faktöriyel\n" +
                "7. Mod alma\n" +
                "8. Dikdörtgen alanı ve çevresi\n" +
                "0. Çıkış\n";

        System.out.println(menu);
        while (true){
            System.out.print("İşlem: ");
            int select = input.nextInt();
            switch (select){
                case 1:
                    sum();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış değer girdiniz. Tekrar deneyiniz!");
            }
            if (select == 0) break;
        }
        System.out.println("Görüşmek üzere!");
    }
}
