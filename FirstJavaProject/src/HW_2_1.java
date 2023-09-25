public class HW_2_1 {

    public static void main(String[] args) {
        int a = 8;
        int b = 13;

        int rs1 = a + b;
        int rs2 = b - a;
        int rs3 = a * b;
        int rs4 = b / a;

        System.out.println("a+b=" + rs1);
        System.out.println("b-a=" + rs2);
        System.out.println("a*b=" + rs3);
        System.out.println("b/a=" + rs4);

        if (rs1 % 2 == 0)
        {
            System.out.println("a+b= " + rs1 + " - четное число");
        }
        else
        {
            System.out.println("a+b= " + rs1 + " - нечетное число");
        }
        if (rs2 % 2 == 0)
        {
            System.out.println("b-a= " + rs2 + " - четное число");
        }
        else
        {
            System.out.println("b-a= " + rs2 + " - нечетное число");
        }
        if (rs3 % 2 == 0)
        {
            System.out.println("a*b= " + rs3 + " - четное число");
        }
        else
        {
            System.out.println("a*b= " + rs3 + " - нечетное число");
        }
        if (rs4 % 2 == 0)
        {
            System.out.println("b/a= " + rs4 + " - четное число");
        }
        else
        {
            System.out.println("b/a= " + rs4 + " - нечетное число");
        }

    }

}
