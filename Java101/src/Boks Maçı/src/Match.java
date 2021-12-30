public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match (Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    void isCheck (){
        if (this.f1.weight >= this.minWeight && this.f1.weight <= maxWeight && this.f2.weight>= this.minWeight && this.f2.weight <= this.maxWeight){
            run();
        }else System.out.println("Dövüşçülerin sikletleri uymuyor. Dövüşemezler.");
    }
    void run () {
        while (this.f1.health > 0 && this.f2.health > 0) {
            System.out.println("=========YENİ ROUND==========");
            if (f2.isStart()) {
                this.f1.health = f2.hit(f1);
                System.out.println(this.f1.name + " sağlığı: " + this.f1.health);
                if (winCheck())
                    break;
                this.f2.health = f1.hit(f2);
                if (winCheck())
                    break;
                System.out.println(this.f2.name + " sağlığı: " + this.f2.health);
            }else {
                this.f2.health = f1.hit(f2);
                System.out.println(this.f2.name + " sağlığı: " + this.f2.health);
                if (winCheck())
                    break;
                this.f1.health = f2.hit(f1);
                if (winCheck())
                    break;
                System.out.println(this.f1.name + " sağlığı: " + this.f1.health);
            }
        }
    }

    boolean winCheck (){
        if (this.f1.health <= 0) {
            System.out.println("Kazanan: " + f2.name);
            return true;
        }
        else if (this.f2.health <=0) {
            System.out.println("Kazanan: " + f1.name);
            return true;
        }
        else return false;
    }
}
