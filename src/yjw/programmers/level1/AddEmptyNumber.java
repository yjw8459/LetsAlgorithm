package yjw.programmers.level1;

import java.util.Arrays;

public class AddEmptyNumber {

    public int solution(int[] numbers) {
        int answer = 45;
        for ( int i = 0; i < numbers.length; i++ ){
            answer -= numbers[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] numbers1 = {1,2,3,4,6,7,8,0};
        int[] numbers2 = {5,8,4,0,6,7,9};
        AddEmptyNumber test = new AddEmptyNumber();
        test.solution(numbers1);
        test.solution(numbers2);
    }

}
