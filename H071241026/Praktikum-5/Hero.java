public class Hero {
    protected String name;
    protected int health;
    protected int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }
    public Hero(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println(name + " Menyerang dengan kekuatan " + attackPower + "!");
    }
}
