package yjw.study.stream;

import java.util.stream.IntStream;

public class IntStreamStudy {
    static int sum = 0;

    public static void rangeClosed(){

        /**
         * rangeClosed
         * 첫 번째 매개 값부터 두 번째 매개 값까지 순차적으로 IntStream을 리턴한다.
         * range는 두번 쨰 매개 값은 포함하지 않는다.
         */
        IntStream stream = IntStream.rangeClosed(1 ,100);
        stream.forEach(a -> sum+=a);
    }
}
