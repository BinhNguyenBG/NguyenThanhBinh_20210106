package hust.soict.dsai.lab01;
import java.util.Scanner;

public class Ex_6_6 {
    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] matrix_1 = new int[n][m];
        int[][] matrix_2 = new int[n][m];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix_1[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix_2[i][j] = sc.nextInt();
            }
        }
        System.out.println();

        int[][] res = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                res[i][j] = matrix_1[i][j] + matrix_2[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}

