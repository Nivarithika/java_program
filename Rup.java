import java.util.Scanner;

public class Rup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Example rule: salary > 20000 and age > 25
        if (salary > 20000 && age > 25) {
            System.out.print("ENTER THE REQUIRED LOAN AMOUNT: ");
            int loan = sc.nextInt();

            if (loan <= 50000) {
                System.out.println("YOU ARE ELIGIBLE");
            } else {
                System.out.println("MAXIMUM LOAN AMOUNT IS 50000");
            }
        } else {
            System.out.println("YOU ARE NOT ELIGIBLE");
        }

        sc.close();
    }
}
