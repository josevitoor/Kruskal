package com.kruskal;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int option = -1;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Cases cases = new Cases();
        while (option != 0){
            System.out.println("==================================");
            System.out.println("Kruskal's Algorithm");
            System.out.println("1 - Case 1.");
            System.out.println("2 - Case 2.");
            System.out.println("3 - Case 3.");
            System.out.println("4 - Case 4.");
            System.out.println("0 - Leave application.");
            System.out.println("==================================");
            option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Case 1");
                    System.out.println(cases.createGraphCase1());
                    break;
                case 2:
                    System.out.println("Case 2");
                    System.out.println(cases.createGraphCase2());
                    break;
                case 3:
                    System.out.println("Case 3");
                    System.out.println(cases.createGraphCase3());
                    break;
                case 4:
                    System.out.println("Case 4");
                    System.out.println(cases.createGraphCase4());
                    break;
                case 0:
                    System.out.println("End");
                    break;
                default:
                    System.out.println("Invalid test");
            }
        }
    }
}
