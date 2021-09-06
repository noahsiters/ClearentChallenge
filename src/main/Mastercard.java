public class Mastercard extends Card {

    // Mastercard constructor, sets type and interest to what is outlined for Mastercard in requirements
    public Mastercard(double argBalance){
        type="Mastercard";
        interest = 0.05;
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