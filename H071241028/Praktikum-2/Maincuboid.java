import java.util.Scanner;

class Cuboid { 
    double height; 
    double width;
    double length; 
    
     double getVolume() {
        return height * width * length; 
    }
}
public class Maincuboid {


    public static void main(String[] args) {
        // Cuboid cuboid = new Cuboid();
        // cuboid.height = 10;
        // cuboid.width = 15;
        // cuboid.length = 30;

        Scanner scanner = new Scanner(System.in);
        Cuboid cuboid = new Cuboid();

        System.out.print("Masukkan tinggi (height): ");
        cuboid.height = scanner.nextDouble();

        System.out.print("Masukkan lebar (width): ");
        cuboid.width = scanner.nextDouble();

        System.out.print("Masukkan panjang (length): ");
        cuboid.length = scanner.nextDouble();

        System.out.println(String.format("Volume = %2.2f", cuboid.getVolume()));
        
        scanner.close();
    }
}
    

