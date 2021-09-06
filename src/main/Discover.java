public class Discover extends Card {

    public Discover(double argBalance){
        type="Discover";
        interest = 0.01;
        balance=argBalance;
    }
    
    @Override
    public double getInterestAccrued(int months){
        double interestAccrued = 0;

        interestAccrued = this.getBalance() * (months * this.getInterest());

        return interestAccrued;
    }
}