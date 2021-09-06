public class Discover extends Card {

    // Discover constructor, sets type and interest to what is outlined for Discover in requirements
    public Discover(double argBalance){
        type="Discover";
        interest = 0.01;
        balance=argBalance;
    }
    
    // Method to calculate the total interest accrued for a this instance of the card
    @Override
    public double getInterestAccrued(int months){
        double interestAccrued = 0;

        interestAccrued = this.getBalance() * (months * this.getInterest());

        return interestAccrued;
    }
}