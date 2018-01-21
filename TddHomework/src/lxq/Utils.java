package lxq;

public class Utils {
    public char[] intToCharArray(int number){
        String numberAsString = String.valueOf(number);
        char[] numberAsChar = numberAsString.toCharArray();
        return numberAsChar;
    }
}
