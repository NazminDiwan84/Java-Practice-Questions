
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a & b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter operator:");
        System.out.println("+ Addition");
        System.out.println("- Subtraction ");
        System.out.println("* Multiplication");
        System.out.println("/ Division");
        char op=sc.next().charAt(0);
        switch(op){
            case '+':
                System.out.println("a+b:" +(a+b));
                break;
            case '-':
                System.out.println("a - b:" +(a-b));
                break;
            case '*':
                System.out.println("a*b: "+(a*b) );
                break;
            case '/':
                if(b>0)
                    System.out.println("a /b:"+(a/b));
                else
                    System.out.println("Cannot divide by zero");
                break;



        }

        
    }
    
}
