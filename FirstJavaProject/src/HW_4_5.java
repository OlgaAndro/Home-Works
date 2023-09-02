public class HW_4_5 {
    public static void main(String[] args) {

//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести максимальное значение массива.


        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i = i +1) {
            int elem = array[i];
            if (elem > max) {
                max = elem;
            }

        }
        System.out.println(max);

    }
}
