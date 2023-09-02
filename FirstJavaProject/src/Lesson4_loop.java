public class Lesson4_loop {

    public static void main(String[] args) {

        int i = 0;
        for (; i < 5; i = i+1) {
            System.out.println(i);
            System.out.println("Привет!");
        }
        System.out.print("Final value of i = ");
        System.out.println(i);
    }

}
