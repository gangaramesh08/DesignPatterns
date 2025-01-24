package chain.of.responsibility;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoRDemo {
    public static void main(String[] args) {
        System.out.println("Enter the amount to be dispensed");
        BufferedReader bufferedReader = null;
        CoRCurrency currency = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            int amount = Integer.parseInt(bufferedReader.readLine());
            if (amount % 10 != 0) {
                System.out.println("Enter amount in multiples of 10");
            } else {
                System.out.println("Going to dispense");
                currency = new CoRCurrency(amount);
                CoRDispense cashDispense = new CoRDispense50();
                cashDispense.dispense(currency);
            }

        } catch (Exception exception) {
            System.out.println("Exception in reading input");
        }
    }
}
