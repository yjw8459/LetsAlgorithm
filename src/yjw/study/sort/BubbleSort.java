package yjw.study.sort;

import java.util.Arrays;

/**
 * 버블 정렬
 *
 * O(N제곱)
 * 데이터 수가 5개일 경우 = (4+3+2+1) x 2 = O(N제곱)
 *
 * 동작 구조를 이해할 것.
 *
 */
public class BubbleSort {

    //정렬 여부를 체크하는 것, 반복 시 마다 탐색범위를 줄이는 것이 포인트
    public static int[] bubbleSort(int[] nums){
        int repeat = nums.length -1;
        boolean sorted = false;                 //교환이 일어났는 지 여부
        while ( ! sorted ){
            sorted = true;
            for (int i = 0; i < repeat; i++) {
                if ( nums[i] > nums[i+1] ){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;           // 교체 Swap
                    sorted = false;             //교체된 경우 정렬 여부체크
                }
            }
            repeat -= 1;                        //반복 1회마다 한 자리씩 맞춰지기 때문에 탐색 범위 한정
        }
        Arrays.stream(nums).forEach(System.out::println);
        return nums;
    }


    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        bubbleSort(nums);
    }

}
