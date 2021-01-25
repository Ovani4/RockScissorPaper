package main.java.com.ovani4.rockscissorpaper;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.Scanner;

public class GameLogic {
    private Field field = new Field();
    private Scanner scan = new Scanner(System.in);

    public void start(){
        System.out.println("Enter figure value");
        String playerFigure = getUserInput();
        while (!validateUserInput(playerFigure)){
            System.out.println("Enter correct figure value: ROCK, SCISSOR, PAPER");
            playerFigure = getUserInput();
        }
        field.setPlayerOneFigure(getUserInput());
        field.setPlayerPCFigure(getPcFigure());
        field.showField();
        System.out.println("Winner is: " + identifyWinner());
    }


    private String getUserInput(){
        String input = scan.nextLine();
        return input;
    }

    private String getPcFigure(){
        String pcFigure = null;
        int figureIndex = (int) (10 * Math.random());

        if (figureIndex <= 3){
            pcFigure = "ROCK";
        }
        if (figureIndex > 3 && figureIndex <=6){
            pcFigure = "SCISSOR";
        }
        if (figureIndex > 6){
            pcFigure = "PAPER";
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


    private String identifyWinner(){
        String figureValuePC = this.getPcFigure();
        String figureValueUser = this.getUserInput();
        return figureValuePC;
    }
}

