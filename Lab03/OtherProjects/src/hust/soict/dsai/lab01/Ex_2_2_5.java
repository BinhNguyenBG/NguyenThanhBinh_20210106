package hust.soict.dsai.lab01;
import java.util.Scanner;

public class Ex_2_2_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num_1 = sc.nextDouble();
        double num_2 = sc.nextDouble();
        System.out.println("Sum: " + (num_1 + num_2));
        System.out.println("Difference: " + (num_1 - num_2));
        System.out.println("Product: " + (num_1 * num_2));
        if (num_2 != 0){
            System.out.println("Quotient: " + (num_1 / num_2));
        } else{
            System.out.println("Quotient: error");
        }
        sc.close();
    }
}