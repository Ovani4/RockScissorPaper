package main.java.com.ovani4.rockscissorpaper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GameRunner {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Players> playerList = new ArrayList<> ();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введи имя игрока");
            Players player = new Players(br.readLine());
            player.generateFigure();
            playerList.add(player);
        }
        GameLogic gameLogic = new GameLogic(playerList);
        for (Players player :
                playerList) {
            System.out.println("Игрок " + player.getName() +
                    " показал фигуру: " + player.getFigure() +
                    " Index " + player.getFigureIndex());
        }
        System.out.println(gameLogic);
    }
}
