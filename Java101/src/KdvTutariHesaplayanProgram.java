import java.util.Scanner;
public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double tutar, kdv;

        Scanner inp = new Scanner(System.in);

        System.out.print("KDV'li fiyatını görmek istediğniz ürünün tutarını giriniz: ");
        tutar = inp.nextDouble();
        Boolean kdvOrani = tutar >= 1000;
        kdv = kdvOrani ? 0.08 : 0.18;

        System.out.println("KDV'siz tutar: " + tutar);

        System.out.println("KDV tutarı: " + tutar*kdv);

        System.out.println("KDV'li fiyatı: " + tutar*(kdv+1));

    }
}
