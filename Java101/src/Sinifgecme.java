import java.util.Scanner;
public class Sinifgecme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fizik, turkce, kimya, muzik;


        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        double avarage = (mat + fizik + turkce + kimya + muzik)/5;
        if((mat>=0&&mat<=100) && (fizik>=0&&fizik<=100) && (turkce>=0&&turkce<=100) && (kimya>=0&&kimya<=100) && (muzik>=0&&muzik<=100)){

            if (avarage < 55){
                System.out.println("Kaldınız.");
            }else {
                System.out.println("Sınıfı geçtiniz.");
            }
        }else {
            System.out.println("Girdiğiniz notlar sıfır ve yüz aralığında olmalıdır.");
        }
        System.out.print("Sınıf ortalamanız: " + avarage);

    }
}

