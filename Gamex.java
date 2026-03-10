import java.util.Scanner;
public class Gamex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
        int num= (int)(Math.random()*100);
   
        System.out.println("WELCOME !!!");
       
        int chance=1;
        while(chance<=5)
        {
             System.out.println("Enter any number :");
             int guess=sc.nextInt();
        
            if(guess>num)
            {
                System.out.println("You entered the greater no......plz enter the smaller than the entered number");
            }
            if(guess<num)
            {
                System.out.println("You entered the smaller no......plz enter the greater than the entered number");
            }
            if(guess == num)
            {
                System.out.println("Congratulations🎉 !!!!!!......You won");
                break;
            }
            chance++;
        }
        if(chance>5)
        {
            System.out.println("You lost 😢..!!!!!");
            System.out.println("Correct number is ...." + num);


        }
        System.out.println("Enter your choice :.......\n if you want to play again...Enter 1 to retry \n if you want to Quit the game enter 2 to exit");
        choice=sc.nextInt();

    }while(choice ==1);
    }
}
