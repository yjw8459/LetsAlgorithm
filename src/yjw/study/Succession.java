package yjw.study;

public class Succession {

    static int solution(int value){

        if ( value == 1 )   return value;

        return value * solution(value - 1);
    }

    public static void main(String[] args) {
        int result = solution(6);
        System.out.println(result);
    }

}
