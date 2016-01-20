package controllers;

/**
 * Created by erinsullens on 1/19/16.
 */
public class deck {
    myCard[] cards;
    int rank = 1;

    deck(){
        cards = new myCard[52];

        for(int i = 0; i<13; i++){
            cards[i] = new myCard(rank,'c');
            rank ++;
        }
        rank = 1;
        for(int i = 13; i<26; i++){
            cards[i] = new myCard(rank,'s');
            rank ++;
        }
        rank = 1;
        for(int i = 26; i<39; i++){
            cards[i] = new myCard(rank,'h');
            rank ++;
        }
        rank = 1;
        for(int i = 39; i<52; i++){
            cards[i] = new myCard(rank,'d');
            rank ++;
        }

    }
    public void shuffle(){

        for(int i = 0; i <52; i++){

        }
    }

}
