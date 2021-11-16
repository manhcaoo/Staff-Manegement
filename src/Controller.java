
import java.util.Scanner;

public class Controller {
    //a scanner object created with a static keyword. This is intentionally created as a global variable
    static Scanner scanner = new Scanner(System.in);



    public static Staffs[] remove(Staffs[] listOfStaffs) {
        int index = findIndexById(listOfStaffs);
        if (index >= 0) {
            Staffs[] removedStaff = new Staffs[listOfStaffs.length - 1];
            for (int i = 0; i < listOfStaffs.length -1; i++) {
                if (i < index) {
                    removedStaff[i] = listOfStaffs[i];
                } else {
                    removedStaff[i] = listOfStaffs[i + 1];
                }

            }
            return removedStaff;
        }
        return listOfStaffs;

    }


    //show method with a static keyword, meaning can be access without having any obj created
    public static void show(Staffs[] staffs) {
        // for-each loop used to
        for (Staffs nv : staffs) {
            System.out.println(nv.toString());
        }
    }
    public static Staffs[] creatStaff(Staffs[] staffs) {
        Staffs listOfStaffs = creat();
        Staffs[] newStaff = new Staffs[staffs.length + 1];
        for (int i = 0; i < staffs.length; i++) {
            newStaff[i] = staffs[i];
        }
        //after the loop we will have the new nhanvien at the last index position
        // assign the new nhan to nhanVien
        newStaff[newStaff.length - 1] = listOfStaffs;
        return newStaff;
    }

    public static Staffs creat() {
        System.out.println("nhập id");
        int id = scanner.nextInt();
        System.out.println("nhập name");
        String name = scanner.nextLine();
        System.out.println("nhập phone number");
        int phoneNb = scanner.nextInt();
        System.out.println("nhập address");
        String address = scanner.nextLine();

        Staffs staffs = new Staffs( name, phoneNb,address);
        return staffs;
    }


    public static Staffs[] editOrUpdate(Staffs[] listOfStaffs){
        int index = findIndexById(listOfStaffs);
        if (index >=0){
            Staffs newStaff = creat();
            listOfStaffs[index].setId(newStaff.getId());
            listOfStaffs[index].setName(newStaff.getName());
            listOfStaffs[index].setPhoneNb(newStaff.getPhoneNb());
            listOfStaffs[index].setAddress(newStaff.getAddress());


        }
        return listOfStaffs;
    }



    public static int findIndexById (Staffs[] listOfStaffs){
        System.out.println("Insert a number here: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < listOfStaffs.length;i++){
            if (id == listOfStaffs[i].getId()){
                return i;
            }

        }
        return -1;

    }

    }