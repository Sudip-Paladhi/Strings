package Strings;

public class RearrangeCharacter {
    public static void main(String[] args) {
        String s = "python";
        int mid = s.length() / 2;
        String first= reverse(s,0,mid-1);
        String last= reverse(first, mid,s.length()-1);
        System.out.println(last);
    }

    static String reverse(String s, int i, int j) {
        char[] ch = s.toCharArray();
        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        String s2= new String(ch);
        return s2;
    }
}