import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Stack;

public class LibraryFunctions {

    public static String reverseString(String string){
        // Create a stack, push the characters of the string onto it, pop them off into a new string.
        Stack<Character> reverse = new Stack<>();

        int stringLength = string.length();

        for(int i = 0; i < stringLength; i++){
            char c = string.charAt(i);
            reverse.push(c);
        }

        StringBuilder newString = new StringBuilder();

        for(int i = 0; i < stringLength; i++){
            char c = reverse.pop();
            newString.append(c);
        }

        return newString.toString();
    }

    public static int largestOfThree(int firstNum, int secondNum, int thirdNum){
        //Use a priority queue, in reverse, that will sort the items for us as we peek.
        PriorityQueue<Integer> getLargest = new PriorityQueue<>(Collections.reverseOrder());

        getLargest.offer(firstNum);
        getLargest.offer(secondNum);
        getLargest.offer(thirdNum);

        return getLargest.peek();
    }

    public static int factorial(int num){
        // Base case
        if(num == 1){
            return num;
        }
        //recurse
        return num * factorial(num-1);
    }

    public static int fibonacci(int numIterations){
        //Declare an array of size equivalent to the number of fibonacci iterations.
        int[] fibonacciNumbers = new int[numIterations];

        //Declare the first iteration, which is 1.
        fibonacciNumbers[0] = 1;

        if(numIterations == 1){
            //If we are only doing 1 iteration, no math is required.
            return fibonacciNumbers[0];

        } else {

            for(int i = 1; i < numIterations; i++){

                if(i == 1){
                    //For the second iteration, we simply add 0 to our first iteration, which yields the
                    // first iteration.
                    fibonacciNumbers[i] = fibonacciNumbers[0];

                } else{
                    //Using our array, we add the last two indexes together to compute the next fibonacci number.
                    fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i-2];

                }
            }
            //Return the final fibonacci number in the sequence.
            return fibonacciNumbers[fibonacciNumbers.length-1];
        }
    }
}
