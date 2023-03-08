package HomeWork;

public class Example {
    public static void main(String[] args) {

       /* Fruit
                - Add the following class properties
        - name (String)
                - color (String)
                - hasSeed (boolean)

        - Add toString method to print object properties


        Mango extends Fruit
                - Add constructor


        Banana extends Fruit
                - Add constructor

        Apple extends Fruit
                - Add constructor



        Write a example class with main method and create one Mango, one Banana,
                one  Apple object and print the object using toString method.

        */
        Fruit myMango = new Mango("mango","yalow",true);
        Fruit myApple = new Apple("apple","green",true);
        Fruit myBanana = new Banana("banana","yalow",false);


        System.out.println(myMango);
        System.out.println(myApple);
        System.out.println(myBanana);

    }

// this is a new change
}
