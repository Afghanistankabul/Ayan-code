package HomeWork;

public class Fruit {

   private String name;
   private String color;
    private boolean hasSeed;

    public Fruit(String name, String color, boolean hasSeed) {
        this.name = name;
        this.color = color;
        this.hasSeed = hasSeed;
    }


    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", hasSeed=" + hasSeed +
                '}';
    }
}
