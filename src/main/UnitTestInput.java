import java.util.Scanner;
import java.util.ArrayList;
public class UnitTestInput {
    public static void main(String[] args){
        /*
        TODO:
        - add so that you can have multiple wallets (currently only works with having one wallet)
        */
        Scanner scanner = new Scanner(System.in);

        int walletCount = 0;
        int mastercardCount = 0;
        int visaCount = 0;
        int discoverCount = 0;

        System.out.println("How many wallets does this person have?");
        walletCount = scanner.nextInt();
        //ArrayList<Wallet> wallet = new ArrayList<Wallet>();
        //ArrayList<Card> wallet = new ArrayList<Card>();
        Wallet wallet = null;

        for(int i=0;i<walletCount;i++){
            //wallets.add(new Wallet());
            System.out.println("In wallet " + (i+1));
            System.out.println("How many Mastercards does this wallet have?");
            mastercardCount = scanner.nextInt();
            System.out.println("How many Visas does this wallet have?");
            visaCount = scanner.nextInt();
            System.out.println("How many Discovers does this wallet have?");
            discoverCount = scanner.nextInt();
            wallet = new Wallet();

            for(int j=0;j<mastercardCount;j++){
                System.out.println("How much balance does this Mastercard have?");
                int bal = scanner.nextInt();
                wallet.addCard(new Mastercard(bal));
            }

            for(int k=0;k<visaCount;k++){
                System.out.println("How much balance does this Visa have?");
                int bal = scanner.nextInt();
                wallet.addCard(new Visa(bal));
            }

            for(int l=0;l<discoverCount;l++){
                System.out.println("How much balance does this Discover have?");
                int bal = scanner.nextInt();
                wallet.addCard(new Discover(bal));
            }

            System.out.println("How many months of interest?");
            int months = scanner.nextInt();
            System.out.println("Total for this wallet: " + wallet.getTotalInterestAccrued(months));
        }

/*         System.out.println("How many Mastercards does this wallet have?");
        mastercardCount = scanner.nextInt();
        System.out.println("How many Visas does this wallet have?");
        visaCount = scanner.nextInt();
        System.out.println("How many Discovers does this wallet have?");
        discoverCount = scanner.nextInt(); */
    }
}