public class Taxcalculation{
    public static void main(String[] args) {
        double salary=850000;
        double tax=0;
        boolean seniorCitizen = false;
        if(!(seniorCitizen )){
            if( salary<=250000)
            {
                System.out.println("No tax");

                }
            else if (salary<=500000)  {
                tax = (salary -250000)* 0.05;
                System.out.println("Tax: " +tax);
                
            }
            else if(salary<=1000000)
            {
                tax= 250000*0.05+(salary - 500000) * 0.20;
                System.out.println("Tax:" +tax);
            }
            else {
                tax = 2500000 *0.05+500000 * 0.20+(salary - 1000000) * 0.30;
                System.out.println("Tax:" + tax);
            }
        }
        else{

        
    if( salary<=300000)
            {
                System.out.println("No tax");

                }
            else if (salary<=500000)  {
                tax = (salary - 300000) * 0.05;
                System.out.println("Tax: " +tax);
                
            }
            else if(salary<=1000000)
            {
                tax= 300000*0.05+(salary - 500000) * 0.20;
                System.out.println("Tax:" +tax);
            }
            else {
                tax = 3000000 *0.05+500000 * 0.20+(salary - 1000000) * 0.30;;
                System.out.println("Tax:" + tax);
            }
        }
    }
}
    

