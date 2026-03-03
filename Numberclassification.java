import java.util.Scanner;
public class Numberclassification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a=sc.nextInt();
        if(a==0)
        {
            System.out.println("Number is zero");
          
        }
       else if(a % 2 == 0)
        {
            if(a>0)
            {
                System.out.println(a+" is positive even number");
            }
            else{
                System.out.println(a+" is negative even number");
            }
        }
        else{
            if(a>0)
            {
                System.out.println(a+" is positive odd number");
            }
            else{
                System.out.println(a+" is negative odd");
            }
        }
    }
    
}
