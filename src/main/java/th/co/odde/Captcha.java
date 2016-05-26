package th.co.odde;

public class Captcha {
    private int left;
    private int pattern;
    private int operator;
    public Captcha(int pattern, int left, int operator, int right) {
        this.left = left;
        this.pattern = pattern;
        this.operator = operator;
    }

    public String getLeft() {
        String[] intToString = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"};
        if (this.pattern == 2) {
            return String.valueOf(this.left);
        }
        return intToString[this.left-1];
    }

    public String getOperator() {
        if(this.operator ==  3)
            return "-";
        return "+";
    }
}
