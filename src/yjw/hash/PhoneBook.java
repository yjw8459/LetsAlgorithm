package yjw.hash;

import java.util.HashMap;

public class PhoneBook {
    /*
            전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
            전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

            구조대 : 119
            박준영 : 97 674 223
            지영석 : 11 9552 4421
            전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때, 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

                    제한 사항
            phone_book의 길이는 1 이상 1,000,000 이하입니다.
                    각 전화번호의 길이는 1 이상 20 이하입니다.
                    같은 전화번호가 중복해서 들어있지 않습니다.
    */

    //내 답안 문제 좃같이 이해했음 ㅅㅂㅅㅂ 첫 글자만 비교하는 줄 ㅅㅂ
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            String standardNumber = phone_book[i];
            String firstStandardNumber = standardNumber.substring(0, 1);
            for (int j = i + 1; j < phone_book.length; j++) {
                String compareNumber = phone_book[j];
                String firstCompareNumber = compareNumber.substring(0, 1);
                if (firstStandardNumber.equals(firstCompareNumber))
                    return false;
            }
        }
        return answer;
    }

    public boolean solution2(String[] phone_book){
        boolean answer = true;
        // 1. HashMap 만들기
        HashMap<String, Integer> map = new HashMap<>();
        // 2. 모든 전화번호 Hashing 하기 (Hash Map에 추가하기)
        for(int i = 0; i < phone_book.length; i++) map.put(phone_book[i], i);
        // 3. 다시 돌며 각 전화번호의 일부가 HashMap에 있는지 확인하기 (접두어가 존재하는지 확인하기)
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 1; j < phone_book[i].length(); j++) {
                if(map.containsKey(phone_book[i].substring(0,j))) {
                    answer = false; return answer;
                }
            }
        }
        return answer;
    }

    }

