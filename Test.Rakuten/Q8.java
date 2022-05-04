import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Q8 {
    static class CP implements Comparable<CP>{
        int first;
        int second;

        public CP(int first, int second){
            this.first = first;
            this.second = second;
        }

        @Override
        public int compareTo(CP o) {
            if(this.first == o.first)
                return this.second - o.second;
            return this.first - o.first;
        }
    }
    public static List<Integer> getkthSmallestTerm(List<Integer> arr, long k) {
        // Write your code here
        if(arr.size() == 1){
            List<Integer> ans = new ArrayList<>();
            ans.add(arr.get(0));
            ans.add(arr.get(0));
            return ans;
        }

        Collections.sort(arr);

        int tmp = (int) (k / arr.size());

        int cnt = 0;
        for(Integer i : arr){
            if(i == arr.get(tmp))
                cnt++;
        }

        List<Integer> ans = new ArrayList<>();
        ans.add(arr.get(tmp));
        ans.add(arr.get((int) (k % cnt)));

        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
                try {
                    return bufferedReader.readLine().replaceAll("\\s+$", "");
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            })
            .map(String::trim)
            .map(Integer::parseInt)
            .collect(toList());

        long k = Long.parseLong(bufferedReader.readLine().trim());

        List<Integer> result = getkthSmallestTerm(arr, k);

        System.out.println(result.toString());
    }
}