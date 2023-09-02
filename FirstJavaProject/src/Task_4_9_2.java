import java.util.Arrays;

public class Task_4_9_2 {

    public static void main(String[] args) {

        int[] array = {5, 2, -3, 9, 5, 6, 4, -8, 9};
        boolean sorted = true;

        if (array[0] <= array[1]) {
            for (int i = 2; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    sorted = false;
                }
            }
            if (sorted) {
                System.out.print("Ваш массив ");
                System.out.print(Arrays.toString(array));
                System.out.println(" отсортирован");
            }
        } else {
            System.out.print("Ваш массив ");
            System.out.print(Arrays.toString(array));
            System.out.println(" не отсортирован!");
        }






    }


}




