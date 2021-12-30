class Fighter {
    String name;
    int weight;
    int health;
    int damage;
    int dodge;
    int start;

    Fighter (String name, int weight, int health, int damage, int dodge, int start){
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage = damage;
        if (dodge <= 100 && dodge >= 0)
            this.dodge = dodge;
        if (start <= 10 && start >= 0)
            this.start = start;
    }
    int hit(Fighter foe){
        System.out.println(this.name + " " + foe.name + "'e " + this.damage + " hasar vurdu.");
        if (foe.isDodge()) {
            System.out.println(foe.name + " savurdu.");
            return foe.health;
        }
        if (foe.health < this.damage)
            return 0;
        return foe.health - this.damage;
    }
    boolean isDodge (){
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodge;
    }
    boolean isStart (){
        double randomValue = Math.random() * 10;
        return randomValue <= this.start;
    }
}
