package pl.xkoem;

public class NoX {
    public String noX(String str) {
        if (str.length() == 0 ) {
            return "";
        }
        if (str.charAt(str.length() -1 ) == 'x') {
            return noX(str.substring(0, str.length()-1 ));
        }
        return noX(str.substring(0, str.length()-1 )) + str.charAt(str.length() -1 );
    }
}
