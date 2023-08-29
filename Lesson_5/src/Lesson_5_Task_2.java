public class Lesson_5_Task_2 {
    public static void main(String[] args) {

        /*
        Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.

         */
        String s = "Перевыборы выбранного президента";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                sum++;
            }

        }
        System.out.println(sum);
    }
        }

