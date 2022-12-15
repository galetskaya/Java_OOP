package HW7;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        Coffee latte = new Coffee("Latte", "with Milk", 350, 70);
        Coffee espresso = new Coffee("Espresso", "no milk", 40, 65);
        Coffee mochaccino = new Coffee("Mochaccino", "with Cream", 200, 70);
        Tea ulun = new Tea("Oloon", "green", "strong", 350, 80);
        Tea black = new Tea("English Breakfast", "black", "strong", 350, 80);
        HotChocolate choco = new HotChocolate("Nesquick", "with milk", 300, 65);

        Map<Integer, HotDrink> products = new HashMap<>();
        products.put(1, latte);
        products.put(2, espresso);
        products.put(3, mochaccino);
        products.put(4, ulun);
        products.put(5, black);
        products.put(6, choco);

        CoffeeMachine cm = new CoffeeMachine(products);
        cm.modeOnOff(false);
        int temp = cm.userChoice(products);
        cm.options(temp, products);
    }
}

