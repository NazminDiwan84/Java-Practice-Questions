import java.util.Scanner;
public class Discountcalc {
    public static void main(String[] args) {
        System.out.println("Enter the Purchase Amount:-");
        Scanner sc=new Scanner(System.in);
        double amount=sc.nextDouble();
        double discount;
        if(amount>=5000)
        {
             discount = amount *  0.20 ;
            System.out.println("Discount:" +discount );

        }
        else if(amount>=2000)
        {
            discount=amount*0.10;
            System.out.println("Discount:" +discount );


        }
        else{
            discount=amount*0.05;
             System.out.println("Discount:" +discount );

        }
        double finalamount;
        finalamount=amount-discount;
        System.out.println("Final Amount:" +finalamount );
    }
    
}
