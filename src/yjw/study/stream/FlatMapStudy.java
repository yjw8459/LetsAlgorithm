package yjw.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FlatMapStudy {

    public static void flatMapToInt(){
        List<String> list = Arrays.asList("10,20,30", "40,50,60");
        list.stream().flatMapToInt(data -> {
            String[] arr = data.split(",");
            int[] intArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++){
                intArr[i] = Integer.parseInt(arr[i]);
            }
            return Arrays.stream(intArr);
        }).forEach(number -> System.out.println(number));
    }

}
