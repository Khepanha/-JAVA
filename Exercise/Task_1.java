package com.company;
import java.util.*;
public class Task_1 {

    public static void main(String[] args) {
        System.out.println("Enter the number of credit hour: ");
        Scanner input = new Scanner(System.in);
        int credit = input.nextInt();
        System.out.println("Enter the amount of money: ");
        int money = input.nextInt();
        while (true) {
            System.out.println("Do you play sport? answer: 1(yes)/2(no)");
            int ans = input.nextInt();
            if (ans == 1) {
                System.out.println("Total: " + (credit * 85 + money + 65));
                break;
            }
            if (ans == 2) {
                System.out.println("Total: " + (credit * 85 + money + 65));
                break;
            } else {
                System.out.println("Wrong answer please enter <1> or <2>."?");
                continue;
            }
        }
    }
}