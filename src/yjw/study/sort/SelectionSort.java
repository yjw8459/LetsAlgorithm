package yjw.study.sort;

import java.util.Arrays;

/**
 * 선택 정렬
 */
public class SelectionSort {

    public static void selectionSort(int[] nums){
        int length = nums.length - 1;
        for ( int i = 0; i < length; i ++ ){
            int min = nums[i];
            int position = i;
            for ( int j = i + 1; j < nums.length; j++ ){
                if ( nums[j] < min )  {
                    min = nums[j];
                    position = j;
                }
            }
            nums[position] = nums[i];
            nums[i] = min;
        }

        Arrays.stream(nums).forEach(System.out::println);
    }


    public static void main(String[] args) {
        int[] test = { 5, 4, 3, 2, 1 };
        selectionSort(test);
    }

}
