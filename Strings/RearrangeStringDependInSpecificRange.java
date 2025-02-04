package Strings;

public class RearrangeStringDependInSpecificRange {

    //input - "I Love My India"
    //output - "I evol yM India"

    public static void main(String[] args) {
        String s = "I Love My India";
        String[] s2 = s.split(" ");

        for (int i = 0; i < s2.length; i++) {
            if (s2[i].length() <= 4) {
                s2[i] = reverseWord(s2[i]);
            }
        }
        String finalString = String.join(" ", s2);
        System.out.println(finalString);
    }

    static String reverseWord(String s3) {
        if (s3.isEmpty()) {
            return s3;
        }
        return reverseWord(s3.substring(1)) + s3.charAt(0);
    }
}