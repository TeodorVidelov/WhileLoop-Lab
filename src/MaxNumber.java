import java.util.Scanner;
public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int maxNumber = Integer.MIN_VALUE;

        while (!"Stop".equals(input)){
            int number = Integer.parseInt(input);
            if (number >= maxNumber){
                maxNumber = number;
            }
            input = scanner.nextLine();
        }
        System.out.println(maxNumber);
    }
}