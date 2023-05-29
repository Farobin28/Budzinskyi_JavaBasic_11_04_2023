package ua.hillel.budzinskyi.lessons.lesson14;

interface Smartphones {
    void call();
    void sms();
    void internet();
}
interface LinuxOS {
    void runTerminal();
}
interface iOS {
    void faceID();
}
class Androids implements Smartphones, LinuxOS {
    @Override
    public void call() {
        System.out.println("Calling from an Android phone");
    }
    @Override
    public void sms() {
        System.out.println("Sending SMS from an Android phone");
    }
    @Override
    public void internet() {
        System.out.println("Browsing the internet on an Android phone");
    }
    @Override
    public void runTerminal() {
        System.out.println("Running terminal on an Android phone");
    }
}
class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Calling from an iPhone");
    }
    @Override
    public void sms() {
        System.out.println("Sending SMS from an iPhone");
    }
    @Override
    public void internet() {
        System.out.println("Browsing the internet on an iPhone");
    }
    @Override
    public void faceID() {
        System.out.println("Using Face ID on an iPhone");
    }
}