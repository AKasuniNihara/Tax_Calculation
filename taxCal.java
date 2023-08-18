import java.util.Scanner;

public class taxCal {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("==============================\n\t[1] Withholding Tax\n\t[2] Payable Tax\n\t[3] Income Tax\n\t[4] Social Security Contribution Levy (SSCL Tax)\n\t[5] Leasing Payment\n\t[6] Exit");
        
        System.out.print("Enter an option to continue -> ");
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                WithholdingTax();
                //System.out.println("Choose 1");
                break;
            case 2:
                PayableTax();
                //System.out.println("Choose 2");
                break;
            case 3:
                System.out.println("Choose 3");
                break;
            case 4:
                System.out.println("Choose 4");
                break;
            case 5:
                System.out.println("Choose 5");
                break;
            case 6:
                System.out.println("Choose 6");
                break;
            default:
                System.out.println("Invalid input");
        }
        
        sc.close();
    }
    
    public static void WithholdingTax(){
        System.out.println("\t\tWithholding Tax");
        System.out.println("\t[1] Rent Tax\n\t[2] Bank Interest Tax\n\t[3] Divided Tax\n\t[4] Exit");
        System.out.print("Enter an option to continue -> ");
        
        int op = sc.nextInt();
        
        switch(op){
            case 1:
                RentTax();
                //System.out.println("Choose 1");
                break;
            case 2:
                System.out.println("Choose 2");
                break;
            case 3:
                System.out.println("Choose 3");
                break;
            case 4:
                System.out.println("Choose 4");
                break;
            default:
                System.out.println("Invalid input");
        }
        
    }
    
    public static void RentTax(){
        System.out.print("Enter your rent \t : ");
        float rent = sc.nextFloat();
        float taxRate = 0.10f;
        if(rent > 100000){
            float tax = rent * taxRate;
            String taxString = String.format("%.2f",tax);
            System.out.println("You have to pay Rent Tax : " + taxString);
        }
        else{
            System.out.println("\tYou do not have to pay rent tax...");
        }
    }
    
    public static void PayableTax(){
        System.out.print("Enter monthly income : ");
        int income = sc.nextInt();
        double tax = 0;
        double taxRate = 0;
        if(income <= 100000){
            System.out.println("No tax");
        }
        else if(income <= 141667){
            taxRate = 0.06;
            tax = ( (income - 1416667)*taxRate );
            System.out.println("Tax : "+Math.round(tax));
        }
        else if(income <= 183333){
            taxRate = 0.12;
            tax = ( (income - 1416667)*taxRate ) + 2500;
            System.out.println("Tax : "+Math.round(tax));
        }
        else if(income <= 225000){
            taxRate = 0.18;
            tax = ( (income - 183333)*taxRate ) + 7500;
            System.out.println("Tax : "+Math.round(tax));
        }
        else if(income <= 266667){
            taxRate = 0.24;
            tax = ( (income - 225000)*taxRate ) + 15000;
            System.out.println("Tax : "+Math.round(tax));
        }
        else if(income <= 308333){
            taxRate = 0.3;
            tax = ( (income - 266667)*taxRate ) + 25000;
            System.out.println("Tax : "+Math.round(tax));
        }
        else{
            taxRate = 0.36;
            tax = ( (income - 308333)*taxRate ) + 37500;
            System.out.println("Tax : "+Math.round(tax));
        }
    }
}

