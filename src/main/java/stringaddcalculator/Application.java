package stringaddcalculator;

public class Application {
    public static void main(String[] args) {
        StringCheck stringCheck = new StringCheck();
        System.out.println(stringCheck.checkText("123"));
        // 아래의 경우 문제의 조건 내 해당하지 않음.
        // 문제의 조건 상 반드시 쉼표 또는 콜론을 넣어줘야하기 때문
        System.out.println(stringCheck.checkText("1:23"));
        System.out.println(stringCheck.checkText("1:2,3"));
    }
}
