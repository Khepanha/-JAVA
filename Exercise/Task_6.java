package com.company;
import java.util.*;
public class Task_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Etnter the number of page:");
        int n = input.nextInt();
        System.out.println("Enter the number of page the you want turn to:");
        int p = input.nextInt();
        int ans_1 = front(n,p);
        int ans_2 = back(n,p);
        if (ans_1 < ans_2){
            System.out.println("The number of paper from front: " + front(n,p));
        }
        if (ans_1 > ans_2){
            System.out.println("The number of paper from back: " + back(n,p));
        }
    }
    public static int front(int n, int p) {
        int ans_1 = 0;
        int k = 0;
        for (int i = 1; i <= n; i += 1) {
            k += 1;
            if (i == p) {
                if (i % 2 == 0) {
                    ans_1 += k/2;
                    break;
                } else {
                    ans_1 += (k + 1) / 2;
                    break;
                }
            }
        }
        return ans_1;
    }
    public static int back(int n, int p) {
        int ans_2 = 0;
        int j = 0;
        for (int i = n; i >= 1; i -= 1) {
            j += 1;
            if (i == p) {
                if (i % 2 == 0) {
                    ans_2 += j / 2;
                    break;
                } else {
                    ans_2 += (j + 1) / 2;
                    break;
                }
            }
        }
        return ans_2;
    }
}
