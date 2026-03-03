public class Electricitybill {
    public static void main(String[] args) {
        int units = 180;
        double bill = 0;

        if (units <= 100) {
            bill = units * 5;
        }
        else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        }
        else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        System.out.println("Total Bill: " + bill + " rupees");
    }

    
}
