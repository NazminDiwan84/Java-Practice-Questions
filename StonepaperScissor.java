import java.util.Scanner;
public class StonepaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
        int num=(int)(Math.random() *3);
        String computer="";
        if(num==0)
        {
            computer="stone";

        }
        else if(num==1)
        {
            computer ="paper";
        }
        else{
            computer="scissor";
        }            
        
        System.out.println("Welcome!!!! \n Let's play the game ‼");
        System.out.println(" Enter your Choice...\n (stone, paper ,scissor)");
        String user=sc.nextLine().toLowerCase();
        if(user.equals(computer))
        {
            System.out.println("Match Draw....Tie👀  \n computer choice is "+computer);
        }
        else if(user.equals("stone") && computer.equals("scissor") ||
                 user.equals("paper") && computer.equals("stone") ||
                 user.equals("scissor") && computer.equals("paper"))
                  {
                    System.out.println(" Congratulation 🎇🎉\n You won..... \n Computer choice is " +computer);
                 }
        else{
            System.out.println("Computer won✨🎉.. \n Computer choice is " +computer);
        }
        System.out.println("Enter your choice :\n 1. Retry(If you want to play again..) \n 2.Exit (if you want to Quit the game)");
        choice=sc.nextInt();
        sc.nextLine();

    }while(choice ==1);
    System.out.println("Game Ended");


    }
    
}
