package pl.xkoem;

public class CountX {
    public int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int numberX = 0;
        if (str.charAt(str.length()-1) == 'x') {
            numberX = 1;
        }
        return numberX + countX(str.substring(0, str.length()-1));
    }
}
