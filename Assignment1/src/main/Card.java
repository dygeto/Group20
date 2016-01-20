/**
 * Created by dominic on 1/19/16.
 * For our deck
 */
public class Card {
    private char rank;
    private char suit;
    Card(char x, char y)
    {
        this.setRank(x);
        this.setSuit(y);
    }
    public void setRank(char x){
        this.rank = x;
    }
    public void setSuit(char x){
        this.suit = x;
    }
    public char getRank(){
        return this.rank;
    }
    public char getSuit(){
        return this.suit;
    }
}
