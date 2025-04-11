public class Person {
    private String name;
    private int age;
    private boolean isMale;

    // Setter untuk name
    public void setName(String name) {
        this.name = name;
    }
 
    // Getter untuk name
    public String getName() {
        return name;
    }

    // Setter untuk age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter untuk age
    public int getAge() {
        return age;
    }

    // Setter untuk gender
    public void setGender(boolean isMale) {
        this.isMale = isMale;
    }

    // Getter untuk gender dalam bentuk String
    public String getGender() {
        return isMale ? "Male" : "Female";
    }


    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Natasya");
        person.setAge(25);
        person.setGender(false);

        Person person1 = new Person();
        person1.name = "Nata";
        person1.age = 21;
        person1.isMale = false;

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());

        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Gender: " + person1.getGender());
    }
}