import java.util.Scanner;
public class Disemvoweling {

    public static String disemdouble(String original) {
        String s = "";

        for (int i = 0; i < original.length() - 1; i += 1) {
            String a = original.substring(i, i + 1);
            String b = original.substring(i + 1, i + 2);
            if (a.equals(b)) {
                s += original.substring(i, i + 1);
                i += 1;
            } else {
                s += original.substring(i, i + 1);
            }
        }
        if (!(original.substring(original.length()-2, original.length()-1).equals(original.substring(original.length()-1, original.length())))) {
            s += original.substring(original.length() - 1);
        }

        return s;
    }
    public static String disemvowel(String s) {
        String newString = "";
        for(int i=0; i<s.length(); i+=1) {
            char c= s.charAt(i);
            if (c == 'a'|| c == 'e'||c == 'i'||c == 'o'||c =='u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
            }
            else {
                newString += s.substring(i, i+1);
            }
        }

        return newString;
    }
    public static double reductionRate(int originalLength, int length) {
        double rate = (1- ((double)length)/((double)originalLength))*1000;
        double rate2 = (int)rate;
        double reductionRate = rate2/10;
        return  reductionRate;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the amazing disemdoubling/disemvoweling machine!");
        System.out.print("Enter any phrase: ");
        String original = scan.nextLine();
        int originalLength = original.length();
        String s = disemvowel(original);
        String newString = disemdouble(s);
        String newNewString = disemdouble(newString);
        int length = newNewString.length();
        double rate = reductionRate(originalLength, length);
        System.out.println("The disemvoweled phrase is: " + newNewString);
        System.out.println("Reduced from " + originalLength + " to " + length + " characters.  Reduction rate of " + rate + "%");
    }
}















