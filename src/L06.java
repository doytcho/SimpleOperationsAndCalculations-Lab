import java.util.Scanner;

public class L06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dogFood = Integer.parseInt(scan.nextLine());
        int otherFood = Integer.parseInt(scan.nextLine());
        System.out.printf("%.2f lv.",dogFood * 2.5 + otherFood * 4);
    }
}
