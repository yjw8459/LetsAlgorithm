package yjw.vo;

import lombok.Getter;

@Getter
public class Member {
    public static int MAIL = 0;
    public static int FEMAIL = 1;

    private String name;
    private int sex;
    private int age;

    public Member(String name, int sex, int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }



}
