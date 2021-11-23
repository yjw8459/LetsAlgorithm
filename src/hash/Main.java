package hash;

public class Main {

    public static void main(String[] args) {
//        String[] participant = {"유기정", "황재웅", "이주실", "유종원"};
//        String[] completion = {"유기정", "황재웅", "유종원"};
//        CompletePersonProcess process = new CompletePersonProcess();
//        String answer = process.solution(participant, completion);
//        System.out.println(answer);
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        //[4, 1, 3, 0]
        BestAlbum best = new BestAlbum();
        best.solution(genres, plays);
    }
}
