package com.company;
import java.util.*;

public class Task_2
{
    public static void main(String[] args) {
        System.out.println("Enter the number of dollars");
        Scanner input = new Scanner(System.in);
        int dollars = input.nextInt();
        dollars *= 4000;
        System.out.println("Enter whether how many kind of money in RIEL that you want to change: ");
        int num_riels = input.nextInt();
        while (true)
        {
            String All_kind = "";
            int i = 0;
            int num_kinds = 0;
            while (true)
            {
                System.out.println("Enter the kind of money that you want to change from DOLLARS: (2000s, 1000s, 500s or 100s)");
                int kind = input.nextInt();
                if (kind == 2000 || kind == 1000 || kind == 500 || kind == 100)
                {
                    i += 1;
                    System.out.println("Enter the number of " + kind);
                    int num_kind = input.nextInt();
                    num_kinds += num_kind * kind;
                    All_kind += kind + ": " + num_kind;
                    if (i == num_riels)
                    {
                        break;
                    }
                }
                else
                {
                    System.out.println("Invalid kind of money, the money must be(2000s, 1000s, 500s, or 100s)");
                    continue;
                }
            }
            if (num_kinds == dollars)
            {
                System.out.println(All_kind);
                break;
            }
            else
            {
                System.out.println("Invalid the number of kind!");
                continue;
            }
        }
    }
}
