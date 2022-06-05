package ru.home.tests;

public class Matches {
    static final int MAX_MATCHES = 20;
    static final int FIRST_MOVE_MATCHES = 3;

    private int currentMatchesRemainder;
    private int moveMatchesQuantity;

    public Matches(int currentMatchesRemainder, int moveMatchesQuantity) {
        this.currentMatchesRemainder = currentMatchesRemainder;
        this.moveMatchesQuantity = moveMatchesQuantity;
    }

    public int getCurrentMatchesRemainder() {
        return currentMatchesRemainder;
    }

    public int getMoveMatchesQuantity() {
        return moveMatchesQuantity;
    }

    public void setMoveMatchesQuantity(int moveMatchesQuantity) {
        this.moveMatchesQuantity = moveMatchesQuantity;
    }

    public void makeAMove(){
        this.currentMatchesRemainder -= this.moveMatchesQuantity;
    }

    public int findMatchesForNextMove(){
        return (4 - this.moveMatchesQuantity);
    }

//    public void computerMove(){
//        this.makeAMove();
//        new Console().computerMovedMessage(this.moveMatchesQuantity);
//    }
//
//    public void userMove(){
//        this.makeAMove();
//    }
}
