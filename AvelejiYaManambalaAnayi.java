//This is a java code that computes the average of four numbers from the user.
import java.util.Scanner;
public class AvelejiYaManambalaAnayi {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Ogwiritsa ntchito alowetse ma namabala anayi
        // Kuonetsa nambala yoyamba
        System.out.print("Lowetsani nambala yoyamba: ");
        double num1 = input.nextDouble();

        // Kuonetsa nambala yachiwiri
        System.out.print("Lowetsani nambala yachiwiri: ");
        double num2 = input.nextDouble();

        // Kuonetsa nambala yachitatu
        System.out.print("Lowetsani nambala yachitatu: ");
        double num3 = input.nextDouble();

        // Kuonetsa nambala yachinayi
        System.out.print("Lowetsani nambala yachinayi: ");
        double num4 = input.nextDouble();

        // Kupeza aveleji ya manambala anayi ali mmwambawa
        double average = (num1 + num2 + num3 + num4) / 4;

        // Kuonetsa zotsatira
        System.out.println("Aveleji ya manambala anayiwa ndi: " + average);

        // Close the scanner
        input.close();
    }
}
