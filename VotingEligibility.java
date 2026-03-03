public class VotingEligibility {
    public static void main(String[] args) {
        int age=20;
        boolean hasvoterID = true;
        if(age>=18 && hasvoterID==true)
        {
            System.out.println("Eligible to vote");

        }
        else if(age>=18 && !(hasvoterID==true))
        {
            System.out.println("Voter ID Required");
        }
        else{
            System.out.println("Not Eligible");
        }
        
     
        }
             
    
}
