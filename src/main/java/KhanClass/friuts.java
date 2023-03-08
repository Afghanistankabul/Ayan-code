package KhanClass;

public class friuts {
    String name;
    String test;
    String color;

    public friuts(String name, String test, String color) {
        this.name = name;
        this.test = test;
        this.color = color;
    }

    @Override
    public String toString() {
        return "friuts{" +
                "name='" + name + '\'' +
                ", test='" + test + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
