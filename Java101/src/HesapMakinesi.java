import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, islem;
        System.out.print("İşlemi gerçekleştirmek istediğiniz ilk sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.print("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme\nYapmak istediğiniz işlemin numarasını giriniz: ");
        islem = input.nextInt();
        switch (islem){
            case 1:
                System.out.println("Toplamı:" + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarımı: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpımı: " + (n1*n2));
                break;
            case 4:
                if(n2 == 0){
                    System.out.println("Bir sayı sıfıra bölünemez.");
                }else {
                    System.out.println("Bölümü: " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatalı sayı girdiniz, tekrar deneyiniz. ");

        }
    }
}
