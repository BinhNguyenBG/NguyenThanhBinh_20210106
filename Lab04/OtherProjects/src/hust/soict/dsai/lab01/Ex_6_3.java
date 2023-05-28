package hust.soict.dsai.lab01;


import java.util.Scanner;
public class Ex_6_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 0; j < (2*n-1-2*(i-1)-1)/2; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*(i-1)+1); j++){
                System.out.print("*");
            }
            for (int j = 0; j < (2*n-1-2*(i-1)-1)/2; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
