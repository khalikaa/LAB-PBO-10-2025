class Cuboid {
    double height;
    double width;
    double length;

    double getVolume() {
        return height * width * length;
    }

}

public class no3 {

    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.height = 30;
        cuboid.width = 30;
        cuboid.length = 50;
        System.out.printf("Volume = %.2f", cuboid.getVolume());
    }
}
