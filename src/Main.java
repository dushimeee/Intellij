import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    private static Object Total;

    public static void main(String[] args) {

        double price=9.99;
        double vat=0.23;
        double product=10000;
        double taxRate= (1+vat)*9.99;
        double net= price*product;
        double total=product*taxRate;
        System.out.println("Calculation without using Double");
        System.out.println("Price of the product: "+price);
        System.out.println("VAT of the product is 23% ");
        System.out.println("Number of items sold: "+product);
        System.out.println("Price of the product excluding the tax: "+net);
        System.out.println("Total price including the tax: "+total);

        //using big decimal
        BigDecimal Price = new BigDecimal("9.99");
        BigDecimal VAT = new BigDecimal("0.23");
        BigDecimal Gross = Price.multiply(BigDecimal.ONE.add(VAT));
        BigDecimal Total = Gross.multiply(new BigDecimal("10000"));
        BigDecimal Net = Total.divide(BigDecimal.ONE.add(VAT), 2, RoundingMode.HALF_UP);

        System.out.println("The results using Big Decimal");
        System.out.println("Price of the product: "+price);
        System.out.println("VAT of the product is 23% ");
        System.out.println("Number of items sold: "+product);
        System.out.println("Price of the product excluding the tax"+Net);
        System.out.println("Total price including the tax: "+Total);
       





    }
}