package codekatas;

public class XO {


    private static boolean isX(char c) {
        return c == 'x' || c == 'X';
    }

    private static boolean isO(char c) {
        return c == 'o' || c == 'O';
    }

    public boolean getXO(String letters) {
        String replace = "";
        int xs = 0, os = 0;

        char[] strArray = letters.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (isX(strArray[i])) {
                xs++;
            }
            if (isO(strArray[i])) {
                os++;
            }
        }
        return xs == os;
    }

}
