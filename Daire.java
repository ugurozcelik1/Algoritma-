import java.util.Scanner;
public class Daire {
    public static void main(String[] args) {
        int cap, a;
        double pi = 3.14;
        System.out.print("Hesaplanmasını istediğiniz dairenin çapını yazınız: ");
        Scanner input = new Scanner(System.in);
        cap = input.nextInt();

        System.out.println("Dairenin alanı: " + pi*cap*cap);
        System.out.println("Dairenin çevresi: "+ 2*pi*cap);

        System.out.print("Mevcut dairenin dilim alanının hesabı için daire açısını yazınız: ");
        a = input.nextInt();

        System.out.println("Daire diliminin alanı: " + pi*cap*cap*a/360);

    }
}
