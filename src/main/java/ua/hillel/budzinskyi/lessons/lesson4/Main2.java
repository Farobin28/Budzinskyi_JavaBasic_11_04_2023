package ua.hillel.budzinskyi.lessons.lesson4;

public class Main2 {
    public static void main(String[] args) {
        // Спершу потрібно порахувати загальну кількість воїнів у династії Мінь
        int warriorMin =(int)(860*1.5);
        int archerMin = (int)(860*1.5);
        int riderMin = (int)(860*1.5);
        int attackMin = 9*warriorMin+35*archerMin+12*riderMin;
        int attackLi = 13*860+24*860+46*860;
        System.out.println("Загальна атака династії Лі: " + attackLi);
        System.out.println("Загальна атака династії Мінь: " + attackMin);
    }
}
