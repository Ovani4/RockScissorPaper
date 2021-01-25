package main.java.com.ovani4.rockscissorpaper;

public class Field {
    private String playerFigure;
    private String playerPCFigure;

    public void setPlayerOneFigure(String value){
        this.playerFigure = value;
    }
    public void setPlayerPCFigure(String value) {
        this.playerPCFigure = value;
    }

    public String getPlayerFigure() {
        return playerFigure;
    }

    public String getPlayerPCFigure() {
        return playerPCFigure;
    }

    public void showField(){
        System.out.println("Figure Player one: " + playerFigure);
        System.out.println("Figure Player two: " + playerPCFigure);
    }

}
