import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // a scanner object created

        Staffs[] listOfStaffs = new Staffs[3]; // empty array created with 3 els
        listOfStaffs[0] = new Staffs("Franco",438979782,"Tokyo");
        listOfStaffs[1] = new Staffs("Jesus", 438979782, "Brazil");
        listOfStaffs[2] = new Staffs("Kiko", 438979782, "New York");

        while (true) {
            // while loop is used to run through the four options
            System.out.println("1. Add");
            System.out.println("2. Remove");
            System.out.println("3. Show");
            System.out.println("4. Edit");
            // a varibale named userInput created and parseInt() applied to convert userInput from string to number
            int userInput = Integer.parseInt(scanner.nextLine());
            switch (userInput) {
                case 1:
                    listOfStaffs = Controller.creatStaff(listOfStaffs);
                    break;
                case 2:
                    listOfStaffs = Controller.remove(listOfStaffs);
                    break;
                case 3:
                    Controller.show(listOfStaffs);
                    break;
                case 4:
                    listOfStaffs = Controller.editOrUpdate(listOfStaffs);
                    break;

            }
        }

    }
    }