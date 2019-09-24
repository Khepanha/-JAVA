package com.company;
import java.util.*;

public class Task_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x_1:");
        int x_1 = input.nextInt();
        System.out.println("Enter n1:");
        int n1 = input.nextInt();
        System.out.println("Enter x_2:");
        int x_2 = input.nextInt();
        System.out.println("Enter n2:");
        int n2 = input.nextInt();
        int j = 1;
        for (int i = 1; i <= 1000; i += 1){
            x_1 += n1;
            x_2 += n2;
            if (x_1 == x_2){
                System.out.println("Yes");
                break;
            }else{
                j += 1;
            }
            if (j == 1000){
                System.out.println("No");
                break;
            }
        }

    }
}
