public class CoRDispense50 implements CoRDispense {
    private static CoRDispense coRDispense = new CoRDispense50();
    private static int cash = 0;


    @Override
    public void dispense(CoRCurrency currency) {
        int amount = currency.getAmount();
        if (amount >= 50) {
            cash = amount / 50;
            int remainder = amount % 50;
            currency.setAmount(remainder);
        } else if(amount ==0 && cash==0){
            return;
        }else {
            coRDispense = new CoRDispense20();
            System.out.println("Dispensed " + cash + " notes in 50s.");
        }

        coRDispense.dispense(currency);
    }
}
