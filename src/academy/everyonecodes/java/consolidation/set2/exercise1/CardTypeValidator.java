package academy.everyonecodes.java.consolidation.set2.exercise1;

public abstract class CardTypeValidator {
    private String name;

    public CardTypeValidator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract boolean validate(String cardNumber);
}
