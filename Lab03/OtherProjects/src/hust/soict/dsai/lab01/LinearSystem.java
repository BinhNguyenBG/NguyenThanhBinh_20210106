package hust.soict.dsai.lab01;
import java.util.Scanner;

public class LinearSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a11: ");
        double a11 = sc.nextDouble();
        System.out.print("Enter a12: ");
        double a12 = sc.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Enter a21: ");
        double a21 = sc.nextDouble();
        System.out.print("Enter a22: ");
        double a22 = sc.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = sc.nextDouble();
        double D = a11*a22 - a12*a21;
        double D_x = b1*a22 - b2*a12;
        double D_y = a11*b2 - a21*b1;
        if (D != 0){
            System.out.println("The following system has a unique solution: x = " + (D_x/D) + " and y = " + (D_y/D));
        }
        else{
            if (D_x == 0 && D_y == 0){
                System.out.println("The following system has infinite solutions");
            }
            else{
                System.out.println("The following system has no solution");
            }
        }
        sc.close();
    }
}
