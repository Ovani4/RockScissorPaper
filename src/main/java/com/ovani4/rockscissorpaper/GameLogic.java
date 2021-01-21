package main.java.com.ovani4.rockscissorpaper;

import java.util.ArrayList;

public class GameLogic {
    public GameLogic(ArrayList<Players> list) {
        for (int i = 0; i < list.size(); i++) {
            int playerFigure = list.get(i).getFigureIndex();
            for (int j = 1; j <list.size() ; j++) {
                int playerFigure2 = list.get(j).getFigureIndex();
                if (playerFigure <=3 && (playerFigure2 <=6 && playerFigure2 > 3))
                {
                    list.get(i).setStatus(true);
                }
                if ((playerFigure > 3 && playerFigure <=6) && playerFigure2 > 6)
                {
                    list.get(i).setStatus(true);
                }
                if (playerFigure > 6 && playerFigure2 <=3)
                {
                    list.get(i).setStatus(true);
                }
            }
        }
        System.out.println("Победитель игры " );
    }
}

