import java.util.Arrays;

public class Task_10 {
    public static void main(String[] args) {

//        Дано положительное целое число n.
//                создать ряд из n чисел так, чтобы:
//        первые два элемента ряда равнялись 1
//        любой другой элемент ряда был суммой двух предыдущих.
//        Пример:
//        1, 1, 2, 3, 5, 8, …
//        Вывести получившийся ряд на экран.

        int n = 20;
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < n; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(Arrays.toString(array));


    }
}
