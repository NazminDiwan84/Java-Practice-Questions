import java.util.Scanner;
public class Numberlie {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num>=10 && num<=50)
            System.out.println(num+ " is lies between 10 - 50");
        else
            System.out.println( num+ " is not lies between 10 -50");
    }
    
}
