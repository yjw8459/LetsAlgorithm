package yjw.hash;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 공식 외우기
 */
public class Spy {

    public int solution(String[][] clothes){
        /**
         * 초기 값 : 1
         */
        int answer = 1;
        Map<String, Integer> sortMap = new HashMap<>();
        for (String[] closet:clothes) {
            String clothesDiv = closet[1];
            if ( sortMap.get(clothesDiv) == null )  sortMap.put(clothesDiv, 0);
            sortMap.put(clothesDiv, sortMap.get(clothesDiv) + 1);
        }

        /**
         * 값 : 값 * 항목의 갯수 + 1
         * 항목의 가짓 수 만큼 반복
         */
        Iterator<Integer> it = sortMap.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }

        /**
         * 리턴 값 : 값 -1
         */
        return answer-1;
    }

}
