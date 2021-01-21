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

    String generateFigure(){
        figureIndex = (int) (10 * Math.random());

        if (figureIndex <= 3){
            figure = "Rock";
            System.out.println(figureIndex);
        }
        if (figureIndex > 3 && figureIndex <=6){
            figure = "Scissor";
            System.out.println(figureIndex);
        }
        if (figureIndex > 6){
            figure = "Paper";
            System.out.println(figureIndex);
        }
        return figure;
    }
}
