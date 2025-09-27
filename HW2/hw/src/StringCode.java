public class StringCode {
    String blowup(String str) {
        String result = "";
        int len = str.length();
        for ( int i = 0; i < len - 1; i++ ) {
            char now = str.charAt(i);
            if ( '0' <= now && now <= '9' ) {
                char next = str.charAt(i + 1);
                boolean letter1 = ('a' <= next && next <= 'z');
                boolean letter2 = ('A' <= next && next <= 'Z');
                if ( letter1 || letter2 ) {
                    int times = now - '0';
                    for ( int j = 0; j < times; j++ ) {
                        result += next;
                    }
                }
                else {
                    result += now;
                }
            }
            else {
                result += now;
            }
        }
        if ( '0' <= str.charAt(len - 1) && str.charAt(len - 1) <= '9' ) {
            result += "";
        }
        else {
            result += str.charAt(len - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        StringCode sc = new StringCode();
        System.out.println(sc.blowup("a3tx2z"));
        System.out.println(sc.blowup("12x"));
        System.out.println(sc.blowup("3"));
    }
}
