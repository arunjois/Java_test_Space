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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr, int n) {
        float positive=0, negative=0, zero=0;
        for( int i=0;i<n;i++) {
            if (arr.get(i) > 0 )
                positive++;
            else if (arr.get(i) == 0 )
                zero++;
            else if (arr.get(i) < 0)
                negative++;
                
        }
        float pos=positive/n, neg=negative/n, zer = zero /n;
        
        System.out.printf("%.6f\n", pos);
        System.out.printf("%.6f\n", neg);
        System.out.printf("%.6f\n", zer);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr,n);

        bufferedReader.close();
    }
}

