package yjw.hash;

public class Main {

    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        CompletePersonProcess process = new CompletePersonProcess();
        String answer = process.solution(participant, completion);
        System.out.println(answer);
    }
}
