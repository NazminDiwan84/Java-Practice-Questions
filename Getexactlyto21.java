import java.util.Scanner;

public class Getexactlyto21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        
        
        do {
            int bucket = 10;
            boolean win=false;
            System.out.println("Bucket contains 10 litres you have to fill the bucket upto 21 litres \n But you have only 7 chances  ");
            int chance = 1;

            while (chance <= 7) {

                int num = (int)(Math.random() * 20)+1;
                System.out.println("You have given "+num +" litres of water now");

                System.out.println("Choose operator (+,-,*) how to use  the water which is given to you");
                char op = sc.next().charAt(0);

                switch (op) {
                    case '+':
                        bucket += num;
                        System.out.println("Added " + num+" litres of water");
                        break;

                    case '-':
                        bucket -= num;
                        System.out.println("Removed " + num+" litres of water");
                        break;

                    case '*':
                        bucket = bucket * 2;
                        System.out.println("Bucket doubled"+num+" litres of water");
                        break;

                    default:
                        System.out.println("Invalid operator");
                }

                System.out.println("Bucket = " + bucket);
                chance++;

                if(bucket == 21){
                    System.out.println("🎉 Congratulations! Bucket reached 21");
                    win=true;
                    break;
                }

                if(bucket > 50){
                    System.out.println("Bucket Overflow");
                    break;
                }
                
                
            }
            if(!win && chance >7 ){
            System.out.println("The chances are over ..you lose the game");
            }

            System.out.println("Enter choice: 1.Retry 2.Exit");
            choice = sc.nextInt();

        } while(choice == 1);
    }
}