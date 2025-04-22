public class Main {
    public static void main(String[] args) {
        Senjata senjata1 = new Senjata("M188", "shotgun", 20);
        Armor armor1 = new Armor("Baja", "Kulit");

        Senjata senjata2 = new Senjata("AK47", "rifle", 18);
        Armor armor2 = new Armor("Biasa", "Baja");

        SangPetarung petarung1 = new SangPetarung("Adit", senjata1, armor1);
        SangPetarung petarung2 = new SangPetarung("Bima", senjata2, armor2);

        petarung1.status();
        pembatas();
        petarung2.status();
        pembatas();

        petarung1.serang(petarung2);
        petarung2.serang(petarung1);

        pembatas();
        petarung1.status();
        pembatas();
        petarung2.status();
    }

    public static void pembatas() {
        System.out.println("=================================");
    }
}
