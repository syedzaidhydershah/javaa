import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter voltage: ");
        double v = sc.nextDouble();
        System.out.print("Enter current (ampere): ");
        double a = sc.nextDouble();

        double watts = v * a;
        System.out.println("Power (Watts): " + watts);
    }
}
