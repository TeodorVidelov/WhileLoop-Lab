import java.util.Scanner;
public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double totalSum = 0;
        while (!"NoMoreMoney".equals(input)){
            double deposit = Double.parseDouble(input);

            if (deposit < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n",deposit);
            totalSum += deposit;
            input = scanner.nextLine();
        }
        System.out.printf("Total: %.2f",totalSum);
    }
}