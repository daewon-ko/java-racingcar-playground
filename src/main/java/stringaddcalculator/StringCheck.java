package stringaddcalculator;
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
        int result =0;
        if(text.equals("")|| text.equals(null)) result = stringCheck.check_null(text);
        if(text.contains(",")) result =stringCheck.check_comma(text);
        if(text.length() ==1) result =stringCheck.check_onlyOneNumber(text);
        if(text.contains(",") && text.contains(":")) result = stringCheck.check_commaOrColon();
        if(text.contains("//") || text.contains("\n")) result =stringCheck.check_custom();
        if(text.contains("-")) result = stringCheck.check_negative();
        return result;
    }

    private int check_null(String text) {

        return 0;
    }
    private int check_comma(String text) {
        String [] result = text.split(",");
        int total = 0;
        for(String s : result){
            int number = Integer.valueOf(s);
            total+=number;
        }
        return total;
    }
    private int check_onlyOneNumber(String text) {
        int sum= Integer.valueOf(text);
        return sum;
    }

    private int check_commaOrColon() {
        return 0;
    }

    private int check_negative() {
        return 0;
    }

    private int check_custom() {
        return 0;

    }




}

