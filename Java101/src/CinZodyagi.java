import  java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year, zodyak;

        String burc = "";
        System.out.println("Doğum yılınızı giriniz: ");
        year = input.nextInt();
        zodyak = year%12;
        switch (zodyak){
            case 0:
                burc = "Maymun";
                break;
            case 1:
                burc = "Horoz";
                break;
            case 2:
                burc = " Köpek";
                break;
            case 3:
                burc = " Domuz";
                break;
            case 4:
                burc = "Fare";
                break;
            case 5:
                burc = "Öküz";
                break;
            case 6:
                burc = "Kaplan";
                break;
            case 7:
                burc = "Tavşan";
                break;
            case 8:
                burc = "Ejderha";
                break;
            case 9:
                burc = "Yılan";
                break;
            case 10:
                burc = "At";
                break;
            case 11:
                burc = "Koyun";
                break;
            default:
                System.out.println("Hatalı giriş.");

        }
        System.out.println("Zodyak burcunuz: " + burc);
    }
}
