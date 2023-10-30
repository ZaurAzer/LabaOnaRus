package org.example.task9;

import java.awt.*;

public class Task9 {
    private final Basketball basketBallGame;

    Task9() {
        this.basketBallGame = new Basketball();
    }

    public int getBallsQuantity() {
        return basketBallGame.getQuantity();
    }

    public int countBlueBalls() {
        int counter = 0;

        for (Ball ball : basketBallGame.getBallsList()) {
            if (ball.color == Color.blue) {
                counter++;
            }
        }

        return counter;
    }
}


