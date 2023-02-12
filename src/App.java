import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);
        ArrayList<Item> foodList = new ArrayList<>();
        int totalPrice = 0;
        String choice = "";
        foodList.add(new Item("Hamburger", 1.85, 9, 33, 1));
        foodList.add(new Item("Salads", 2, 1, 11, 5));
        foodList.add(new Item("French Fries", 1.30, 11, 36, 4));
        foodList.add(new Item("Soda", 0.95, 0, 38, 0));

        for (int i = 0; i < 4; i++) {    
            do {
                System.out.print("Enter number of " + foodList.get(i).getName() + ": ");
                choice = s.nextLine();
            } while (!Item.isNumber(choice));
            System.out.println(foodList.get(i).toString());
            totalPrice += (foodList.get(i).getPrice() * Integer.parseInt(choice));
        }

        System.out.println("Your bill comes to " + totalPrice);
        s.close();
    }
}
