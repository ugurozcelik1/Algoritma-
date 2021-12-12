import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        int km;
        double tutar;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Kaç km gittiğinizi yazar mısınız: ");
        km = girdi.nextInt();
        tutar = 10+(2.2*km);
        tutar = (tutar >= 20) ? tutar : 20;

        System.out.println("Ödenmesi gereken tutar: " + tutar);
    }
}


