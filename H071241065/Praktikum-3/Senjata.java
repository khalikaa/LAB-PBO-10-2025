public class Senjata {
    String merek;
    String jenis;
    int damage;

    public Senjata() {
        this.merek = "Default";
        this.jenis = "M500";
        this.damage = 10;
    }

    public Senjata(String merek, String jenis, int damage) {
        this.merek = merek;
        this.jenis = jenis;
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    public String getInfoSenjata() {
        return jenis + " merek " + merek + " (Damage: " + damage + ")";
    }
}
