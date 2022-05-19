package day19_thread;

public class Mintendo {
    public static void main(String[] args) {
        SuperMario superMario = new SuperMario();
        GameMusic gameMusic = new GameMusic();
        gameMusic.setDaemon(true);
        superMario.start();
        gameMusic.start();
    }
}
