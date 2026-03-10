// Write a program that:

// Takes a number N

// Print numbers 1 to N

// For each number:

// If divisible by 3 → Fizz

// If divisible by 5 → Buzz

// If divisible by 3 and 5 → FizzBuzz

// Otherwise print the number

// Example (N = 15)

// 1
// 2
// Fizz
// 4
// Buzz
// Fizz
// ...
import java.util.Scanner;
public class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("Fizzbuzz");

            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {

                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }


            }
        }
    }

    

