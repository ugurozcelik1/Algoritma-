class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee (String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax (){
        double tax = 0;
        if (this.salary >= 1000)
             tax = this.salary * 0.03;
        return tax;
    }
    int bonus (){
        int bonus = 0;
        if (this.workHours > 40)
            bonus = (this.workHours - 40) * 30;
        return bonus;
    }
    double raiseSalary (){
        double raiseSalary = this.salary * 0.05;
        if (this.hireYear > 9 && this.hireYear < 20)
            raiseSalary = this.salary * 0.1;
        else if (this.hireYear > 19)
            raiseSalary = this.salary * 0.15;
        return raiseSalary;
    }
    void printEmployee (){
        double result1 = this.salary + this.bonus() - this.tax();
        double resultS = this.salary + this.bonus() + this.raiseSalary() - this.tax();
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Maaş artışı: " + this.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + result1);
        System.out.println("Toplam maaş: " + resultS);
    }
}
