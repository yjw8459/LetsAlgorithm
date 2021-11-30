package yjw.backjun;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BlackJack {

    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(token.nextToken());    //카드 갯수
        int k = Integer.parseInt(token.nextToken());    //블랙잭 수
        ArrayList<Integer> list = new ArrayList<>();
        token = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++){
            list.add(Integer.parseInt(token.nextToken()));
        }
        Collections.sort(list);
        int m = k-list.get(0);
        int avg = m/2;
        ArrayList<Integer> absList = new ArrayList<>();
        for ( int i = 1; i < list.size(); i++ ){
            absList.add(Math.abs( avg - list.get(i) ));
        }
        for (Integer target: absList) {
            int min = -1;
            int key =  0;
            for ( int i = 0; i < absList.size(); i++ ){
                if ( absList.get(i) <= min ){
                    min = absList.get(i);
                    key = i;
                }
            }
            absList.remove(key);
        }

    }

    public static void main(String[] args) {
        try {
            BlackJack.solution();
        }
        catch (Exception e){ e.printStackTrace(); }
    }
    //21 - 5 = 16 8
}
