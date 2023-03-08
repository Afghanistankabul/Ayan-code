package Inhertance;

public class Sedan extends Vehicle{

    int box;

    public Sedan(String model, int year, String color, int box) {
        super(model, year, color);
        this.box = box;
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "box=" + box +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
