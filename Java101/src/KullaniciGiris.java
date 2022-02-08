import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        password = input.nextLine();

        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş başarılı! ");
        }else {
            System.out.print("Kullanıcı adı veya şifre hatalı. Şifrenizi sıfırlamak isterseniz ``1``i, istemezseniz```0``ı tuşlayınız. ");
            int a = input.nextInt();
            if (a==1) {
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = inp.nextLine();
                if (newPassword.equals("java123"))
                    System.out.println("Yeni şifreniz eskisiyle aynı olamaz!");
                else
                    System.out.println("Yeni şifreniz oluşturuldu.");
            }
            if (a == 0) System.out.println("Giriş bilgilerinizi tekrar giriniz.");
        }
    }
}
