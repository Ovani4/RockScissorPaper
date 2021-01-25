package main.java.com.ovani4.rockscissorpaper;

public class Field {
    private String playerOneFigure;
    private String playerTwoFigure;

    public void setPlayerOneFigure(String value){
        this.playerOneFigure = value;
    }
    public void setPlayerTwoFigure(String value) {
        this.playerTwoFigure = value;
    }
    public void showField(){
        System.out.println("Figure Player one: " + playerOneFigure);
        System.out.println("Figure Player two: " + playerTwoFigure);
    }

}
