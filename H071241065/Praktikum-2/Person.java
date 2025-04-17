public class Person {
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

    public Integer getAge() {
        return age;
    }

    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    public String getGender() {
        String gender;
        if (isMale) {
            gender = "laki laki";
        } else {
            gender = "Perempuan";
        }
        return gender;
    }

    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        person2.name = "adit";
        person2.age = 18;
        person2.isMale = false;

        person.setName("Agus");
        person.setAge(18);
        person.setGender(true);

        System.out.printf(String.format("Nama dia adalah %s, umur %d adalah dan beliau berkelamin %s", person2.name,
                person2.age, person2.getGender()));
        System.out
                .printf(String.format("\nNama dia adalah %s, umur %d adalah dan beliau berkelamin %s", person.getName(),
                        person.getAge(), person.getGender()));

    }
}
