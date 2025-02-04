package Strings;

//input = "My Hello World";
//output = "Hy Wello world";
public class SwapCharacterInAString {
    public static void main(String[] args) {
        String s= "My Hello World";
        String [] s2= s.split(" ");

        for (int i = 0; i < s2.length-1; i++) {
            char firstCharNext= s2[i+1].charAt(0);
            s2[i] = firstCharNext+s2[i].substring(1);

            String finalString= String.join(" ", s2);
            System.out.println(finalString);
        }
    }
}