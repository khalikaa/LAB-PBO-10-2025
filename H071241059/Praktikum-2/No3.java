import java.util.Scanner;

class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }
}

public class No3 {
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();

        Scanner input = new Scanner(System.in);

        cuboid.height = input.nextDouble();
        cuboid.width = input.nextDouble();
        cuboid.length = input.nextDouble();

        input.close();

        System.out.printf("Volume == %.2f", cuboid.getVolume());
    }
}
