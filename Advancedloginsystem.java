import java.util.Scanner;

public class Advancedloginsystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Set Your username & password: ");
        String username = sc.nextLine();
        String password = sc.nextLine();

        boolean captchaverified = true;
        int failedattempts = 0;
        boolean accountlocked = false;
        while (true) { 
            if(!accountlocked){
            if(failedattempts<3)
            {
                System.out.println("Enter username & password: ");
                String inputusername=sc.nextLine();
                String inputpassword = sc.nextLine();
                if(inputusername.equals(username))
                {
                    if(inputpassword.equals(password))
                    {
                        if(captchaverified)
                        {
                            System.out.println("Login Successful !!!!!");
                            break;
                        }
                        else{
                            System.out.println("Captcha not verified");
                        }
                    }
                    else{
                        System.out.println("Invalid password " );
                        System.out.println("Enter Again....");
                        failedattempts+=1;
                    }
                }
                else{
                    System.out.println("Invalid username");
                }
            }
            else if(failedattempts>=3)
            {
                accountlocked = true;
                System.out.println("Account Locked...... no more attempts");
                break;
            }
            
        }
    }
}
}