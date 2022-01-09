import java.util.Scanner;
public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();

        int countClasses = 1;
        int isExcluded = 0;
        double sumGrades = 0;
        while (countClasses <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00){
                countClasses++;
                sumGrades += grade;
            }
            else{
                isExcluded++;
            }
            if (isExcluded == 1){
                break;
            }
        }
        if (isExcluded == 0){
            System.out.printf("%s graduated. Average grade: %.2f",studentName,sumGrades / 12);
        }
        else {
            System.out.printf("%s has been excluded at %d grade",studentName,countClasses);
        }
    }
}