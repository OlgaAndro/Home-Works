public class HW_6_3_Task_1 {

    /*
    Необходимо написать 4 метода:
сложение 2х чисел
вычитание 2х чисел
умножение 2х чисел
деление 2х чисел

     */
    public static int sum(int a, int b) {
        int c = a + b;
        return c;
    }

    public static int dif (int d, int e) {
        int f = d - e;
        return f;
    }

    public static int prod (int g, int h) {
        int k = g * h;
        return k;
    }

    public static int quot (int l, int m) {
        int n = l / m;
        return  n;
    }

    public static void main(String[] args) {
        int x = 20;
        int y = 5;
        int z = sum (x,y);
        int w = dif (x,y);
        int s = prod(x,y);
        int q = quot(x,y);

        System.out.println(z);
        System.out.println(w);
        System.out.println(s);
        System.out.println(q);


    }
}
