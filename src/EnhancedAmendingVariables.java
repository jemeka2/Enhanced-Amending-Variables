import java.util.Scanner;

public class EnhancedAmendingVariables {
    public static void main(String[] args)
    {
        Scanner keybd = new Scanner(System.in);


        //User Input
        System.out.print("Please input your current salary: ");
        double currentSal = keybd.nextDouble();

        System.out.print("Please input number of years: ");
        double numOfYears = keybd.nextDouble();

        //calculations(math is probably wrong)
        double finalSal = ((numOfYears * 0.1) * currentSal) + currentSal;

        //Output
        System.out.println("Your Salary after " + numOfYears + " years will be " + finalSal);
    }
}
