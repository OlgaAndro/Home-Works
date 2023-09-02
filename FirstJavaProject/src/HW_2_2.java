public class HW_2_2 {

    public static void main(String[] args) {
        int dobycha = 571;
        int teem = 25;

        int owner = dobycha / 2 + dobycha % 2;
        int cap = (dobycha - owner) / 2 + (dobycha - owner) % 2;
        int teem_cash = (dobycha - owner - cap) / teem;
        int cap_total = cap + teem_cash;
        int ostatok = dobycha - (owner + cap_total + teem_cash * (teem-1));

        System.out.print("Доля владельца судна: ");
        System.out.println(owner + " пиастр");
        System.out.print("Доля капитана: ");
        System.out.println(cap_total + " пиастр");
        System.out.print("Доля 1 пирата: ");
        System.out.println(teem_cash + " пиастр");
        System.out.print("Остаток: ");
        System.out.println(ostatok + " пиастр");

        if(owner + cap_total + teem_cash * (teem-1) + ostatok == dobycha)
        {
            System.out.println("Расчет произведен верно!");
        }
        else
        {
            System.out.println("Расчет произведен не верно!!!");
        }
    }


}
