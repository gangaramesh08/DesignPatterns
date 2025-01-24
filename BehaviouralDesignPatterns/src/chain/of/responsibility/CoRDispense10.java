package chain.of.responsibility;

public class CoRDispense10 implements CoRDispense {
    private static CoRDispense coRDispense = new CoRDispense10();
    private static int cash = 0;

    @Override
    public void dispense(CoRCurrency currency) {
        int amount = currency.getAmount();
        int interim_cash = 0;
        if (amount >= 10) {
            interim_cash = amount / 10;
            int remainder = amount % 10;
            currency.setAmount(remainder);
            cash +=interim_cash;
        }else if(amount ==0 && cash ==0){
            return;
        }
        else if(amount==0){
            System.out.println("Dispensed " + cash + " notes in 10s.");
            return;
        }
        coRDispense.dispense(currency);
    }
}
