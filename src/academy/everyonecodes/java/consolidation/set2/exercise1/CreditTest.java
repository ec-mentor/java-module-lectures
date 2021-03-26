package academy.everyonecodes.java.consolidation.set2.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CreditTest {

    private Credit credit = new Credit();

    @ParameterizedTest
    @CsvSource({
            "378282246310005, true",
            "4111111111111111, true",
            "5555555555554444, true",
            "3530111333300000, true",
            "3530111333300000dfjdf, false",
            "'', false",
            "asdf, false",
            "12sd3123d323, false",
            "12312302394234, false"
    })
    void validateWithLuhnsAlgorithm(String input, boolean expected) {
        var result = credit.validateWithLuhnsAlgorithm(input);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({
            "378282246310005, AMERICAN EXPRESS",
            "371449635398431, AMERICAN EXPRESS",
            "5555555555554444, MASTERCARD",
            "5105105105105100, MASTERCARD",
            "4111111111111111, VISA",
            "4012888888881881, VISA",
            "3530111333300000dfjdf, INVALID",
            "'', INVALID",
            "asdf, INVALID",
            "12sd3123d323, INVALID",
            "12312302394234, INVALID",
            "30569309025904, INVALID"
    })
    void evaluate(String input, String expected) {
        var result = credit.evaluate(input);
        Assertions.assertEquals(expected, result);
    }

}