//https://www.hackerrank.com/challenges/java-stdin-stdout/problem

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s="";
        s=scan.nextLine();
        
        int i = scan.nextInt();
       
        // Write your code here.
        Double d=scan.nextDouble();
          

        System.out.println("String: " +s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
