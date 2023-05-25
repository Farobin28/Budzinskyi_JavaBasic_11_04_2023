package ua.hillel.budzinskyi.lessons.lesson13;

class MusicStyles {
    public void playMusic() {
        System.out.println("Playing music from MusicStyles");
    }
}
class PopMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing pop music");
    }
}
class RockMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing rock music");
    }
}
class ClassicMusic extends MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing classical music");
    }
}
