package HW7;

import java.util.Map;
import java.util.Scanner;

public class CoffeeMachine {
    private Map<Integer, HotDrink> products;
    private boolean mode;

    public CoffeeMachine (Map<Integer, HotDrink> products) {
        this.products = products;
    }

    public void modeOnOff (boolean mode) {
        mode = true;
        if (mode) {
            System.out.println("Machine is running...");
        } else {
            System.out.println("Machine is OFF");
        }
    }

    public static Integer userChoice(Map<Integer, HotDrink> products) {
        Scanner iScan = new Scanner(System.in);
        System.out.println(products);
        System.out.println("Chose your options, please, by press the number: ");
        int number = iScan.nextInt();
        iScan.close();
        return number;
    }

    public static void options(int number, Map<Integer, HotDrink> products) {
        switch (number) {
            case 1:
                System.out.printf("Here is your order: %s", products.get(1));
                break;
            case 2:
                System.out.printf("Here is your order: %s", products.get(2));
                break;
            case 3:
                System.out.printf("Here is your order: %s", products.get(3));
                break;
            case 4:
                System.out.printf("Here is your order: %s", products.get(4));
                break;
            case 5:
                System.out.printf("Here is your order: %s", products.get(5));
                break;
            case 6:
                System.out.printf("Here is your order: ", products.get(6));
                break;
            default:
                break;
        }

    }

}
