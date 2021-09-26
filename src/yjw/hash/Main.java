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
        String[] phoneBook = {"12","223","3235","567","88"};
        PhoneBook pb = new PhoneBook();
        System.out.println(pb.solution(phoneBook));


    }
}
