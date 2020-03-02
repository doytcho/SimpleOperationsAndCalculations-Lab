import java.util.Scanner;

public class L05 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String name = scan.nextLine();
        int proekts= Integer.parseInt(scan.nextLine());
        System.out.printf("The architect %s will need %d hours to complete %d project/s.",name , proekts*3, proekts);
    }
}
