package yjw.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Boxed {

    public void boxed(){
        int[] arr = { 1, 2, 3 };
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        /**
         * 단계 1 IntStream화
         */
        IntStream test = Arrays.stream(arr);


        /**
         * 단계 2 Stream<Integer>화
         * .boxed : int, long, double 원시데이터 요소를 Integer, Long, Double
         * 래퍼 클래스로 박싱해서 Stream을 생성한다.
         */
        Stream<Integer> test2 = Arrays.stream(arr).boxed();

        /**
         * 단계 3 Stream -> Integer[]
         * .toArray를 통해서 배열로 변환한다.
         */
        Integer[] test3 = test2.toArray(Integer[]::new);
    }
}
