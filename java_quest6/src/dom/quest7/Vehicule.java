package dom.quest7;

public abstract class Vehicule {
    private String brand;
    private int kilometers;

    public Vehicule(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public abstract String doStuff();

    public String getBrand() {
        return brand;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

}
