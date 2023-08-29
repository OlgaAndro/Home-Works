import java.util.Arrays;

public class Lesson_5_Extra {
    public static void main(String[] args) {

        /*
        Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.

         */

//        Вариант 1. Принимаем каждый вложенный массив за отдельную строку

        String[][] array = {
                {"Привет", "всем", "кто"},
                {"изучает", "язык", "программирования"},
                {"java"}};

        String[] array1 = array[0];
        String[] array2 = array[1];
        String[] array3 = array[2];

        int a;
        int b;
        int c;


        String arrayOne = Arrays.toString(array1);
        String arrayTwo = Arrays.toString(array2);
        String arrayThree = Arrays.toString(array3);

        if (arrayOne.contains("е")) {
            a = 0;
        } else {a = 1;}
        if (arrayTwo.contains ("е")) {
            b = 0;
        } else { b = 1;
        }
        if (arrayThree.contains("е")) {
            c = 0;
        } else {
            c = 1;
        }
        System.out.println(a + b + c);

//        Вариант 2. Принимаем за строку каждое слово из вложенных массивов.

//            String[][] arr = {
//                    {"Привет", "всем", "кто"},
//                    {"изучает", "язык", "программирования"},
//                    {"java"}
//            };
//            int count = 0;
//            for (int i = 0; i < arr.length; i++) {
//                for (int j = 0; j < arr[i].length; j++) {
//                    if (!arr[i][j].contains("е")){
//                        count++;
//                    }
//                }
//            }
//            System.out.println(count);

        }
    }



