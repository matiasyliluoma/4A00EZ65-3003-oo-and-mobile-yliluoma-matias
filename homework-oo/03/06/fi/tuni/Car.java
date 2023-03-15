package fi.tuni;

public class Car {
    private Engine engine;
    private String brand;

    public Car(String brand, int horsePower) {
        this.brand = brand;
        this.engine = new Engine(horsePower);
        
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setHorsePower(int horsePower) {
        this.engine.getHorsePower();
    }
    
    public String getBrand() {
        return this.brand;
    }

    public Engine getHorsePower() {
        return this.engine;
    }

    public boolean equals(String brand, Engine horsePower) {
        return this.brand == brand && this.engine == horsePower;
        
    }

    @Override
    public String toString() {
        return this.brand + ", " + this.engine.toString();
    }
}
