import java.util.Scanner;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        // Lengkapi
        return height * width * length;
    }
}

public class Main { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cuboid cuboid = new Cuboid();

        System.out.print("Masukkan tinggi (height):" );
        double tinggi = input.nextDouble();
        cuboid.height = tinggi;
        System.out.print("Masukkan Lebar (width): ");
        double lebar = input.nextDouble();
        cuboid.width = lebar;
        System.out.print("Masukkan panjang (length)");
        double panjang = input.nextDouble();
        cuboid.length = panjang;


        System.out.println(String.format("Volume = %.2f", cuboid.getVolume()));

        input.close();

    }
}
