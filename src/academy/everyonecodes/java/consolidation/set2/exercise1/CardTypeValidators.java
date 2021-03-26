package academy.everyonecodes.java.consolidation.set2.exercise1;

import java.util.List;

public class CardTypeValidators {
    private static final List<CardTypeValidator> cardTypes = List.of(new AmericanExpressCardTypeValidator(), new MastercardCardTypeValidator(), new VisaCardTypeValidator());
    public static List<CardTypeValidator> get() {
        return cardTypes;
    }
}
