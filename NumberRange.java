import java.util.Scanner;
public class NumberRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num>=1 && num<=100 && !(num>=40 && num<=60))
            System.out.println("Number is in range");
        else
            System.out.println("Number is not in range");
    }
    
}
