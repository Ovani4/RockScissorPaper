package main.java.com.ovani4.rockscissorpaper;
import java.util.Scanner;

public class GameLogic {
    private Field field = new Field();
    private Scanner scan = new Scanner(System.in);


    public void start(){

        System.out.println("Enter figure value");
        String inputPlayerFigure = getUserInput();
        while (!validateUserInput(inputPlayerFigure)){
            System.out.println("Enter correct figure value: ROCK, SCISSOR, PAPER");
            inputPlayerFigure = getUserInput();
        }

        field.setPlayerOneFigure(GameFigure.valueOf(inputPlayerFigure));
        field.setPlayerPCFigure(getPcFigure());
        field.showField();
        System.out.println("Winner is: " + identifyWinner(field.getPlayerFigure() ,
                field.getPlayerPCFigure()));
    }


    private String getUserInput(){
        String input = scan.nextLine();
        return input;
    }

    private GameFigure getPcFigure(){
        GameFigure pcFigure = null;
        int figureIndex = (int) (10 * Math.random());

        if (figureIndex <= 3){
            pcFigure = GameFigure.ROCK;
        }
        if (figureIndex > 3 && figureIndex <=6){
            pcFigure = GameFigure.SCISSOR;
        }
        if (figureIndex > 6){
            pcFigure = GameFigure.PAPER;
        }
        return pcFigure;
    }


    private boolean validateUserInput(String input){
        boolean checkValue = true;
            try {
                GameFigure.valueOf(input);
            } catch (Exception e){
                checkValue = false;
            }
        return checkValue;
    }


    private String identifyWinner(GameFigure figureUser, GameFigure figurePC){
        String result;

        if ((figureUser == GameFigure.ROCK && figurePC == GameFigure.SCISSOR) ||
                (figureUser == GameFigure.PAPER && figurePC == GameFigure.ROCK) ||
                (figureUser == GameFigure.SCISSOR && figurePC == GameFigure.PAPER)){
            result = "User";
        }
        else if (figurePC == figureUser){
            result = "draw";
        }
        else {
            result = "PC";
        }
        return result;
    }
}

