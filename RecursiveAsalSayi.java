import java.util.Scanner;

public class RecursiveAsalSayi {
    static int prime (int primeNumber, int a){
        int result;
        if (a == 1)
            return 1;
        int mod = primeNumber % a;
        result = mod * prime(primeNumber, a-1);
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz: ");
        int primeNumber = input.nextInt();
        int a = primeNumber - 1;
        if (prime(primeNumber, a) != 0){
            System.out.println(primeNumber + " sayısı ASALDIR!");
        }else {
            System.out.println(primeNumber + " sayısı ASAL değildir!");
        }

    }
}
