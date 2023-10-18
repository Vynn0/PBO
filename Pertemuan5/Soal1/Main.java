class Player {
    String name;
    double health;
    int level;

    // Object member
    Weapon weapon; // Player punya weapon
    Armor armor;

    Player(String name, double health){ // Constructor Player
        this.name = name;
        this.health = health;
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("\nName: " + this.name);
        System.out.println("Health: " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

class Weapon{
    double attackPower;
    String name;
    Weapon(String name, double attackPower){
        this.name = name;
        this.attackPower = attackPower;
    }

    void display(){
        System.out.println("Weapon: " + this.name + ", power: " + this.attackPower);
    }
}

class Armor{
    double defensePower;
    String name;

    Armor(String name, double defensePower){
        this.name = name;
        this.defensePower = defensePower;
    }

        void display(){
        System.out.println("Armor: " + this.name + ", defense: " + this.defensePower);
    }
}

public class Main{
    public static void main(String[] args) {

        // Membuat object player
        Player player1 = new Player("James", 100);
        Player player2 = new Player("Lord", 200);

        // Membuat object weapon
        Weapon sword = new Weapon("excalibur", 15);
        Weapon axe = new Weapon("death axe", 50);

        // Membuat object armor
        Armor chainmail = new Armor("chainmail", 10);
        Armor devilArmor = new Armor("devilArmor", 40);

        // Player 1
        player1.equipWeapon(sword);
        player1.equipArmor(chainmail);
        player1.display();

        // Player 2
        player2.equipWeapon(axe);
        player2.equipArmor(devilArmor);
        player2.display();
    }
}