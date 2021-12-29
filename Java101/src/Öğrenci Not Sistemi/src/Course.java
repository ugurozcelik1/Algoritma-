class Course {
    String name;
    String code;
    String prefix;
    double note;
    Teacher teacher;

    Course (String name, String code, String prefix, Teacher teacher){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.teacher = teacher;
    }
    void addTeacher (Teacher teacher){
        if (teacher.branch.equals(prefix))
            this.teacher = teacher;
        else System.out.println("Yanlış öğretmen ataması yaptınız.");
    }

    void printTeacher (Teacher teacher){
        if (teacher.branch.equals(null))
            System.out.println("Bu derse öğretmen ataması yapılmamıştır.");
        else {
            System.out.println("İsmi: " + teacher.name);
            System.out.println("Branşı: " + teacher.branch);
            System.out.println("Tel: " + teacher.mpno);
        }
    }
}
