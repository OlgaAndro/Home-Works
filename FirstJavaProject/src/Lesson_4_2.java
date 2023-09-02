import java.util.Arrays;

public class Lesson_4_2 {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 5, 5, 5, 4, 3, 3, 2, 1, 3};

        int[] results = new int[arr.length];

        for (int i = 0; i < arr.length; i = i + 1) {
            int elem = arr[i];
            results[i] = elem * elem;

        }
        System.out.println(Arrays.toString(results));


        //Цикл while
        int counter = 0;
//        while (counter < 5) {
//            System.out.println("I'm here!");
//            counter++;
//        }
//        То же самое:
        do {
            System.out.println("I'm still here!!!");
            counter += 1;
        } while (counter < 5);
    }
}
