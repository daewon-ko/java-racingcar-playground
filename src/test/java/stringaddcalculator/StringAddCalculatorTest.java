package stringaddcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringAddCalculatorTest {

    @DisplayName("빈문자 또는 Null")
    @Test
    public void splitAndfSum_null() {
        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.splitAndSum("");
        assertThat(result).isEqualTo(0);
    }

    @DisplayName("숫자 하나")
    @Test
    public void splitAndSum_onlyOneNumber() {
        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.splitAndSum("1");
        assertThat(result).isEqualTo(1);
    }
    @DisplayName("쉼표(컴마)구분자")
    @Test
    public void splitAndSum_colon() {
        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.splitAndSum("1,2,3");
        assertThat(result).isEqualTo(6);
    }
}
