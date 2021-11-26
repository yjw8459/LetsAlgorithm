package yjw.study.collection;

import java.util.*;

public class CollectionsSort {

    static class ComparableTest
            implements Comparable<ComparableTest>
    {

        String name;
        int num;

        @Override
        public int compareTo(ComparableTest o) {
            if ( this.num > o.num )     return 1;
            else if( this.num < o.num ) return -1;
            else                        return 0;
        }
        @Override
        public String toString(){
            return String.valueOf(num);
        }

        public void setNum(int num){
            this.num = num;
        }
        public int getNum(int num){
            return num;
        }

        public ComparableTest(){}
        public ComparableTest(String name, int num){
            this.name = name;
            this.num = num;
        }
    }



    public static void study1(){

        class ComparatorTest implements Comparator<ComparableTest>{

            @Override
            public int compare(ComparableTest o1, ComparableTest o2) {
                return o1.num > o2.num ? 1 : o1.num < o2.num ? -1 : 0;
//            if (o1.num > o2.num)        return 1;
//            else if(o1.num < o2.num)    return -1;
//            else                        return 0;
            }
        }

        /**
         * 숫자는 값의 크기에 따라 정렬하고,
         * String의 경우는 사전편찬(자음 모음 순서)대로 정렬한다.
         */


        int[] arr = { 1, 2, 3 };
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        List<Integer> arrays = Arrays.asList(arr2);

        /**
         * 람다식을 이용한 컬렉션 소트
         *  a1 - a2일 경우 오름차순
         *  a2 - a1일 경우 내림차순
         */
        Collections.sort(arrays, (a1, a2) -> a2 - a1);  //내림차순
        System.out.println(arrays.toString());
        Collections.sort(arrays, (a1, a2) -> a1 - a2);  //오름차순
        System.out.println(arrays.toString());

        List<ComparableTest> test = new ArrayList<>();
        test.add(new ComparableTest("1", 1));
        test.add(new ComparableTest("2", 2));
        test.add(new ComparableTest("3", 3));
        test.add(new ComparableTest("4", 4));
        test.add(new ComparableTest("5", 5));
        test.add(new ComparableTest("6", 6));
        test.add(new ComparableTest("7", 7));
        test.add(new ComparableTest("8", 8));
        test.add(new ComparableTest("9", 9));
        test.add(new ComparableTest("10", 10));

        /**
         * 클래스가 Comparable을 implement하고 compareTo를 오버라이딩 할 경우
         * 클래스 안의 compareTo를 찾아서 조건으로 사용한다.
         */
        System.out.println("tetete");
        Collections.sort(test);
        System.out.println(test);

        /**
         * 클래스가 Comparable을 implement하지 않을 경우
         * Comparator를 implement하고 compare메소드를 Override한 조건이 명시된 클래스의 인스턴스를 Collections에
         * 전달해야한다.
         */
        Collections.sort(test, new ComparatorTest());
        System.out.println(test.toString());
    }


}

