package yjw.study.search;


public class BinarySearch {

    public int solution(int searchValue){
        int answer = 0;
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int start = 0;
        int end = nums.length - 1;
        int cnt = 0;
        while ( start <= end ){
            cnt ++;
            int mid = (start + end) / 2;

            if ( nums[mid] == searchValue ) {
                answer = nums[mid];
                break;
            }
            else if ( nums[mid] > searchValue ) end = mid - 1;
            else if ( nums[mid] < searchValue ) start = mid + 1;
        }

        return answer;
    }

    public static void main(String[] args) {

        BinarySearch binary = new BinarySearch();
        binary.solution(9);
    }

}
