abstract public class Animal {
    private String name;
    private boolean alive;
    private int healthAmount;

    public Animal(String name, boolean alive, int healthAmount) {
        setName(name);
        this.alive = alive;
        setHealth(healthAmount);
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
            this.healthAmount++;
            return true;
        } else if(this instanceof Dog && !(a instanceof Dog)) {
            a.die();
            this.healthAmount++;
            return true;
        } else {
            return false;
        }

        //throw new IllegalStateException("wrong objects");
    }

    public void setHealth(int healthAmount) {
        this.healthAmount = healthAmount;
    }

    public int getHealth() {
        return this.healthAmount;
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
