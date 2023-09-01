public class HW_6_1_Task_3 {
    public static void main(String[] args) {

        /*
        Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести минимальное значение массива.
         */
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
                if (array[i][j]<min) {
                    min = array[i][j];
                }
        }
        System.out.println(min);
    }
}
