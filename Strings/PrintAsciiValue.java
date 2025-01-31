package Strings;
// If  positive ascii value then print @, if negative print #.

public class PrintAsciiValue {
    public static void main(String[] args) {
        String s= "hello hi good by";

        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            int asciiValue= (int) ch;
            if (asciiValue%2==0){
                System.out.println("@");
            }else System.out.println("#");
        }
    }
}
