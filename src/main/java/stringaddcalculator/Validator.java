package stringaddcalculator;

public class Validator {
    private String text;

    public void validate(String text){
        for(Character c : text.toCharArray()){
            boolean isDigit = Character.isDigit(c);
            validate(isDigit);
        }
    }

    private void validate(boolean digit) {
        if(!digit)
            throw new RuntimeException();
    }

    public void validate(String[] text) {
        for(String s : text){
            validate(s);
        }
    }
}
