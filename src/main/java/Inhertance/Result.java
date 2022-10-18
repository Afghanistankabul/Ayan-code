package Inhertance;

public class Result {
    public static void main(String[] args) {
        Vehicle mySedan = new Sedan("toyota",2020,"blue",435);
        Vehicle myTrack = new Track("ford",2022,"black");
        System.out.println(myTrack);
        System.out.println(mySedan);
    }
}
