import java.util.Scanner;

public class L07 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double area = Double.parseDouble(scan.nextLine());
        double price;
        double discount;
        double finalPrice;
        price = area *7.61;
        discount = price*.18;
        finalPrice = price - discount;
        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
