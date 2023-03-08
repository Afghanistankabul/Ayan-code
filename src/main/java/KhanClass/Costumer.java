package KhanClass;
public class Costumer {
    int id;
    String name;
    String address;
    String phone;
    String Email;

    public Costumer(int id, String name, String address, String phone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        Email = email;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Costumer Ayan = new Costumer(12,"mustafa","12 main street","43-22-3233-23","mustafa.ayan29@yahoo.com");
        System.out.println(Ayan);

    }
}
