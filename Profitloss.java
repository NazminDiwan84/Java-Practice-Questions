import java.util.Scanner;
public class Profitloss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the selling price:");
        int Sp=sc.nextInt();
        System.out.println("Enter the cost price:");
        int Cp=sc.nextInt();
        if(Sp>Cp)
        {
            int profit=Sp-Cp;
            float profitpercent=((float)profit/Cp)*100;
            System.out.println(" Amount of profit-" +profit);
            System.out.println(profitpercent+"% of profit ");
        }
        else 
        {
            int loss=Cp-Sp;
            float losspercent=((float)loss/Cp)*100;
            System.out.println("Amount of loss-" +loss);
            System.out.println(losspercent+"% of loss.");
        }

    }
    
}
