public class Person {
    private String name; 
    private int age;
    private boolean isMale;

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

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        return isMale ? "Laki-laki" : "Perempuan";
    } 

    public static void main(String[] args) {
        Person orang = new Person(); 
        Person orang1 = new Person();

        orang1.name = "Zahra";
        orang1.age = 19;
        orang1.isMale = false ;

        orang.setName("Adit");
        orang.setAge(20); 
        orang.setGender(true); 

        System.out.println("Nama: " + orang1.name);
        System.out.println("Umur: " + orang1.age);
        System.out.println("Jenis Kelamin: " + orang1.isMale);

        System.out.println("Nama: " + orang.getName());
        System.out.println("Umur: " + orang.getAge());
        System.out.println("Jenis Kelamin: " + orang.getGender());
    }
}
