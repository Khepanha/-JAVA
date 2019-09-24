package com.company;
import java.util.*;
public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        while (true){
            System.out.println("Enter the amount of Monica, keyboard and USB:");
            String amount = input.nextLine();
            String[] arr = amount.split(" ");
            int s = Integer.parseInt(arr[0]);
            int n = Integer.parseInt(arr[1]);
            int m = Integer.parseInt(arr[2]);
            if (arr.length == 3 && amount.contains(" ") && n <= 1000 && m <= 1000 && s <= 1000000 ){
                while (true){

                    System.out.println("Enter the price of keyboard:");
                    String price = input.nextLine();
                    System.out.println("Enter the price of USB:");
                    String USB = input.nextLine();
                    String[] arr_price = price.split(" ");
                    String[] arr_USB = USB.split(" ");
                    if (arr_price.length == n){
                        for (int i = 0; i < n ; i += 1){
                            Integer.parseInt(arr_price[i]);
                        }
                        System.out.println(Arrays.asList(arr_price));
                    }else{
                        System.out.println("Warning: Please enter only " + n + " digits separate by spaces:");
                        continue;
                    }
                    System.out.println("hello world");
                    break;
                }
            }else{
                System.out.println("Warning: Please enter only 3 digits separated by 2 spaces.");
                continue;
            }
        }
    }
}
