abstract public class Animal {
    private String name;

    public Animal(String name) {
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
