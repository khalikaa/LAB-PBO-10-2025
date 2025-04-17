class Senjata {
    String namaSenjata;
    int damage;

    public Senjata() {
        this.namaSenjata = "";
        this.damage = 100;
    }

    public Senjata(String namaSenjata, int damage) {
        this.namaSenjata = namaSenjata;
        this.damage = damage;
    }

    public String getNamaSenjata() {
        return namaSenjata;
    }

    public int getDamage() {
        return damage;
    }

    public void infoSenjata() {
        System.out.println("Senjata: " + namaSenjata + ", Damage: " + damage);
    }
}