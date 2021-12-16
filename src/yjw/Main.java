package yjw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

/**
 * |x| : x 절대값.
 */
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long total = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            list.add(Integer.parseInt(st.nextToken()));
        }

        list.sort(Comparator.naturalOrder());
        for ( int i = 0; i < list.size(); i++ ){
            total += Math.abs( list.get(i) - (i+1));
        }
        System.out.println(total);
    }
}
