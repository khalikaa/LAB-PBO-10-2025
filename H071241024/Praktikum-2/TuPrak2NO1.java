import java.util.Scanner;

public class TuPrak2NO1 {

    static class Person {
        String name;
        int age;
        boolean gender;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }

        public String getGender() {
            return (gender) ? "Laki-laki" : "Perempuan";
        }
    }

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person orang = new Person();

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();
        orang.setName(nama);

        int umur;
        boolean validUmur = false;
        while (!validUmur) {
            System.out.print("Masukkan Umur : ");
            if (input.hasNextInt()) {
                umur = input.nextInt();
                orang.setAge(umur);
                validUmur = true;
            } else {
                System.out.println("Error: Umur harus berupa angka");
                input.next();
            }
        }

        boolean gender = false;
        boolean validGender = false;
        while (!validGender) {
            System.out.print("Apakah Laki-laki? (true/false) : ");
            if (input.hasNextBoolean()) {  
                gender = input.nextBoolean();
                orang.setGender(gender);
                validGender = true;
            } else {
                System.out.println("Input harus true atau false");
                input.next(); 
            }
        }

        System.out.println("Nama   : " + orang.getName());
        System.out.println("Umur   : " + orang.getAge());
        System.out.println("Gender : " + orang.getGender());

        input.close();
    }
}