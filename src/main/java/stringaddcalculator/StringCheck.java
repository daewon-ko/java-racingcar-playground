package stringaddcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCheck {

//    static Scanner sc = new Scanner(System.in);
//    static String text = sc.nextLine();
//
//
//    public String inputString() {
//        Scanner sc = new Scanner(System.in);
//        String input = sc.nextLine();
//        return input;
//    }

    public int checkText(String text) {
        StringCheck stringCheck = new StringCheck();
        int result = 0;
        if (text.equals("") || text.equals(null)) return stringCheck.check_null(text);
        if (text.length() == 1) return stringCheck.check_onlyOneNumber(text);
        if (text.contains(",") && !text.contains(":")) return stringCheck.check_comma(text);
        if (text.contains(":") && !text.contains(",")) return stringCheck.check_colon(text);
        if (text.contains(",") && text.contains(":")) return stringCheck.check_commaOrColon(text);
        if (text.contains("-")) return stringCheck.check_negative(text);
        // 커스탐한경우
        return stringCheck.check_custom(text);
    }

    private int check_null(String text) {
        return 0;
    }

    private int check_onlyOneNumber(String text) {
        int sum = Integer.valueOf(text);
        return sum;
    }

    private int check_comma(String text) {
        String[] result = text.split(",");
        int total = 0;
        for (String s : result) {
            int number = Integer.valueOf(s);
            total += number;
        }
        return total;
    }

    private int check_colon(String text) {
        String[] result = text.split(":");
        int total = 0;
        for (String s : result) {
            int number = Integer.valueOf(s);
            total += number;
        }
        return total;

    }

    private int check_commaOrColon(String text) {
        String[] result = text.split(",|:");
        int total = 0;
        for (String s : result) {
            int number = Integer.valueOf(s);
            total += number;
        }
        return total;
    }

    private int check_negative(String text) {
        throw new RuntimeException();
    }

    private int check_custom(String text) {
        Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
        int total = 0;
        if (m.find()) {
            String customDelimiter = m.group(1);
            String[] number = m.group(2).split(customDelimiter);
            for (String s : number) {
                int num = Integer.valueOf(s);
                total += num;
            }
        }
        return total;
    }


}

