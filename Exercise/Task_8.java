package com.company;
import java.util.*;
public class Task_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Scanner input_2 = new Scanner(System.in);
        System.out.println("Enter the number of test case:");
        int T = input.nextInt();
        for (int k = 0; k < T; k += 1) {
            while (true) {
                System.out.println("Enter the number of student in the class and the cancelation threshold:");
                String N_k = input_2.nextLine();
                String[] narr = N_k.split(" ");
                int N = Integer.parseInt(narr[0]);
                int K = Integer.parseInt(narr[1]);
                if (narr.length == 2 && N_k.contains(" ") && N <= 1000 && K <= N) {
                    while (true) {
                        System.out.println("Enter the attendance of the student:");
                        String attd = input_2.nextLine();
                        String[] attd_arr = attd.split(" ");
                        if (attd_arr.length == N && attd.contains(" ")) {
                            int j = 0;
                            for (int i = 0; i < N; i += 1) {
                                int check = Integer.parseInt(attd_arr[i]);
                                if (check >= 0) {
                                    j += 1;
                                } else {
                                    continue;
                                }
                            }
                            if (j >= K) {
                                System.out.println("No");
                            } else {
                                System.out.println("Yes");
                            }
                            System.out.println("Au Revoir!!");
                            break;
                        } else {
                            System.out.println("WARNING!!: Please enter only " + N + " digits separate by space.");
                            continue;
                        }
                    }
                    break;
                } else {
                    System.out.println("WARNING!!: Please enter only 2 digits separate by space and 2nd digit less than 1st digit.");
                    continue;
                }
            }
        }
    }
}
