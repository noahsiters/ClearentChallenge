public class Card {
    
    // attributes
    private String type;
    private double interest;
    private double balance;

    // constructor
    public Card(String argType, double argInterest, double argBalance){
        type=argType;
        interest=argInterest;
        balance=argBalance;
    }

    // gets
    public String getType(){
        return type;
    }

    public double getInterest(){
        return interest;
    }

    public double getBalance(){
        return balance;
    }

    // sets
    public void setType(String arg){
        type=arg;
    }

    public void setInterest(double arg){
        interest=arg;
    }

    public void setBalance(double arg){
        balance=arg;
    }
}