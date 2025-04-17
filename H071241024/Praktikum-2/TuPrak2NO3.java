class kubus {
    double height;
    double widht;
    double lenght;
    
    double getVolume(){
        return height *  widht * lenght;
    }
}

public class TuPrak2NO3{
    public static void main(String[] args) {
        kubus cuboid = new kubus();
        cuboid.height = 1;
        cuboid.widht = 1000;
        cuboid.lenght = 45;

        System.out.println(String.format("Volume = %.2f", cuboid.getVolume()));
    }
}