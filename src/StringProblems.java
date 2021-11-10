import java.util.Locale;

public class StringProblems {

    public static String addHyphens(String s) {
String newString="";
for(int i=0; i<s.length(); i++){
    newString += s.substring(i, i+1)+"-";
}
        return newString.substring(0, newString.length()-1);
    }

    public static String everyOtherLetter(String s) {
String newString ="";
for(int i=0; i<s.length(); i=i+2)
    newString += s.substring(i, i+1);
        return newString;
    }


    public static String differentStrings(String s1, String s2) {

        return "";
    }

    public static boolean isPalindrome(String word) {
        String wordNoSpace="";

        String wordReverse="";

        for(int i=0; i< word.length(); i++){
            if(!word.substring(i, i+1).equals(" ")){
                wordNoSpace += word.substring(i,i+1);
               wordNoSpace.toLowerCase();
            }
        }
        for (int i=0; i< word.length(); i++){
                String ithLetter = word.substring(i,i+1);
                wordReverse= wordReverse+ ithLetter;

        }
        for (int i = 0; i < word.length(); i++) {
            if (wordNoSpace.substring(i, i + 1).equals(wordNoSpace.substring(wordNoSpace.length()- 1))) {
                return true;
            } else{
                return false;
            }
        }
        return false;
    }
}

