package hust.soict.dsai.lab01;
import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();
        if (a == 0){
            if (b != 0){
                System.out.println("The following equation has a unique solution x = " + (-c/b));
            } else if( b == 0){
                if (c == 0){
                    System.out.println("The following equation has infinite solutions");
                } else{
                    System.out.println("The following equation has no solution");
                }
            }
        }
        else{
            double delta = b*b - 4*a*c;
            if (delta > 0){
                double x_1 = (-b + Math.sqrt(delta))/(2*a);
                double x_2 = (-b - Math.sqrt(delta))/(2*a);
                System.out.println("The following equation has two solutions x_1 = " + x_1 + " and x_2 = " + x_2);
            }
            else if (delta == 0){
                double x = (-b/(2*a));
                System.out.println("The following equation has a double-root solution x = " + x);
            }
            else{
                System.out.println("The following equation has no solution");
            }
        }
        sc.close();
    }
}
