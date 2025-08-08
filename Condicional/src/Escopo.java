public class Escopo {
    public static void main(String[] args) {

        double price = 400;
        double discount;
        if(price == 400) {
            discount = 400 * 0.1;
        } else if(price == 0) {
            discount = 0;
        } else {
            discount = 0;
        }
        System.out.println(discount);

    }
}
