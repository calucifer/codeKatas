package codekatas;

public class Accumul {
    public static String accum(String s) {
        String out = "";
        for (int i = 0; i < s.length(); i++) {
            char field = s.charAt(i);
            out = out.concat(Character.toString(field).toUpperCase());
            for (int y = 1; y <= i; y++) {
                out = out.concat(Character.toString(field).toLowerCase());
            }
            out = out.concat("-");
        }
        return out.substring(0, out.length() - 1);
    }
}
