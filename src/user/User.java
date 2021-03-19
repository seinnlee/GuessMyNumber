package user;

import game.Guess;

public class User {

    String name;
//    private int bestScore = 0;
    int level; // difficulty chosen by user; 1 = easy; 2 = medium; 3 = hard;
    Guess game;

    public User(String input) {
        name = input;
    }

    public void userLevel(int input) {
        level = input;
        game = new Guess(level);
        game.play(this);
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public String getLevelString() {
        String rt ="";
        if (level == 1) {
            rt = "Easy Mode";
        } else if (level == 2) {
            rt = "Medium Mode";
        } else if (level == 3) {
            rt = "Hard Mode";
        } else {
            rt = "You have selected a level that does not exist.";
        }
        return rt;
    }

}
