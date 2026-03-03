import java.util.Scanner;
public class Validtriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three sides of Triangle:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b>c && a+b>c && b+c>a)
        {
            System.out.println("Valid Triangle");

                }
        else{
            System.out.println("Invalid Triangle");
        }

    }
    
}
