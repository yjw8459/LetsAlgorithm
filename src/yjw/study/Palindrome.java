package yjw.study;

public class Palindrome {

    static void solution(){

        final String test = "kayak";
        int leftIndex = 0;
        int rightIndex = test.length() - 1;
        boolean result = true;
        while ( leftIndex < test.length() / 2 ){
            if ( ! test.substring(leftIndex, leftIndex + 1).equals(test.substring(rightIndex, rightIndex + 1)) )
                result = false;
            leftIndex ++;
            rightIndex --;
        }
        System.out.println(result);

    }

    public static void main(String[] args) {
        solution();
    }
}
