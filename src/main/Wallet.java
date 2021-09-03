import java.util.ArrayList;
public class Wallet {

    // ArrayList that stores a list of Card objects
    ArrayList<Card> wallet = new ArrayList<Card>();

    // adds the amount of cards in the wallet
    public int getCardAmount(){
        return wallet.size();
    }

    // puts a card in the wallet
    public void addCard(Card arg){
        wallet.add(arg);
    }

    // calculates the total balance of the wallet
    public double getTotalBalance(){
        Card c = null;
        double totalBalance = 0;
        for(int i=0;i<=wallet.size()-1;i++){
            c = wallet.get(i);
            totalBalance += c.getBalance();
        }

        return totalBalance;
    }

    // calculates the total interest accrued across all cards in the wallet, takes in number of months as argument
    public double getTotalInterestAccrued(int months){
        Card c = null;
        double total = 0;
        for (int i=0;i<=wallet.size()-1;i++){
            double balance = 0;
            double interest = 0;

            c = wallet.get(i);

            balance = c.getBalance();
            interest = c.getInterest();

            total += balance * (months * interest);         
        }

        return total;
    }
}
