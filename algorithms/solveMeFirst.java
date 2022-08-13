import java.io.*;
import java.util.*;


public class Solution {
static int solveMeFirst(int a, int b){
    return a+b ;
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x,y ;
        Scanner sc = new Scanner(System.in);
        //System.out.print("a= ");
        x = sc.nextInt();
        //System.out.print("\n b= ");
        y=sc.nextInt();
        int result = solveMeFirst(x,y) ;
        System.out.println(result);
    }
}

