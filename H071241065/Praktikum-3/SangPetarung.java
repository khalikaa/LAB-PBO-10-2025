import java.util.Random;

public class SangPetarung {
    String nama;
    int health;
    Senjata senjata;
    Armor armor;

    public SangPetarung() {
        this.nama = "Unknown";
        this.health = 100;
        this.senjata = new Senjata();
        this.armor = new Armor();
    }

    public SangPetarung(String nama, Senjata senjata, Armor armor) {
        this.nama = nama;
        this.health = 100;
        this.senjata = senjata;
        this.armor = armor;
    }

    public void serang(SangPetarung musuh) {
        Random rand = new Random();
        String target = rand.nextBoolean() ? "kepala" : "badan";
        int serangan = this.senjata.getDamage();
        int pertahanan = musuh.armor.getDefense(target);

        int damage = Math.max(serangan - pertahanan, 0);
        musuh.health -= damage;

        System.out.println(this.nama + " menyerang " + musuh.nama + " ke " + target + " (Damage: " + damage + ")");
        if (musuh.health <= 0) {
            System.out.println(musuh.nama + " tumbang!");
        }
    }

    public void status() {
        System.out.println("=== Status " + nama + " ===");
        System.out.println("Health: " + (health > 0 ? health : "KO"));
        System.out.println("Senjata: " + senjata.getInfoSenjata());
        System.out.println("Armor: " + armor.getInfoArmor());
    }
}
