package models;

public class acesUp {
    private int winCount;
    private int score;
    myStack[] cardStack; //cardStack will be the four spots that cards are dealt to, not yet made

    acesUp() {
        winCount = 0;
        score = 0;
        cardStack = new myStack[3];
    }

    //Function to be called if no cards are left in the deck
    public void winCheck() {
        int aceCount = 0;
        for (int i = 0; i < 4; i++) {
            if (cardStack[i].getCardRank() == 'A' && cardStack[i].getSize() == 1) {
                aceCount++;
            }
        }
        if (aceCount == 4) {
            System.out.ln("You win!");
            winCount++;
        }
    }
}