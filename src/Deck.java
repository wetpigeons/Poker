import java.util.*;
public class Deck{
    public int[] suits = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,4,4,4,};
    public int[] ranks = {1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,};
//    public int[][] deck = {{1,2,3,4,5,6,7,8,9,10,11,12,13},{1,2,3,4,5,6,7,8,9,10,11,12,13},{1,2,3,4,5,6,7,8,9,10,11,12,13},{1,2,3,4,5,6,7,8,9,10,11,12,13}};
    public ArrayList<int[]> deck = new ArrayList<>(Arrays.asList(suits,ranks));

    public static String printCard(int suit, int rank){
        String s = "";
        String r = "";
        switch(suit) {
            case 1:
                s = "Spades";
            case 2:
                s = "Hearts";
            case 3:
                s = "Clubs";
            case 4:
                s = "Diamonds";
        }
        switch(rank){
            case 1:
                r = "Ace";
            case 2:
                r = "Two";
            case 3:
                r = "Three";
            case 4:
                r = "Four";
            case 5:
                r = "Five";
            case 6:
                r = "Six";
            case 7:
                r = "Seven";
            case 8:
                r = "Eight";
            case 9:
                r = "Nine";
            case 10:
                r = "Ten";
            case 11:
                r = "Jack";
            case 12:
                r = "Queen";
            case 13:
                r = "King";
        }
        return r + " of" + s;
    }

    public dealHand(){

    }
}