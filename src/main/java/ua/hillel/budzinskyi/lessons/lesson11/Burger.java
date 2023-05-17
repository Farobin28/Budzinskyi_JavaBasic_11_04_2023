package ua.hillel.budzinskyi.lessons.lesson11;

public class Burger {
    private String bun;
    private String meat;
    private String cheese;
    private String greens;
    private String mayo;

    public Burger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Склад звичайного бургера:");
        printBurgerIngredients();
    }

    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = "";
        System.out.println("Склад дієтичного бургера:");
        printBurgerIngredients();
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayo, String extraMeat) {
        this.bun = bun;
        this.meat = meat + " x2";
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
        System.out.println("Склад бургера з подвійним м'ясом:");
        printBurgerIngredients();
    }

    public void printBurgerIngredients() {
        System.out.println("Булочка: " + bun);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + greens);
        System.out.println("Майонез: " + mayo);
        System.out.println();
    }
}