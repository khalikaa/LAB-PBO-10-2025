public class Armor {
    String helm;
    String vest;

    public Armor() {
        this.helm = "Biasa";
        this.vest = "Kulit";
    }

    public Armor(String helm, String vest) {
        this.helm = helm;
        this.vest = vest;
    }

    public int getDefense(String target) {
        if (target.equalsIgnoreCase("kepala")) {
            return helm.equalsIgnoreCase("Baja") ? 7 : 3;
        } else {
            return vest.equalsIgnoreCase("Baja") ? 5 : 2;
        }
    }

    public String getInfoArmor() {
        return "Helm: " + helm + ", vest: " + vest;
    }
}
