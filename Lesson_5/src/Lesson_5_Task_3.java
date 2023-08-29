public class Lesson_5_Task_3 {
    public static void main(String[] args) {

        /*
        Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.

         */
        String s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        for (int i=0; i < s.length(); i++) {
            if (s.charAt(i) == 'р'&& s.charAt(i+1)== 'и' && s.charAt(i+2) == 'т') {
                System.out.println(i);
            }
        }
    }
}
