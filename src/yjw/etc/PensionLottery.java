package yjw.etc;


import java.util.Random;

/**
 * 연금복권 번호 생성
 * 192182
 *
 * 12/06 248487
 *
 */
public class PensionLottery {

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(System.currentTimeMillis());
        System.out.print(random.nextInt(10));
        System.out.print(random.nextInt(10));
        System.out.print(random.nextInt(10));
        System.out.print(random.nextInt(10));
        System.out.print(random.nextInt(10));
        System.out.print(random.nextInt(10));

        random.setSeed(System.currentTimeMillis());
        System.out.println("조 : " + (random.nextInt(5) + 1));
    }

}
