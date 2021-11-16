import java.util.Scanner;
public class Staffs{
    private int id;
    private String name;
    private int phoneNb;
    private String address;

    private static int idNumber = 1;
    public Staffs(String name, int phoneNb, String address) {
        this.id = idNumber++;
        this.name = name;
        this.phoneNb = phoneNb;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNb() {
        return phoneNb;
    }

    public void setPhoneNb(int phoneNb) {
        this.phoneNb = phoneNb;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Staffs.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Staffs{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNb=" + phoneNb +
                ", address='" + address + '\'' +
                '}';
    }
}