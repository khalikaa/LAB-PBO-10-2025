package plane;

abstract class Plane {
    protected String name;

    Plane (String name) {
        this.name = name;
    }
    
    abstract String getPlaneName();

    public void display(){
        System.out.println ("This plane is" + name);
    }
}
