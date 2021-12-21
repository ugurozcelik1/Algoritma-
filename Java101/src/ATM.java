import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int deneme = 3, request, balance = 1500;
        while (deneme > 0){
            System.out.print("Kullanıcı adı: ");
            userName = input.nextLine();
            System.out.print("Şifre: ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Sisteme giriş yaptınız.");
                do {
                    System.out.println("1. Bakiye sorgulama\n2. Para yatırma\n3. Para çekme\n4. Çıkış");
                    request = input.nextInt();
                    switch (request) {
                        case 1:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.println("Para girişi: ");
                            int add = input.nextInt();
                            balance += add;
                            break;
                        case 3:
                            System.out.println("Çekmek istediğiniz miktar: ");
                            int ext = input.nextInt();
                            if (ext > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= ext;
                            }
                            break;

                    }

                }while (request != 4);
                System.out.println("Yeniden bekleriz.");
                break;
            }else {
                deneme--;
                System.out.println("Hatalı giriş yaptınız. Kalan hakkınız: " + deneme);
                if (deneme == 0){
                    System.out.println("Deneme hakkınız bitti. Banka ile iletişime geçiniz.");
                }
            }

        }

    }
}
