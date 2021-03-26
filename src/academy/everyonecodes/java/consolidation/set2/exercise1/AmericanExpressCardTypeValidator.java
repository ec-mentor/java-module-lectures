package academy.everyonecodes.java.consolidation.set2.exercise1;

public class AmericanExpressCardTypeValidator extends CardTypeValidator {

    public AmericanExpressCardTypeValidator() {
        super("AMERICAN EXPRESS");
    }

    @Override
    public boolean validate(String cardNumber) {
        return cardNumber.length() == 15 && (cardNumber.startsWith("34") || cardNumber.startsWith("37"));
    }
}
