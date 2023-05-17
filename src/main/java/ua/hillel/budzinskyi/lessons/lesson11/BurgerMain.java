package ua.hillel.budzinskyi.lessons.lesson11;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger1 = new Burger("Булочка з кунжутом", "Яловичина", "Сир чеддер", "Салат", "Майонез");
        System.out.println();

        Burger burger2 = new Burger("Інтегральна булочка", "Курятина", "Сир моцарелла", "Помідори");
        System.out.println();

        Burger burger3 = new Burger("Булочка з насінням", "Яловичина", "Сир гауда", "Салат", "Майонез", "Яловичина");
        System.out.println();
    }
}