package yjw.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CompletePersonProcess {
    /*
    * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

      마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한
      * 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

    제한사항
    마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
    completion의 길이는 participant의 길이보다 1 작습니다.
    참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
    참가자 중에는 동명이인이 있을 수 있습니다.

    * */


    public String solution(String[] participant, String[] completion) {
        //participant : 참가자
        //completion : 완주자
        String answer = "";
        List<String> participantList = new ArrayList<>(Arrays.asList(participant));
        List<String> completionList = new ArrayList<>(Arrays.asList(completion));

        Loof1 :
        for (int i = participantList.size()-1; i >= 0; i--){   //참가자
            String comparison1 = participantList.get(i);

            Loof2 :
            for ( int j = completionList.size()-1; j >= 0; j-- ){  // 완주자
                String comparison2 = completionList.get(j);
                if( comparison1.equals(comparison2) ){
                    completionList.remove(j);
                    participantList.remove(i);
                    break Loof2;
                }
            }
            if( participantList.size() == 1 ){
                answer = participantList.get(0);
                break Loof1;
            }
        }
        return answer;
    }

    public String solution2(String[] participant, String[] completion){
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);
        /*
        *   participant의 배열 값들을 hashMap 키 값으로 대입하고 value를 1로 모두 초기화
        *   Completion의 배열 값들을 key값과 대입해서 있는 key의 value만 -1 연산
        *   1인 값만 출력
        * */


        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }

    public String solution3(String[] participant, String[] completion){
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for (int i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                answer += participant[i];
                return answer;
            }
        }
        answer += participant[participant.length - 1];
        return answer;
    }


}
