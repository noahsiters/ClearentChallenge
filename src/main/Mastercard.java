public class Mastercard extends Card {

    public Mastercard(double argBalance){
        type="Mastercard";
        interest = 0.05;
        balance=argBalance;
    }
    
    @Override
    public double getInterestAccrued(int months){
        double interestAccrued = 0;

        interestAccrued = this.getBalance() * (months * this.getInterest());

        return interestAccrued;
    }
}