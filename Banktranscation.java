import java.util.Scanner;
public class Banktranscation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdrawl amount :  ");
        double withdrawamount=sc.nextDouble() ;
        System.out.println("Enter the balance amount:");
        double balance=sc.nextDouble();
        System.out.println("Did you have international transcation account?(True/False)");
        boolean isInternational = sc.nextBoolean() ;
        System.out.println("You have premium Account (True/False)");
        boolean isPremium = sc.nextBoolean();
        System.out.println("Have you completed KYC (True/False)");
        boolean kycCompleted = sc.nextBoolean();
        if(!kycCompleted)
        {
            System.out.println("Complete KYC First");
        }
        else if (withdrawamount > balance)
        {
            System.out.println("Insufficient Balance");
        }
        else if(isInternational && !isPremium)
        {
            System.out.println("Upgrade to premium for international transcation");
        }
        else if(!isPremium && withdrawamount >10000)
        {
            System.out.println("normal user daily limit reached");


        }
        else if(isPremium && withdrawamount>50000)
        {
            System.out.println("preminum user withdraw limit reached");
        }
        else{
            System.out.println("Transcation Approved");
        }
        
    }
    
}
