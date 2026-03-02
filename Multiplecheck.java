import java.util.Scanner;

public class Multiplecheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num%3==0 && num%7==0)
        {
            System.out.println( num+ " is multiple of both 3 and 7");
        }
        else if(num%3==0)
        {
            System.out.println(num+" is multiple of 3");
        
        }
        else if(num%7==0)
        {
            System.out.println(num+" is multiple of 7");

        }
        else{
            System.out.println(num+ "is not a multiple of 3 or  7");
        }
    }
    
}
