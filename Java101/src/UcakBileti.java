import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int km, type, age;
        double price;

        System.out.print("Mesafeyi giriniz: ");
        km = input.nextInt();
        System.out.print("Sadece gidiş ise '1' gidiş-dönüş ise '2' giriniz: ");
        type = input.nextInt();
        System.out.print("Yaşı giriniz: ");
        age = input.nextInt();

        if (km > 0){
            price = km * 0.1;
            switch (type){
                case 1:
                    if (age > 0){
                        if (age < 12){
                            price /= 2;
                        }else if ( age < 65){
                            price *= 0.9;
                        }else {
                            price *= 0.7;
                        }System.out.println("Ödenmesi gereken tutar: " + price);
                    }else {
                        System.out.println("Hatalı giriş yaptınız.");
                    }
                    break;
                case 2:
                    if (age > 0){
                        if (age < 12){
                            price *= 0.8;
                        }else if (age<65){
                            price *= 1.8;
                        }else {
                            price *= 1.4;
                        }System.out.println("Ödenmesi gereken tutar: " + price);
                    }else {
                        System.out.println("Hatalı giriş yaptınız.");
                    }
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
                    break;
            }
        }else {
            System.out.println("Hatalı giriş yaptınız.");
        }
    }
}
