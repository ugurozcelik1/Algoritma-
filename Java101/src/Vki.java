import java.util.Scanner;
public class Vki{
        public static void main(String[] args) {
            int kilo;
            double boy;

            Scanner inp = new Scanner(System.in);

            System.out.print("Lütfen byunuzu metre cinsinden giriniz: ");
            boy = inp.nextDouble();

            System.out.print("Lütfen kilonuzu giriniz: ");
            kilo = inp.nextInt();

            System.out.print("Vücut Kitke İndeksiniz: " + kilo / (boy * boy));
        }
}
