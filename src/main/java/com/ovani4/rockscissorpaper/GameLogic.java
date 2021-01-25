package main.java.com.ovani4.rockscissorpaper;
import java.util.ArrayList;
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

        field.setPlayerOneFigure(playerFigure);
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
        String result;
        ArrayList<String> figureList = new ArrayList<>();
        figureList.add("ROCK");
        figureList.add("SCISSOR");
        figureList.add("PAPER");

        int index1 = figureList.indexOf(field.getPlayerFigure());
        int index2 = figureList.indexOf(field.getPlayerPCFigure());

        if (index1 == index2){
            result = "it`s drawn";
        }
        if ((index1 - index2) == 1 || (index1 - index2) == -2){
            result = "PC";
        } else result = "User";

        return result;
    }
}

