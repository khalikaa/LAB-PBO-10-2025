public class Fighter extends Hero {

    public Fighter(String name, int health, int attackPower) {
        super(name, health, attackPower);
        this.attack(); //Memanggil method attack() pakai this

    }
    public Fighter (String name) {
        super(name);
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower + "!");
    }
}
