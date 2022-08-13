import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    // Write your code here
    char blank = ' ';
    char numberSign='#';
    int count = 0;
    for(int j = 0 ; j<n ; j++){
      for(int i = 1; i<n-j ;i++){
    System.out.print(blank); 
    count +=1; 
    }
      for(int i = 0; i<n-count ;i++){  
    System.out.print(numberSign);
      }
      System.out.println();
      count=0 ;
    }
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
