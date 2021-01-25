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
        return this.playerFigure;
    }

    public String getPlayerPCFigure() {
        return this.playerPCFigure;
    }

    public void showField(){
        System.out.println("Figure Player User: " + playerFigure);
        System.out.println("Figure Player PC: " + playerPCFigure);
    }

}
