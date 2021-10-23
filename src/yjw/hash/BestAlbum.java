package yjw.hash;


import java.util.*;

/**
 * 스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다.
 * 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.
 *
 * 속한 노래가 많이 재생된 장르를 먼저 수록합니다.
 * 장르 내에서 많이 재생된 노래를 먼저 수록합니다.
 * 장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
 * 노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때,
 * 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.
 *
 * genres : 장르
 * plays : 노래가 재생된 횟수
 * genres와 plays의 배열의 길이는 같다. (1:1관계)
 *
 * return ex
 * ["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
 */
public class BestAlbum {

    public int[] solution(String[] genres, int[] plays){
        int[] answer = {};
        Map<String, List<Integer>> sortMap = new HashMap<>();

        //장르 별 재생횟수
        for (int i = 0; i < genres.length; i++){
            String genre = genres[i];
            int playCnt = plays[i];
            if( sortMap.get(genre) == null ){
                sortMap.put( genre, Arrays.asList(0, 0, 0));
            }
            System.out.println(sortMap.toString());
            sortMap.get(genre).set(0, sortMap.get(genre).get(0) + playCnt); //장르 별 재생 횟수 추가
            int firstPlays = sortMap.get(genre).get(1);
            int secondPlays = sortMap.get(genre).get(2);
            if ( playCnt > secondPlays ){
                sortMap.get(genre).set(2, playCnt);
            }
            if ( playCnt > firstPlays ){
                sortMap.get(genre).set(2, firstPlays);
                sortMap.get(genre).set(1, playCnt);
            }
        }


        Iterator<String> iterator = sortMap.keySet().iterator();
        while ( iterator.hasNext() ){
            String genre = iterator.next();
            if ( answer.length < 1 )    answer[0] = sortMap.get(genre).get(0);
            else {

            }
        }

        return answer;
    }

}
