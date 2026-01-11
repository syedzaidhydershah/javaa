import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter discounted price: ");
        double dp = sc.nextDouble();
        System.out.print("Enter discount percentage: ");
        double d = sc.nextDouble();

        double originalPrice = dp / (1 - d / 100);
        System.out.println("Original Selling Price: " + originalPrice);
    }
}
