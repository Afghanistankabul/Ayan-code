package HomeWork;

public class Banana extends Fruit{

    public Banana(String name, String color, boolean hasSeed) {
        super(name, color, hasSeed);

    }

    public static void main(String[] args) {
        Fruit shop = new Banana("apple","red",true);

        System.out.println(shop);
    }
}
