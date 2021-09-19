package yjw.hash;

public class Main {

    public static void main(String[] args) {
        String[] participant = {"유기정", "황재웅", "이주실", "유종원"};
        String[] completion = {"유기정", "황재웅", "유종원"};
        CompletePersonProcess process = new CompletePersonProcess();
        String answer = process.solution(participant, completion);
        System.out.println(answer);
    }
}
