package ua.hillel.budzinskyi.lessons.lesson12;
import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        FitnessTracker user1 = new FitnessTracker("Artem", LocalDate.of(2005, 5, 10), "artem@gmail.com", "1234567890");
        FitnessTracker user2 = new FitnessTracker("Andrew", LocalDate.of(1990, 8, 15), "andrew@ukr.net", "0987654321");
        FitnessTracker user3 = new FitnessTracker("Bob", LocalDate.of(1995, 3, 22), "bob@hotmail.com", "9876543210");

        user1.setLastName("Budz");
        user1.setWeight(75);
        user1.setStepsPerDay(10000);

        user2.setLastName("Anon");
        user2.setWeight(68);
        user2.setStepsPerDay(8000);

        user1.printAccountInfo();
        user2.printAccountInfo();
        user3.printAccountInfo();
    }
}