package hust.soict.dsai.lab01;
import java.util.Arrays;
import java.util.Scanner;

public class Ex_6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double average = (double) sum / n;

        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("Sum: " + sum);
        System.out.println("Average value: " + average);
        sc.close();
    }
}
