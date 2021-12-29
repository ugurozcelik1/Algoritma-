public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut",543,"MAT");
        Teacher t2 = new Teacher("Akın",542,"TRH");
        Teacher t3 = new Teacher("Külyutmaz",545,"FZK");

        Course mat = new Course("Matematik","101","MAT",t1);
        Course tarih = new Course("Tarih","102","TRH",t2);
        Course fizik = new Course("Fizik","103","FZK",t3);

        mat.addTeacher(t1);
        tarih.addTeacher(t2);
        fizik.addTeacher(t3);



        Student s1 = new Student("Uğur","9-B",1,mat,tarih,fizik);
        Student s2 = new Student("İnek Şaban","9-B",2,mat,tarih,fizik);
        s1.addBulkExamNote(100,80,0.8,70,60,0.7,90,80,0.8);
        s2.addBulkExamNote(30,80,0.8,50,90,0.7,40,80,0.8);



    }
}
