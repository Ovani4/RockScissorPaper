package main.java.com.ovani4.rockscissorpaper;

public class Players {
    private String name;
    private int figureIndex;
    private String figure;
    private boolean winner = false;

    public String getFigure() {
        return figure;
    }

    public int getFigureIndex() {
        return figureIndex;
    }

    public String getName() {
        return name;
    }

    public boolean getStatus() {
        return winner;
    }

    public void setStatus(boolean status) {
        this.winner = status;
    }

    public Players(String name) {
        this.name = name;
    }
}


