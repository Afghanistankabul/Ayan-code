package PavanClassArray;

public class SingleDimArray {
    public static void main(String[] args) {

       // int a [] =new int [5]; // declared array with size 5, start of index is 0, last index is 4

        // storing / inserting values into array
       /* a [0]=100;
        a [1]=200;
        a [2]=300;
        a [4]=400;
        System.out.println(a[2]);
        System.out.println(a.length);*/

        // storing / inserting values into array
       /* int b [] = {324,43,5,55,76,8678,};  // declared an array without specifying size
        System.out.println(b[0]); // print the numbers of index
        System.out.println(b.length);*/  // print length or size of an array

        /*int m [] = {34,6565,43,32,4,67};
        for (int n = 0; n<=m.length -1; n++){
            System.out.println(m[n]);  // print the contains of an array

        }*/

        // read values using enhanced for loop
        // first example

        int kabul [] = {43,65,768,9,7,56,34};
        for (int afghanistan : kabul)
            System.out.println(afghanistan);
        // second example

        String mustafa []={"my love","my jan","i love you"};
        for (String ayan : mustafa)
            System.out.println(ayan);



    }
}
