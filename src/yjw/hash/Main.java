package yjw.hash;

public class Main {

    public static void main(String[] args) {


        //완주하지 못한 선수
//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//        CompletePersonProcess process = new CompletePersonProcess();
//        String answer = process.solution3(participant, completion);
//        System.out.println(answer);

        //전화번호부
        //String[] phoneBook = {"119", "97674223", "1195524421"};
//        String[] phoneBook = {"12","223","3235","567","88"};
//        PhoneBook pb = new PhoneBook();
//        System.out.println(pb.solution(phoneBook));

        //스파이
//        String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
//        Spy spy = new Spy();
//        int solution = spy.solution(clothes);
//        System.out.println(solution);

        //베스트 앨범
        //["classic", "pop", "classic", "classic", "pop"]	[500, 600, 150, 800, 2500]	[4, 1, 3, 0]
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        BestAlbum bestAlbum = new BestAlbum();
        bestAlbum.solution(genres, plays);

    }
}
