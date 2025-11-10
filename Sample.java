import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("INVALID MARKS");
        } else if (marks >= 90) {
            System.out.println("EXCELLENT PERFORMANCE");
        } else if (marks >= 75) {
            System.out.println("GOOD JOB");
        } else if (marks >= 50) {
            System.out.println("IMPROVE");
        } else {
            System.out.println("INVALID PASS / FAIL");
        }

        sc.close();
    }
}
