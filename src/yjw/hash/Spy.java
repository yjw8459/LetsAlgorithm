package yjw.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Spy {

    public int solution(String[][] clothes){
        int answer = 0;
        answer += clothes.length;   //갯수 더하기
        Map<String, List<String>> sortMap = new HashMap<>();

        for (String[] item: clothes) {
            boolean check = false;
            Loof2 :
            for (String clothesName:sortMap.keySet()) {
                if (clothesName.equals(item[1])){
                    check = true;
                    sortMap.get(clothesName).add(item[0]);
                    break Loof2;
                }
            }
            if ( ! check ){
                List<String> list = new ArrayList<>();
                list.add(item[0]);
                sortMap.put(item[1], list);
            }
        }

        return answer;
    }

}
