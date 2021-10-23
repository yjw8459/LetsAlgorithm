package yjw.hash;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Spy {

    public int solution(String[][] clothes){
        int answer = 1;
        Map<String, Integer> sortMap = new HashMap<>();
        for (String[] closet:clothes) {
            String clothesDiv = closet[1];
            if ( sortMap.get(clothesDiv) == null )  sortMap.put(clothesDiv, 0);
            sortMap.put(clothesDiv, sortMap.get(clothesDiv) + 1);
        }

        Iterator<Integer> it = sortMap.values().iterator();
        while(it.hasNext()) {
            answer *= it.next().intValue()+1;
        }

        return answer-1;
    }

}
