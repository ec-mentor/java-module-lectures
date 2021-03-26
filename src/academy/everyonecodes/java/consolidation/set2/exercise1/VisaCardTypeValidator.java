package academy.everyonecodes.java.consolidation.set2.exercise1;

public class VisaCardTypeValidator extends CardTypeValidator {

    public VisaCardTypeValidator() {
        super("VISA");
    }

    @Override
    public boolean validate(String cardNumber) {
        return (cardNumber.length() == 13 || cardNumber.length() == 16) && cardNumber.startsWith("4");
    }
}
