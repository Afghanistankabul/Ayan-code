package Inhertance;

public class Vehicle {
    String model;
    int year;
   String color;


    public Vehicle(String model, int year, String color) {
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
