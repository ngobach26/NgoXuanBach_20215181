package exercise_lab1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for(int i = 1; i <= n; i++){
            for(int j = n-i; j >= 1; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
