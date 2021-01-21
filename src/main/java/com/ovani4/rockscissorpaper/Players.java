package main.java.com.ovani4.rockscissorpaper;

public class Players {
    private String name;
    private int figure;

    public Players(String name) {
        this.name = name;
    }
    int generateFigure(){
        figure = (int) (10 * Math.random());
        return figure;
    }
}
