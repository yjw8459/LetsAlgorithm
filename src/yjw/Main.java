package yjw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();
        long sum = 0;
        for ( int i = 0; i < n; i++ ){
            st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
            sum += (i+1);
        }
        long max = list.stream().reduce(0, Integer::sum);

        System.out.println(sum - max);
        br.close();
    }
}
