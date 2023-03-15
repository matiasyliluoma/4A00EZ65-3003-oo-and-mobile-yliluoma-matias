abstract public class Mammal {
    private String name;

    public Mammal() {
        setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    public void giveBirthToLiving() {
        System.out.println("giving birth to a living child");
    }
}
