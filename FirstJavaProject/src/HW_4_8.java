public class HW_4_8 {
    public static void main(String[] args) {
//        Дан массив произвольных целых чисел.
//
//       необходимо подсчитать количество положительных и отрицательных чисел в этом массиве.


        int[] array = {7, 8, 5, 4, 3, 2, 1, 8, 7, 6, 4};

        int sum1 =0;
        int sum2 = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            int elem = array[i];
            if (elem % 2 == 0) {
                sum1 = sum1 + elem;
            } else {
                sum2 = sum2 + elem;
            }

        }
        System.out.println("Сумма положительных чисел = " + sum1);
        System.out.println("Сумма отрицательных чисел = " + sum2);
    }
}