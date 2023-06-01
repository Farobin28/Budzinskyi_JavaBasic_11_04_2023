package ua.hillel.budzinskyi.lessons.lesson15;

public class Main {
    public static void main(String[] args) {
        Drinks drinks = new Drinks();
        drinks.makeDrink(DrinksMachine.COFFEE);
        drinks.makeDrink(DrinksMachine.TEA);
        drinks.makeDrink(DrinksMachine.LEMONADE);

        System.out.println("Total drinks: " + drinks.getTotalDrinksCount());
        System.out.println("Total price: $" + drinks.getTotalPrice());
    }
}
