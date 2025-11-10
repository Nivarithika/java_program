import java.util.Scanner;

public class Jp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter traffic light color (red/yellow/green): ");
        String colour = sc.nextLine().trim().toLowerCase();

        if (colour.equals("red")) {
            System.out.println("STOP");
        } else if (colour.equals("yellow")) {
            System.out.println("READY TO GO");
        } else if (colour.equals("green")) {
            System.out.println("GO");
        } else {
            System.out.println("INVALID INPUT");
        }

        sc.close();
    }
}
