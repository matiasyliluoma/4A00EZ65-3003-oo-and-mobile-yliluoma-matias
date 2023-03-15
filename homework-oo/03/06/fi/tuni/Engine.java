package fi.tuni;

public class Engine {
    int horsePower;

    public Engine(int horsePower) {
        setHorsePower(horsePower);
    }
    
    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }


    public int getHorsePower() {
        return this.horsePower;
    }

    public boolean equals(Engine horsePower) {
        return horsePower.horsePower == this.horsePower;
    }

    @Override
    public String toString() {
        return ""+this.horsePower;
    }
}
