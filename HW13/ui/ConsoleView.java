package HW13.ui;

import HW13.data.ContactMain;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ConsoleView implements View{

    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in).useDelimiter("\n");
    }

    @Override
    public String getName() {
        System.out.println("Name: ");
        return in.next();
    }

    @Override
    public String setName() {
        System.out.println("Name: ");
        String temp = "";
        temp += in.next();
        return temp;
    }

    @Override
    public Map<String, String> getCommunicationMethods() {
        System.out.println("CommunicationMethod + data: ");
        return null;
    }


    @Override
    public String getAddress() {
        System.out.println("Address: ");
        return in.nextLine();
    }

    @Override
    public String setAddress() {
        System.out.println("Address: ");
        String temp = "";
        temp += in.next();
        return temp;
    }

    @Override
    public String getCompanyName() {
        System.out.println("Company name: ");
        return in.nextLine();
    }

    @Override
    public String setCompanyName() {
        System.out.println("Company name: ");
        return in.next();
    }

    @Override
    public String getOccupation() {
        System.out.println("Occupation: ");
        return in.nextLine();
    }

    @Override
    public String setOccupation() {
        System.out.println("Occupation: ");
        return in.next();
    }

    public void printView(List<ContactMain> lst) {
        for(ContactMain item: lst) {
            System.out.println(item);
        }
    }

    public Integer getIndex() {
        return in.nextInt() - 1;
    }


    @Override
    public String setKey() {
        System.out.println("Enter the method: ");
        return in.next();
    }

    @Override
    public String setValue() {
        System.out.println("Enter the number: ");
        return in.next();
    }
}
