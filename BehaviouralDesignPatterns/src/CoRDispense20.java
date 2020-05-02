public class CoRDispense20 implements CoRDispense {
    private static CoRDispense coRDispense  = new CoRDispense20();
    private static int cash = 0;
    @Override
    public void dispense(CoRCurrency currency) {
        int amount = currency.getAmount();
        int interim_cash = 0;
        if (amount >= 20) {
            interim_cash = amount / 20;
            int remainder = amount % 20;
            currency.setAmount(remainder);
            cash +=interim_cash;
        }else if(amount ==0 && cash==0){
            return;
        } else {
            coRDispense = new CoRDispense10();
            System.out.println("Dispensed " + cash + " notes in 20s.");
        }
        coRDispense.dispense(currency);
    }
}
