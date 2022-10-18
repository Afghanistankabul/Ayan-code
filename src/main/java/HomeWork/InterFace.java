package HomeWork;

public class InterFace implements Example2{

    String ayan;

    public InterFace(String ayan) {
        this.ayan = ayan;
    }

    @Override
    public String toString() {
        return "InterFace{" +
                "ayan='" + ayan + '\'' +
                '}';
    }

    public void move (){
        System.out.println("walking is good ");

    }
    public String dance(){
        return "i am dancing ";


    }

    public static void main(String[] args) {
        InterFace mustafa = new InterFace("is a last name");
        mustafa.move();

        InterFace myDancing = new InterFace("my last name");
        System.out.println(myDancing.dance());
        System.out.println(mustafa);
        System.out.println(myDancing);


    }
}
