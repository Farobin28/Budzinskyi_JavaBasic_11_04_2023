package ua.hillel.budzinskyi.lessons.lesson15;

public class Drinks {
    public static final double COFFEE_PRICE = 2.5;
    public static final double TEA_PRICE = 1.8;
    public static final double LEMONADE_PRICE = 2.2;
    public static final double MOJITO_PRICE = 3.0;
    public static final double MINERAL_WATER_PRICE = 1.5;
    public static final double COCA_COLA_PRICE = 2.0;

    private int totalDrinksCount;
    private double totalPrice;

    public Drinks() {
        totalDrinksCount = 0;
        totalPrice = 0.0;
    }

    public void makeDrink(DrinksMachine drinksMachine) {
        switch (drinksMachine) {
            case COFFEE:
                System.out.println("Making coffee...");
                totalDrinksCount++;
                totalPrice += COFFEE_PRICE;
                break;
            case TEA:
                System.out.println("Making tea...");
                totalDrinksCount++;
                totalPrice += TEA_PRICE;
                break;
            case LEMONADE:
                System.out.println("Making lemonade...");
                totalDrinksCount++;
                totalPrice += LEMONADE_PRICE;
                break;
            case MOJITO:
                System.out.println("Making mojito...");
                totalDrinksCount++;
                totalPrice += MOJITO_PRICE;
                break;
            case MINERAL_WATER:
                System.out.println("Dispensing mineral water...");
                totalDrinksCount++;
                totalPrice += MINERAL_WATER_PRICE;
                break;
            case COCA_COLA:
                System.out.println("Dispensing Coca Cola...");
                totalDrinksCount++;
                totalPrice += COCA_COLA_PRICE;
                break;
            default:
                System.out.println("Invalid drink choice.");
                break;
        }
    }

    public int getTotalDrinksCount() {
        return totalDrinksCount;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}