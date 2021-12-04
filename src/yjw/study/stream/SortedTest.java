package yjw.study.stream;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortedTest {

    @Getter
    static class Student{
        String name;
        int age;
        int score;
        public Student(String name, int age, int score){
            this.name = name;
            this.age = age;
            this.score = score;
        }
    }

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("test1", 20, 40),
                new Student("test1", 21, 30),
                new Student("test1", 22, 20),
                new Student("test1", 23, 10)
        );
//        list.stream().sorted().forEach(s -> System.out.println(s.getScore()));
//        list.stream().sorted().forEach(s -> System.out.println(s.getScore()));
    }
}
