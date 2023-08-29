public class Main {
    public static void main(String[] args) {

        System.out.println("Выводим индекс позиций буквы \" а \" в фразе \"А роза упала на лапу Азора \" ");
        String str = "А роза упала на лапу Азора";
        for (int i = 0; i < str.length(); i++ ) {
            if (str.charAt(i) == 'а' || str.charAt(i) == 'А') {
                System.out.println(i);
            }
        }

//        Сравнение объектов
        System.out.println("Сравниваем объекты: ");
         Integer a = 1000;
         Integer b = 1000;
        System.out.println(" a = b = " + a.equals(b));

        Integer c = 1000;
        Integer d = 1;
        System.out.println(" c != d = " + !c.equals(d));

    }
}