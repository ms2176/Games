package Games;

import java.util.Scanner;

public abstract class GameSuperclass {
    protected String gameName;

    public GameSuperclass(String gameName) {
        this.gameName = gameName;
    }

    public abstract void printGameIntro();

    public abstract boolean processInput(Scanner scanner);
}