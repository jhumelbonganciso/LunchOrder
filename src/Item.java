import java.util.ArrayList;


public class Item {
    private String name;
    private double price;
    private double fat, carbs, fiber;
  

    

    Item(){}

    Item(String name, double price, int fat, int carbs, int fiber){
        this.name = name;
        this.price = price;
        this.fat = fat;
        this.carbs = carbs;
        this.fiber = fiber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setCarbs(double carbs) {
        this.carbs= carbs;
    }

    public void setFiber(double fiber) {
        this.fiber = fiber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public double getFiber() {
        return fiber;
    }

    public String toString(){
        return "Each " + getName() + " has " +  getFat() + " of fat, " + getCarbs() + " of carbs and " + getFiber() + " of fiber.";
    }

    public static boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    }

}
