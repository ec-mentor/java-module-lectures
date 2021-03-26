package academy.everyonecodes.java.consolidation.set2.exercise1;

public class MastercardCardTypeValidator extends CardTypeValidator {

    public MastercardCardTypeValidator() {
        super("MASTERCARD");
    }

    @Override
    public boolean validate(String cardNumber) {
        return cardNumber.length() == 16 && (cardNumber.startsWith("51") ||
                cardNumber.startsWith("52") ||
                cardNumber.startsWith("53") ||
                cardNumber.startsWith("54") ||
                cardNumber.startsWith("55")
        );
    }
}
