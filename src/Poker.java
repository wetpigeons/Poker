import java.util.ArrayList;
import java.util.Scanner;

public class Poker {
    public static String[] ranks = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
    public static String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
    public static int[] pointValues = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    public static Deck d = new Deck(ranks,suits,pointValues);
    public static ArrayList<Card> hand = new ArrayList<Card>();

    public static void main(String[] args){

    }
    public static void dealHand(){
        hand.add(d.deal());
        hand.add(d.deal());
    }
}
