package stringaddcalculator;

import java.util.Scanner;

public class StringAddCalculator {
    //text에 대해서 예외처리를 해주는 로직도 필요할 것 같은데 어떻게 작성해야할 지 감이 오지 않음.
    // input으로 받아서 유효성 검증을 처리해주는 로직을 설계해주면 되지 않을까?
    Input input = new Input();

    public static int splitAndSum(String text) {
//        Input.getText() = text;

        int result = 0;
        // input이 어떤 경우인지 판단할 메서드 필요
        // input을 매개변수로 담고, check(input2)이런 식으로 메서드를 작성하고
        // Input.check(input2) -> 경우에 따라 구분자로 쪼개서 배열로 형성하여 리턴해준다?
        StringCheck stringCheck = new StringCheck();
        result = stringCheck.checkText(text);
//        if(text.equals("")|| text.equals(null)) result = StringAddCalculator.check_null();
//        if(text.contains(",")) result =StringAddCalculator.check_comma();
//        if(text.length() ==1) result =StringAddCalculator.check_onlyOneNumber();
//        if(text.contains(",") && text.contains(":")) result = StringAddCalculator.check_commaOrColon();
//        if(text.contains("//") || text.contains("\n")) result =StringAddCalculator.check_custom();
//        if(text.contains("-")) result = StringAddCalculator.check_negative();

        return result;
    }


}
