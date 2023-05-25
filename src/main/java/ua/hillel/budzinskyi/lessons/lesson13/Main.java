package ua.hillel.budzinskyi.lessons.lesson13;

public class Main {
    public static void main(String[] args) {

        MusicStyles popBand = new PopMusic();
        MusicStyles rockBand = new RockMusic();
        MusicStyles classicOrchestra = new ClassicMusic();

        MusicStyles[] bands = {popBand, rockBand, classicOrchestra};

        for (MusicStyles band : bands) {
            band.playMusic();
        }
    }
}