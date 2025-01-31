package Strings;

public class RearrangeFirstToLast {
    public static void main(String[] args) {
        String s = "sudippaladhi";
        String s2 = Exchange(s);
        System.out.println(s2);

    }

    static String Exchange(String s) {
        char[] ch = s.toCharArray();
        char temp = ch[0];
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;
        return new String(ch);
    }
}
// Output : iudippaladhs