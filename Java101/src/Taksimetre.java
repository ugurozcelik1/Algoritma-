import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double tutar0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç km gittiğinizi yazar mısınız: ");
        km = girdi.nextInt();
        tutar0 = 10+(2.2*km);
        boolean tutar = tutar0 >= 20;
        tutar0 = tutar ? tutar0 : 20;

        System.out.println("Ödenmesi gereken tutar: " + tutar0);
    }
}
