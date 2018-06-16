package codekatas;

public class Troll {
    public static String disemvowel(String str) {
        String replace = "";
        char[] strArray = str.toCharArray();
        for (int i = 0; i < strArray.length; i++) {
            if (notVowel(strArray[i])) {
                replace = replace.concat(String.valueOf(strArray[i]));
            }
        }
        return replace;
    }

    private static boolean notVowel(char c) {
        return c != 'a' && c != 'A' &&
                c != 'e' && c != 'E' &&
                c != 'i' && c != 'I' &&
                c != 'o' && c != 'O' &&
                c != 'u' && c != 'U';
    }
}
