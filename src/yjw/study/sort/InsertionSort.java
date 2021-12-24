package yjw.study.sort;


import java.util.Arrays;

/**
 * 삽입정렬
 */
public class InsertionSort {

    public static int[] solution(int[] nums){
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int position = i - 1;
            while ( position >= 0 ){
                if ( nums[position] > temp )   {    //기준 값과 비교 값 중 비교 값이 클 경우
                    nums[position + 1] = nums[position];    //비교 값을 한 칸 당겨서 삽입
                    position = position - 1;                //비교 값 교체
                }
                else break;
            }
            nums[position + 1] = temp;
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, 3, 2, 1 };
        solution(nums);
    }

}
