import java.util.Scanner;

class Hero {
    String name;
    int health;
    int attackPower;

    public Hero(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(name + " menyerang dengan kekuatan " + attackPower +"!");
    }
}

class Archer extends Hero {
    public Archer() {
        super("Pemanah", 100, 15);
    }
}

class Wizard extends Hero {
    public Wizard() {
        super("Penyihir", 100, 20);
    }
    
}

class Fighter extends Hero {
    public Fighter() {
        this("Fighter");
    }
    public void attack() {
        System.out.println(name + " fighter menyerang dengan kekuatan " + attackPower +"!");
    }
    public void tes() {
        super.attack();
        this.attack(); //+an
    }

    public Fighter(String name){    
        super(name, 100, 18);
        
    }
}

public class Game {
    public static void main(String[] args) {
        Hero karakter = null;
        Scanner scanner = new Scanner(System.in);
        Fighter fighter = new Fighter();
        fighter.tes();
        while (true) {
            
            System.out.println("1. Archer");
            System.out.println("2. Wizard");
            System.out.println("3. Fighter");
            System.out.println("Masukkan Pilihan: ");
            
            int pilihan = scanner.nextInt();
            
            boolean isvalid = false;
            switch (pilihan) {
                case 1:
                karakter = new Archer();
                isvalid = true;
                break;
                case 2:
                karakter = new Wizard();
                isvalid = true;
                break;
                case 3:
                karakter = new Fighter();
                isvalid = true;
                break;
                default:
                System.out.println("Pilihan tidak valid");
                // scanner.close();
                // return;
                
            }
            while (isvalid) {
                System.out.println("1. Serang");
                System.out.println("2. Keluar");
                System.out.println("Pilih aksi: ");
    
                String aksi = scanner.nextLine();
                
                if (aksi.equals("1")){
                    karakter.attack();

                }else if(aksi.equals("2")){
                    System.out.println("Game Selesai");
                    scanner.close();
                    return;
                }else{
                    System.out.println("Pilihan Tidak Valid");
                }
            }
        }
    }
}
