package HW13.ui;

import HW13.service.PhoneBook;
import java.util.Scanner;

public class App {

    public static void buttonClick() {
        PhoneBook model = new PhoneBook();
        ConsoleView cView = new ConsoleView();
        Presenter pr = new Presenter(model, cView);

        Scanner in = new Scanner(System.in);
        boolean condition = true;

        while(condition) {
            System.out.println("Chose you option and enter the number: ");
            System.out.println("1 - Show all ");
            System.out.println("2 - Search for the contact using it's name ");
            System.out.println("3 - Add new contact ");
            System.out.println("4 - Delete the contact ");
            System.out.println("5 - Add new method of contact ");
            System.out.println("6 - Delete the method of contact");
            System.out.println("7 - Exit ");
            System.out.println("Enter your option: ");

            switch (in.next()) {
                case "1":
                    pr.checkList(model.getLst());
                    break;
                case "2":
                    pr.search();
                    break;
                case "3":
                    System.out.println("Press 1 to add a standard contact and 2 to add a company");
                    switch (in.next()) {
                        case "1":
                            pr.addContact();
                            System.out.println("The contact was successfully added \n");
                            break;
                        case "2":
                            pr.addCompany();
                            System.out.println("The company was successfully added \n");
                            break;
                        default:
                            System.out.println("Something went wrong :( Make sure you choose from existing options \n");
                    }
                    break;
                case "4":
                    pr.deleteContact();
                    break;
                case "5":
                    pr.addCommunicationMethod();
                    break;
                case "6":
                    pr.deleteCommunicationMethod();
                    break;
                case "7":
                    condition = false;
                    break;
                default:
                    System.out.println("Something went wrong :( Make sure you choose from existing options \n");
            }
        }
        in.close();
    }
}
