public class ClearentChallenge {
    public static void main(String[] args) {

        Person p1 = new Person("Person 1");
        Card c1 = new Card("Mastercard", 0.05, 100);
        Card c2 = new Card("Visa", 0.1, 100);
        Wallet w = new Wallet(); // adds cards to wallet
        w.addCard(c1);
        w.addCard(c2);

        double totalBal = w.getTotalBalance();
        double totalInterest = w.getTotalInterestAccrued(2);

        System.out.println(totalBal);
        System.out.println(totalInterest);
    }
}