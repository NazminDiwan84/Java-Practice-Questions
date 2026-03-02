import java.util.Scanner;
public class Studentgrade {
    public static void main(String[] args) {
        System.out.println("Enter the Score:");
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        if(score>=90){
            System.out.println("Grade A");
        }
        else if(score>=75){
            System.out.println("Grade B");

        }
        else if(score>50)
        {
            System.out.println("Grade C");
        }
        else{
            System.out.println("Fail");
        }
        
         


    }
    
}
