import java.util.Scanner;
public class Netsalary {
    public static void main(String[] args) {
        System.out.println("Enter the basic salary:");
        Scanner sc=new Scanner(System.in);
        double basic=sc.nextDouble();
        double hra= basic*0.20;
        double da=basic*0.50;
        double bonus=0;
        if(basic>50000)
        {
            bonus=basic*0.05;
        }
        double netsalary=basic+hra+da+bonus;
        System.out.println("Net Salary:" +netsalary);
    }

    
}
