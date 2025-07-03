package Random;


interface Engine {
    void start();
}

interface MusicSystem {
    void playmusic();
}

class Car implements Engine, MusicSystem {
    public void start() {
        System.out.println("Engine started");
    }

    public void playmusic() {
        System.out.println("Playing music");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.playmusic();
    }
}
