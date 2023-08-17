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
                System.out.println("Choose 2");
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
}

