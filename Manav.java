import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        int armut, elma, domates, muz, patlican;

        Scanner input = new Scanner(System.in);

        System.out.print("Armut kg: ");
        armut = input.nextInt();

        System.out.print("Elma kg: ");
        elma = input.nextInt();

        System.out.print("Domates kg: ");
        domates = input.nextInt();

        System.out.print("Muz kg: ");
        muz = input.nextInt();

        System.out.print("Patlican kg: ");
        patlican = input.nextInt();
        double armutKg = 2.14*armut, elmaKg = 3.67*elma, domatesKg =1.11*domates, muzKg = 0.95*muz, patlicanKg = 5*patlican;

        System.out.print("Toplam Tutar: " + (armutKg+elmaKg+domatesKg+muzKg+patlicanKg));

    }
}
