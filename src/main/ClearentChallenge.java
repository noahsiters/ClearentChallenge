public class ClearentChallenge {
    public static void main(String[] args) {

/*         Person p1 = new Person("Person 1");
        Card c1 = new Card("Mastercard", 0.05, 100);
        Card c2 = new Card("Visa", 0.1, 100);
        Wallet w = new Wallet(); // adds cards to wallet
        w.addCard(c1);
        w.addCard(c2);
        p1.addWallet(w);

        double totalBal = w.getTotalBalance();
        double totalInterest = w.getTotalInterestAccrued(2);

        System.out.println(totalBal);
        System.out.println(totalInterest); */

        // Test Case 1 - Assuming that it is one month of interest
        Person p1 = new Person("Person 1");
        Wallet w1 = new Wallet();
        Card c1 = new Card("Visa", 0.1, 100);
        Card c2 = new Card("Mastercard", 0.05, 100);
        Card c3 = new Card("Discover", 0.01, 100);

        //adding Cards to Wallet
        w1.addCard(c1);
        w1.addCard(c2);
        w1.addCard(c3);

        //adding wallet to person
        p1.addWallet(w1);

        //getting interest per card
        System.out.println("Card 1 Interest: " + c1.getInterestAccrued(1));
        System.out.println("Card 2 Interest: " + c2.getInterestAccrued(1));
        System.out.println("Card 3 Interest: " + c3.getInterestAccrued(1));

        //Test Case 2 - Assuming that it is one month of interest
        Person p2 = new Person("Person 2");
        Wallet w2 = new Wallet();
        Wallet w3 = new Wallet();
        Card c4 = new Card("Visa", 0.1, 100);
        Card c5 = new Card("Discover", 0.01, 100);
        Card c6 = new Card("Mastercard", 0.05, 100);

        //adding Cards to Wallets
        w2.addCard(c4);
        w2.addCard(c5);
        w3.addCard(c6);

        //adding wallets to person
        p2.addWallet(w2);
        p2.addWallet(w3);

        //getting total interst total for person
        System.out.println("Total interest for this person: " + p2.getTotalInterest(1)); //should be 16

        //getting total interest per wallet
        System.out.println("Total interest for first wallet: " + w2.getTotalInterestAccrued(1)); //should be 11
        System.out.println("Total interest for second wallet: " + w3.getTotalInterestAccrued(1)); //should be 5

        //Test Case 3 - Assuming that it is one month of interest
        Person p3 = new Person("Person 3");
        Person p4 = new Person("Person 4");
        Wallet w4 = new Wallet();
        Wallet w5 = new Wallet();
        Card c7 = new Card("Mastercard", 0.05, 100);
        Card c8 = new Card("Visa", 0.1, 100);
        Card c9 = new Card("Visa", 0.1, 100);
        Card c10 = new Card("Matercard", 0.05, 100);

        //adding cards to wallets
        w4.addCard(c7);
        w4.addCard(c8);
        w5.addCard(c9);
        w5.addCard(c10);

        //adding wallets to person
        p3.addWallet(w4);
        p4.addWallet(w5);

        //getting total itnerest for each person
        System.out.println("total interest for First Person: " + p3.getTotalInterest(1));
        System.out.println("total interest for Second Person: " + p4.getTotalInterest(1));

        //getting total interest per wallet
        System.out.println("total interest for First Person's Wallet: " + w4.getTotalInterestAccrued(1));
        System.out.println("total interest for Second Person's Wallet: " + w5.getTotalInterestAccrued(1));
    }
}