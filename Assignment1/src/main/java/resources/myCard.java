/**
 * Created by dominic on 1/19/16.
 * For our deck
 */
package resources;
public class myCard {
    private int rank;
    private char suit;
    public myCard()
    {
        this.rank = 0;
        this.suit = ' ';
    }
    public myCard(int x, char y)
    {
        this.setRank(x);
        this.setSuit(y);
    }
    public void setRank(int x){
        this.rank = x;
    }
    public void setSuit(char x){
        this.suit = x;
    }
    public int getRank(){
        return this.rank;
    }
    public char getSuit(){
        return this.suit;
    }
}
