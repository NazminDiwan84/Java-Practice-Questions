import java.util.Scanner;
public class MultipletableGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        if(n % 2==0){
        for(int i=1;i<=10;i++)
        {
            System.out.println(n * i);
        }
    }
    else{

        for(int i=10;i>=1;i--)
        {
            System.out.println(n * i);
        }
    }
    }
    
}
