import java.util.Scanner;

public class BudgetCalculatorProject{

    private static final double SALARY =4000.0;
    private static final double SAVINGS_PERCENT =0.20;
    private static final double RENT_PERCENT =0.30;
    private static final double GROCERIES_PERCENT =0.15;
    private static final double ENTERTAINMENT_PERCENT =0.10; 
    public static void main(String[] arg){

        double monthlySalary = SALARY;
        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double remainingBalance;



        //Calculations


        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIES_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;

        remainingBalance = monthlySalary - totalExpenses;
        System.out.println();
        System.out.printf("Monthly Salary: $%.2f",monthlySalary);
        System.out.println();
        System.out.printf("Amount Saved: $%.2f",savedAmount);
        System.out.println();
        System.out.printf("Amount spent on rent: $%.2f",rentAmount);
        System.out.println();
        System.out.printf("Amount spent on groceries: $%.2f",groceriesAmount);
        System.out.println();
        System.out.printf("Amount spent on entertainment: $%.2f",entertainmentAmount);
        System.out.println();
        System.out.printf("Total Expenses: $%.2f",totalExpenses);
        System.out.println();
        System.out.printf("Remaining balance: $%.2f",remainingBalance);
        System.out.println();



    }
}