import java.util.Arrays;

public class revew_4_2 {
    public static void main(String[] args) {

//        4.2 (08/21) escape sequences, if-else, for, Fibonacci sequence

//        escape последовательности:

        System.out.println("back slash: \\");
        System.out.println("new line: \n new line");
        System.out.println("tab: \t tab \t tab \t tab");
        System.out.println("double quates \"some thing\"");

//        boolean

        boolean booleanResult1 = 5 < 3;
        System.out.print("booleanResult1: ");
        System.out.println(booleanResult1);

        System.out.print("!false is ");
        System.out.println(!false);

        System.out.print("!true ");
        System.out.println(!true);

        System.out.print("false && false is \t");
        System.out.println(false && false);

        System.out.print("false && true is \t");
        System.out.println(false && true);

//        Последовательность Фибоначчи

        int number = 8;
        int[] fibonacciSequence = new int[number];
        int previous = 0;
        int current = 1;
        fibonacciSequence[0] = current;
        for (int i = 1; i < number; i++) {
            fibonacciSequence [i] = previous + current;
            previous = current;
            current = fibonacciSequence[i];
        }
        System.out.println(Arrays.toString(fibonacciSequence));

    }
}
