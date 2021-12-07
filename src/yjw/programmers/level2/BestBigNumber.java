package yjw.programmers.level2;

import java.util.Arrays;
import java.util.Comparator;

public class BestBigNumber {

    public String solution(int[] numbers){
        // 숫자를 문자열로 변환
        String[] result = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = String.valueOf(numbers[i]);
        }


        /**
         * A.compareTo(B)
         * A가 B보다 클 경우 양수 리턴
         * B가 A보다 클 경우 음수 리턴
         * 양수가 리턴 될 경우 뒤로
         * 음수가 리턴 될 경우 앞으로
         *
         * ex) o1 : 10, o2 : 6
         * ((o2 + o1).compareTo(o1 + o2)) : 610.compareTo(106)
         *  - A가 B보다 크므로 o1에 해당하는 10이 다음으로 밀림.
         *
         *  CompareTo 앞부터 한 글자씩 비교함.
         *  A와 B를 각각 위치를 바꿧을 때 값을 비교가 포인트
         */
        Arrays.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(o1);
                System.out.println(o2);
                System.out.println("--");
                return ((o2 + o1).compareTo(o1 + o2));  //A가 B보다 크면 양수 리턴
            }
        });
        Arrays.stream(result).forEach(System.out::print);
        // 0만 여러개 있는 배열의 경우 하나의 0만 리턴
        if(result[0].equals("0")) {
            return "0";
        }

        String answer = "";
        // 정렬된 문자 하나로 합치기
        for (String a : result) {
            answer += a;
        }
        return answer;
    }

}
