package yjw.study.stream;

import yjw.vo.Member;

import java.util.Arrays;
import java.util.List;

public class StreamPipeline {

    public static void test1(){
        List<Member> list = Arrays.asList(
                new Member("홍길동", Member.FEMAIL, 30),
                new Member("유종원", Member.MAIL, 27),
                new Member("천소영", Member.FEMAIL, 25),
                new Member("피이지", Member.MAIL, 50)
        );
        /**
         * MemberList에서 남자인 객체의 나이 값으로 평균 값을 구하는 파이프라인.
         */
        double ageAvg = list.stream().filter(m-> m.getSex() == Member.MAIL).mapToInt(Member::getAge)
                .average().getAsDouble();

    }

}
