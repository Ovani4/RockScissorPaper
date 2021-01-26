package main.java.com.ovani4.rockscissorpaper;

public class Field {
    private GameFigure playerFigure;
    private GameFigure playerPCFigure;

    public void setPlayerOneFigure(GameFigure value){
        this.playerFigure = value;
    }
    public void setPlayerPCFigure(GameFigure value) {
        this.playerPCFigure = value;
    }

    public GameFigure getPlayerFigure() {
        return this.playerFigure;
    }

    public GameFigure getPlayerPCFigure() {
        return this.playerPCFigure;
    }

    public void showField(){
        System.out.println("Figure Player User: " + playerFigure);
        System.out.println("Figure Player PC: " + playerPCFigure);
    }

}
