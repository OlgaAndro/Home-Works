public class HW_4_6 {
    public static void main(String[] args) {

//        Дан массив:
//        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//        необходимо вывести минимальное значение массива.


        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i = i + 1) {
            int elem = array[i];
            if (elem < min) {
                min = elem;
            }
        }
        System.out.println(min);

    }

}
