import java.util.Scanner;
public class NotOrtalamasiHesaplayanProgram {
    public static void main(String[] args) {
        //Değerleri alalım.
        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.println("Matematik sınav sonucunu giriniz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        int sonuc = (mat + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println(sonuc);

        String str = sonuc >= 60 ? "Geçti" : "Kaldı";
        System.out.println(str);
    }
}

