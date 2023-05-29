package ua.hillel.budzinskyi.lessons.lesson14;

public class Main {
    public static void main(String[] args) {
        Smartphones android = new Androids();
        Smartphones iphone = new iPhones();

        android.call();
        android.sms();
        android.internet();
        ((LinuxOS) android).runTerminal();

        System.out.println();

        iphone.call();
        iphone.sms();
        iphone.internet();
        ((iOS) iphone).faceID();
    }
}