package hust.soict.dsai.lab01;
import java.util.Scanner;

public class LinearEquation{
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        if (a == 0 && b == 0){
            System.out.println("The following equation has infinite roots");
        } else if (a == 0 && b != 0){
            System.out.println("The following equation has no root");
        } else{
            System.out.println("The following equation has a root x = " + (-b/a));
        }
        sc.close();
    }
}