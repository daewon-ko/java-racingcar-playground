package stringaddcalculator;

import java.util.Arrays;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCheck {
    private static final Pattern customPattern = Pattern.compile("//(.)\n(.*)");
    private static final Validator validator = new Validator();

    public int checkText(String text) {
        StringCheck stringCheck = new StringCheck();
        int result = 0;
        if (text.equals("") || text.equals(null)) return 0;
        Matcher matcher = customPattern.matcher(text);
        if (matcher.find()) {
            return stringCheck.check_custom(matcher);
        }
        return stringCheck.check_commaOrColon(text);
    }


//    private int check_onlyOneNumber(String text) {
//        int sum = Integer.valueOf(text);
//        return sum;
//    }
//
//    private int check_comma(String text) {
//        String[] result = text.split(",");
//        int total = 0;
//        for (String s : result) {
//            int number = Integer.valueOf(s);
//            total += number;
//        }
//        return total;
//    }
//
//    private int check_colon(String text) {
//        String[] result = text.split(":");
//        int total = 0;
//        for (String s : result) {
//            int number = Integer.valueOf(s);
//            total += number;
//        }
//        return total;
//
//    }

    private int check_commaOrColon(String text) {
        String[] result = text.split(",|:");
        int total = 0;
        validator.validate(result);
        for (String s : result) {
            int number = Integer.valueOf(s);
            total += number;
        }
        return total;
    }

//    private int check_negative(String text) {
//        throw new RuntimeException();
//    }

    private int check_custom(Matcher matcher) {
        String customDelimiter = matcher.group(1);
        String[] tokens = matcher.group(2).split(customDelimiter);
        validator.validate(tokens);
        Optional<Integer> reduce = Arrays.stream(tokens).map(Integer::parseInt)
                .reduce((a, b) -> a + b);
        return reduce.get();


//
// g
//
//        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
//        int total = 0;
//        if (m.find()) {
//            String customDelimiter = m.group(1);
//            String[] number = m.group(2).split(customDelimiter);
//            for (String s : number) {
//                int num = Integer.valueOf(s);
//                total += num;
//            }
//        }
//        return total;
    }


}

