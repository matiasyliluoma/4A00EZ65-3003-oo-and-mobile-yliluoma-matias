abstract public class Animal {
    private String name;
    private boolean alive;

    public Animal(String name, boolean alive) {
        setName(name);
        this.alive = alive;
    }

    public void die() {
        this.alive = false;
    }

    public boolean isAlive() {
        return this.alive;
    }

    public boolean eats(Animal a) {
        
        if(this instanceof Human) {
            a.die();
            return true;
        } else if(this instanceof Dog && !(a instanceof Dog)) {
            a.die();
            return true;
        } else {
            return false;
        }

        //throw new IllegalStateException("wrong objects");
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
