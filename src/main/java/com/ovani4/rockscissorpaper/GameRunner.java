package main.java.com.ovani4.rockscissorpaper;

public class GameRunner {
    public static void main(String[] args) {
        Players player = new Players("Bot");
        int x = player.generateFigure();
        System.out.println(x);
    }
}
