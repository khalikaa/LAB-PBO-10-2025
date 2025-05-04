class Person {
    String name;
    int age;
    boolean isMale;

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
        if (this.isMale) {
            return "male";
        } else {
            return "female";
        }
    }
}

public class No1 {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Sarham");
        person.setAge(14);
        person.setGender(false);

        Person baru = new Person();

        baru.name = "fatir";
        baru.age = 17;
        baru.isMale = true;

        System.out.println("Nama : " + person.getName());
        System.out.println("Umur : " + person.getAge());
        System.out.println("Gender : " + person.getGender());
        System.out.println("Nama : " + baru.name);
        System.out.println("Umur : " + baru.age);
        System.out.println("Gender : " + baru.isMale);
    }
}