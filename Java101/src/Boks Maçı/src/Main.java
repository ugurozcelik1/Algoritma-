public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Conor", 75, 100, 15,50,5);
        Fighter f2 = new Fighter("Habib", 73,100, 15,50,5);

        Match m1 = new Match(f1,f2,70,75);
        m1.isCheck();



    }
}
