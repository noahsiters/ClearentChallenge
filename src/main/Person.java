import java.util.ArrayList;
public class Person {
    
    // attributess
    private String name;

    // ArrayList that stores a list of Card objects
    ArrayList<Wallet> wallets = new ArrayList<Wallet>();

    // constructor
    public Person(String argName){
        name=argName;
    }

    // gets name
    public String getName(){
        return name;
    }

    // sets name
    public void setName(String arg){
        name=arg;
    }

    // methods
    // adds wallets to list so person can have multiple wallets
    public void addWallet(Wallet arg){
        wallets.add(arg);
    }
}
