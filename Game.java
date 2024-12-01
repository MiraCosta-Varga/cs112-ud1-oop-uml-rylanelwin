public abstract class Game {

    //INSTANCE VARIABLES

    private String name; //Name of the game

    private double bet; //Amount of money being bet

    private double odds; //How much your money is multiplied if you win

    //CONSTRUCTORS

    public Game() {
        setAll("Game", 100, 2);
    }
    
    public Game(String name, double bet, double odds) {
        setAll(name, bet, odds);
    }
    
    public Game(Game other) throws IllegalArgumentException {
        if (other == null){
            throw new IllegalArgumentException("Null object in Game copy constructor");
        } else {
            setAll(other.getName(), other.getBet(), other.getOdds());
        }
    }
    
    //GETTERS

    public String getName() {
        return this.name;
    }
    
    public double getBet() {
        return this.bet;
    }

    public double getOdds() {
        return this.odds;
    }

    //SETTERS (make errors)

    public void setName(String name) {
        this.name = name;
    }

    public void setBet(double bet) {
        this.bet = bet;
    }

    public void setOdds(double odds) {
        this.odds = odds;
    }

    public void setAll(String name, double bet, double odds) {
        setName(name);
        setBet(bet);
        setOdds(odds);
    }

    //TOSTRING

    public String toString() {
        return "Name: " + name + " || Bet: " + bet + " || Odds: " + odds + "";
    }

    //EQUALS

    public boolean equals(Game other) {
        if (other == null || (!(other instanceof Game))) {
            return false;
        }

        Game o = (Game) other;
        return (this.name.equals(o.name)) && (this.bet == o.getBet()) && (this.odds == o.getOdds());
    }

    //PLAY

    public abstract double play();
}