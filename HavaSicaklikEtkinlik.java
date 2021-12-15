import java.util.Scanner;
public class HavaSicaklikEtkinlik {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int heat;

        System.out.print("Hava sıcaklığını giriniz: ");
        heat = inp.nextInt();

        if(heat<5){
            System.out.println("Kayak yapmaya gidebilirsin.");
        }else if(heat<10) {
            System.out.println("Sinemaya gidebilirsin.");
        }else if(heat<15) {
            System.out.println("Sinemaya veya pikniğe gidebilirsin.");
        }else if(heat<25){
            System.out.println("Pikniğe gidebilirsin.");
        }else{
            System.out.println("Yüzebilirsin.");
        }

    }
}
