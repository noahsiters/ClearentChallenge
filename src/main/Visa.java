public class Visa extends Card {

    public Visa(double argBalance){
        type="Visa";
        interest = 0.1;
        balance=argBalance;
    }
    
    @Override
    public double getInterestAccrued(int months){
        double interestAccrued = 0;

        interestAccrued = this.getBalance() * (months * this.getInterest());

        return interestAccrued;
    }
}