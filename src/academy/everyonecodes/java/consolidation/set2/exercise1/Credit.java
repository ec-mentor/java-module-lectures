package academy.everyonecodes.java.consolidation.set2.exercise1;

public class Credit {

    private static final String INVALID = "INVALID";

    public String evaluate(String cardNumber) {
        if (!validateWithLuhnsAlgorithm(cardNumber)) {
            return INVALID;
        }
        var cardTypes = CardTypeValidators.get();
        for (var type : cardTypes) {
            if (type.validate(cardNumber)) {
                return type.getName();
            }
        }

        return INVALID;
    }

    boolean validateWithLuhnsAlgorithm(String cardNumber) {
        int nDigits = cardNumber.length();
        if (cardNumber.length() == 0) {
            return false;
        }

        int nSum = 0;
        boolean isSecond = false;
        for (int i = nDigits - 1; i >= 0; i--)
        {
            char currentChar = cardNumber.charAt(i);
            if (!Character.isDigit(currentChar)) {
                return false;
            }

            int d = cardNumber.charAt(i) - '0';

            if (isSecond == true)
                d = d * 2;

            // We add two digits to handle
            // cases that make two digits
            // after doubling
            nSum += d / 10;
            nSum += d % 10;

            isSecond = !isSecond;
        }
        return (nSum % 10 == 0);
    }
}
