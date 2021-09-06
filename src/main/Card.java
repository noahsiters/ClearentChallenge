abstract public class Card {
    
    // attributes (need to be public to use in extended classes)
    public String type;
    public double interest;
    public double balance;

    // constructor - constructors removed when changing this to an abstract class
/*     public Card(String argType, double argInterest, double argBalance){
        type=argType;
        interest=argInterest;
        balance=argBalance;
    }

    public Card(String argType, double argBalance){
        if(argType=="Mastercard"){
            interest=0.05;
        }
        else if(argType=="Visa"){
            interest=0.1;
        }
        else if(argType=="Discover"){
            interest=0.01;
        }

        type=argType;
        balance=argBalance;
    } */

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

    // abstract declaration, implemented in Mastercard, Visa, and Discover classes
    public abstract double getInterestAccrued(int months);
}