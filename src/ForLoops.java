

public class ForLoops {
    public static String printingHashTags(int num) {
      String tags ="";
        for(int i=0; i<num; i++) {
            tags += "#";

        }

return tags;
}





    /**
     * Sample usage:
     * countDown(0, 10) -> “10 9 8 7 6 5 4 3 2 1 0 ”
     * countDown(10, 0) -> “10 9 8 7 6 5 4 3 2 1 0 “
     * @param num1 an integer
     * @param num2 an integer
     * @return a countdown from the largest parameter to the smallest.
     */
    public static String countDown(int num1, int num2) {
        String countDown = "";
        if (num1 > num2) {
            for (int a = num1; a >= num2; a--) {
                countDown += a+" ";

            }

        } else {
            for (int a = num2; a >= num1; a--) {
                countDown += a+" ";
            }
            return countDown;


        }
        return countDown;
    }

    public static int sumNumbers(int num1, int num2){
        int sum=0;
        if(num1<num2){
            for (int i=num1; i<=num2; i++){
                sum += i;
            }
        }else{
            for( int i=num2; i<=num2; i++){
                sum +=i;
            }
        }

        return sum;

    }



}