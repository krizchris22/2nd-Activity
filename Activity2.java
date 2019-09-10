package activity2;

import java.util.Scanner;

public class Activity2 {

    public static void main(String[] args) {
        
        Scanner in= new Scanner(System.in);
        String EmployeeName;
        final float FederalIncome = 0.15f, StateTax =0.035f, SocialSecurityTax = 0.0575f ,Medicare_MedicaidTax =0.0275f, PensionPlan =0.05f, HealthInsurance =75.00f;
        float GrossAmount, FederalTax, State_Tax, Social_Security_Tax, medicare_medicaid, pensionPlan, net_pay, result;
        
        System.out.print("Name: ");
        EmployeeName = in.nextLine();
        System.out.print("Gross Amount: ");
        GrossAmount = in.nextFloat();
        FederalTax = GrossAmount * FederalIncome;
        System.out.print("Federal Tax: " + FederalTax);
        State_Tax = GrossAmount * StateTax;
        System.out.println();
        System.out.printf("State Tax: %.2f" ,State_Tax);
        Social_Security_Tax = GrossAmount * SocialSecurityTax;
        System.out.println();
        System.out.printf("Social Security Tax: %.2f" ,Social_Security_Tax);
        medicare_medicaid = GrossAmount * Medicare_MedicaidTax;
        System.out.println();
        System.out.printf("Medicare/Medicaid tax: %.2f" ,medicare_medicaid);
        pensionPlan = GrossAmount * PensionPlan;
        System.out.println();
        System.out.printf("Pension Plan: %.2f" ,pensionPlan);
        System.out.println();
        System.out.printf("Health Insurance: %.2f"  ,HealthInsurance);
        System.out.println();
        net_pay = FederalTax + State_Tax + Social_Security_Tax + medicare_medicaid + pensionPlan + HealthInsurance;
        result = GrossAmount - net_pay;
        System.out.printf("Net Pay: %.2f" ,result);
        System.out.println();
        
        //2nd question
        int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, runningSum1, runningSum2, runningSum3, runningSum4, runningSum5, runningSum6, runningSum7, runningSum8, runningSum9;
        
        
        System.out.println("Enter 1st number: ");
        n1 = in.nextInt();
        System.out.println("Enter 2nd number: ");
        n2 = in.nextInt();
        System.out.println("Enter 3rd number: ");
        n3 = in.nextInt();
        System.out.println("Enter 4th number: ");
        n4 = in.nextInt();
        System.out.println("Enter 5th number: ");
        n5 = in.nextInt();
        System.out.println("Enter 6th number: ");
        n6 = in.nextInt();
        System.out.println("Enter 7th number: ");
        n7 = in.nextInt();
        System.out.println("Enter 8th number: ");
        n8 = in.nextInt();
        System.out.println("Enter 9th number: ");
        n9 = in.nextInt();
        System.out.println("Enter 10th number: ");
        n10 = in.nextInt();
        
        runningSum1 = n1 + n2;
        runningSum2 = runningSum1 + n3;
        runningSum3 = runningSum2 + n4;
        runningSum4 = runningSum3 + n5;
        runningSum5 = runningSum4 + n6;
        runningSum6 = runningSum5 + n7;
        runningSum7 = runningSum6 + n8;
        runningSum8 = runningSum7 + n9;
        runningSum9 = runningSum8 + n10;
        System.out.println();
        System.out.println("Running Sum: ");
        System.out.print(n1 + "\t");
        System.out.print(runningSum1 + "\t");
        System.out.print(runningSum2 + "\t");
        System.out.print(runningSum3 + "\t");
        System.out.print(runningSum4 + "\t");
        System.out.print(runningSum5 + "\t");
        System.out.print(runningSum6 + "\t");
        System.out.print(runningSum7 + "\t");
        System.out.print(runningSum8 + "\t");
        System.out.print(runningSum9 + "\t");
        System.out.println();
        
          
    }
    
}
