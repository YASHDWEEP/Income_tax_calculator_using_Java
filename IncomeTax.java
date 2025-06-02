import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your annual income (in rupees): ");
        long income = sc.nextLong();
        System.out.println("DEBUG: Income entered = " + income);

        double tax = 0;

        if (income <= 400000) {
            System.out.println("Income <= 4,00,000, no tax.");
            tax = 0;
        } else if (income <= 800000) {
            System.out.println("Income between 4,00,001 and 8,00,000");
            tax += (income - 400000) * 0.05;
        } else if (income <= 1200000) {
            System.out.println("Income between 8,00,001 and 12,00,000");
            tax += 400000 * 0.05;
            tax += (income - 800000) * 0.10;
        } else if (income <= 1600000) {
            System.out.println("Income between 12,00,001 and 16,00,000");
            tax += 400000 * 0.05;
            tax += 400000 * 0.10;
            tax += (income - 1200000) * 0.15;
        } else if (income <= 2000000) {
            System.out.println("Income between 16,00,001 and 20,00,000");
            tax += 400000 * 0.05;
            tax += 400000 * 0.10;
            tax += 400000 * 0.15;
            tax += (income - 1600000) * 0.20;
        } else if (income <= 2400000) {
            System.out.println("Income between 20,00,001 and 24,00,000");
            tax += 400000 * 0.05;
            tax += 400000 * 0.10;
            tax += 400000 * 0.15;
            tax += 400000 * 0.20;
            tax += (income - 2000000) * 0.25;
        } else {
            System.out.println("Income above 24,00,000");
            tax += 400000 * 0.05;
            tax += 400000 * 0.10;
            tax += 400000 * 0.15;
            tax += 400000 * 0.20;
            tax += 400000 * 0.25;
            tax += (income - 2400000) * 0.30;
        }

        double cess = tax * 0.04;
        double totalTax = tax + cess;

        System.out.println("Basic Tax: " + tax);
        System.out.println("Cess (4%): " + cess);
        System.out.println("Total Tax Payable: " + totalTax);
        sc.close();
    }
    
}
