package stringaddcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    @DisplayName("쉼표(단독)구분자")
    @Test
    public void splitAndSum_colon() {
        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.splitAndSum("1,2,3");
        assertThat(result).isEqualTo(6);
    }
    @DisplayName("콜론(단독)구분자")
    @Test
    public void splitAndSum_Realcolon() {
        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.splitAndSum("1:2:3");
        assertThat(result).isEqualTo(6);
    }
    @DisplayName("쉼표 또는 콜론 구분자")
    @Test
    public void splitAndSum_colonOrRealColon() {
        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.splitAndSum("1:2,3");
        assertThat(result).isEqualTo(6);
    }
    @DisplayName("마이너스가 포함된 경우")
    @Test
    public void splitAndSum_negative() {
//        StringAddCalculator calculator = new StringAddCalculator();
//        int result = calculator.splitAndSum("-1,2,3");
//        assertThrows(RuntimeException.class, () -> {
//            System.out.println("런타임 에러입니다.");
//        });
        assertThatThrownBy(()-> StringAddCalculator.splitAndSum("-1,2,3")).isInstanceOf(RuntimeException.class);
    }
    @DisplayName("커스텀한 경우")
    @Test
    public void splitAndSum_custom() {
        StringAddCalculator calculator = new StringAddCalculator();
        int result = calculator.splitAndSum("//;\n1;2;3;");
        assertThat(result).isEqualTo(6);
    }
}
