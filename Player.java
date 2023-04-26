import java.util.*;
public class Player {
    //Pet deck (player's lineup) and pet shop will behave as separate linked lists
    //Other variables are self-explanatory
    private LinkedList<Pet> petDeck;
    private LinkedList<Pet> petShop;
    private int numTurn;
    private int goldCurrency;
    private int numFood;
    private int numPlayer;
    
    Player(LinkedList<Pet> petDeck, int numPlayer) {
        this.numTurn = 1;
        this.goldCurrency = 10;
        this.numFood = 0;
        this.petDeck = petDeck;
        this.numPlayer = numPlayer;
        this.petShop = new LinkedList<Pet>();
        //Haven't implemented the individual pet classes just yet
        //thinking about setting this as the default shop and leaving the variation to occur later in the game
        petShop.add(new Ant());
        petShop.add(new Beaver());
        petShop.add(new Cricket());
        petShop.add(new Duck());
        petShop.add(new Horse());
    }
    //Will be contained within each game method (computer or human)
    public void playerTurn(Scanner input) {
        System.out.printf("Player %d's turn %d will now commence!%n", numPlayer, numTurn);
    }
    //Game progression method (gold addition, shop reset, etc.)
    public void progress() {
        this.goldCurrency = 10;
        this.petShop = new LinkedList<Pet>();
        numTurn++;
    }
}