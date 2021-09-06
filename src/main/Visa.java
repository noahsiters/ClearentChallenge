public class Visa extends Card {

    // Visa constructor, sets type and interest to what is outlined for Visa in requirements
    public Visa(double argBalance){
        type="Visa";
        interest = 0.1;
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