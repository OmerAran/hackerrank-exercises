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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    String time = s.substring(0,8);
    String zone = s.substring(8,10);
    if(zone.equals("PM")){
      String strHour = time.substring(0,2);
      String strHourLast =time.substring(2,8);
      
      int hour=0;
      hour = Integer.parseInt(strHour);
      if(hour!=12)
      hour+=12;
      
      
      String newHour= Integer.toString(hour);
        
      newHour = newHour.concat(strHourLast);
      time = newHour;
      return time ;
    }
    if(zone.equals("AM")){
    String strHour = time.substring(0,2);
    String strHourLast =time.substring(2,8);

    if(strHour.equals("12"))
          strHour = "00";
          
    strHour = strHour.concat(strHourLast);
    time=strHour;      
    }
    return time;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

