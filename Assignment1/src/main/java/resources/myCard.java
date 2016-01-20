/**
 * Created by dominic on 1/19/16.
 * For our deck
 */
package resources;
public class myCard {
    private char rank;
    private char suit;
    public myCard()
    {
        this.rank = ' ';
        this.suit = ' ';
    }
    public myCard(char x, char y)
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
