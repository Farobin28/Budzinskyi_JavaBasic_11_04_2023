package ua.hillel.budzinskyi.lessons.lesson12;

import java.time.LocalDate;

class FitnessTracker {
    private String firstName;
    private String lastName;
    private int weight;
    private String email;
    private String phone;
    private int stepsPerDay;
    private LocalDate dateOfBirth;
    private int age;

    public FitnessTracker(String firstName, LocalDate dateOfBirth, String email, String phone) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.age = calculateAge(dateOfBirth);
    }
    public String getFirstName() {
        return firstName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }
    public int getAge() {
        return age;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
    public void printAccountInfo() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Weight: " + weight);
        System.out.println("Steps per Day: " + stepsPerDay);
        System.out.println("-----------------------------");
    }
    private int calculateAge(LocalDate dateOfBirth) {
        int currentYear = LocalDate.now().getYear();
        return currentYear - dateOfBirth.getYear();
    }
}