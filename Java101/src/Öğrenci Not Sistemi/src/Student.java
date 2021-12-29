class Student {
    String name;
    int stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    Student (String name, String classes, int stuNo, Course c1, Course c2, Course c3){
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }
    void addBulkExamNote (int mat, int addMat, double matPercent, int tarih, int addTarih, double tarihPercent, int fizik, int addFizik, double fizikPercent){

        if (mat >= 0 && mat <= 100 && addMat >= 0 && addMat <= 100 && matPercent <= 1 && matPercent >= 0) {
            this.c1.note = mat*matPercent + addMat*(1.0 - matPercent);
        }
        if (tarih >= 0 && tarih <= 100 && addTarih >= 0 && addTarih <= 100 && tarihPercent <= 1 && tarihPercent >= 0)
            this.c2.note = tarih*tarihPercent + addTarih*(1.0 - tarihPercent);
        if (fizik >= 0 && fizik <= 100 && addFizik >= 0 && addFizik <= 100 && fizikPercent <= 1 && fizikPercent >= 0)
            this.c3.note = fizik*fizikPercent + addFizik*(1.0 - fizikPercent);
        calcAvarage();

    }
    void calcAvarage (){
        this.avarage = (this.c1.note + this.c2.note + this.c3.note) / 3;
        printNote();
    }
    boolean isPass (){
        if (this.avarage >= 55)
            this.isPass = true;
        else this.isPass = false;
        return isPass;
    }
    void printNote (){
        System.out.println("---------------------------");
        System.out.println("Öğrenci: " + this.name);
        System.out.println("Matematik: " + this.c1.note);
        System.out.println("Tarih: "+ this.c2.note);
        System.out.println("Fizik: " + this.c3.note);
        System.out.println("Ortalamanız: " + this.avarage);
        if (isPass())
            System.out.println("Tebrikler, sınıfı geçtiniz!");
        else System.out.println("Sınıfta kaldınız!");
    }

}
